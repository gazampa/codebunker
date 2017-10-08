 package EDU.oswego.cs.dl.util.concurrent;

 import java.util.Random;

 public class FJTaskRunner extends Thread
 {
   protected final FJTaskRunnerGroup group;
   protected static final int INITIAL_CAPACITY = 4096;
   protected static final int MAX_CAPACITY = 1073741824;
   protected VolatileTaskRef[] deq = VolatileTaskRef.newArray(4096);

   protected volatile int top = 0;

   protected volatile int base = 0;

   protected final Object barrier = new Object();

   protected boolean active = false;
   protected final Random victimRNG;
   protected int scanPriority = 2;
   protected int runPriority;
   static final boolean COLLECT_STATS = true;
   protected int runs = 0;

   protected int scans = 0;

   protected int steals = 0;

   protected FJTaskRunner(FJTaskRunnerGroup g)
   {
     this.group = g;
     this.victimRNG = new Random(System.identityHashCode(this));
     this.runPriority = getPriority();
     setDaemon(true);
   }

   protected final FJTaskRunnerGroup getGroup()
   {
     return this.group;
   }

   protected int deqSize()
   {
     return this.deq.length;
   }

   protected void setScanPriority(int pri)
   {
     this.scanPriority = pri;
   }

   protected void setRunPriority(int pri)
   {
     this.runPriority = pri;
   }

   protected final void push(FJTask r)
   {
     int t = this.top;

     if (t < (this.base & this.deq.length - 1) + this.deq.length)
     {
       this.deq[(t & this.deq.length - 1)].put(r);
       this.top = (t + 1);
     }
     else
     {
       slowPush(r);
     }
   }

   protected synchronized void slowPush(FJTask r)
   {
     checkOverflow();
     push(r);
   }

   protected final synchronized void put(FJTask r)
   {
     while (true)
     {
       int b = this.base - 1;
       if (this.top < b + this.deq.length)
       {
         int newBase = b & this.deq.length - 1;
         this.deq[newBase].put(r);
         this.base = newBase;

         if (b != newBase) {
           int newTop = this.top & this.deq.length - 1;
           if (newTop < newBase) newTop += this.deq.length;
           this.top = newTop;
         }
         return;
       }

       checkOverflow();
     }
   }

   protected final FJTask pop()
   {
     int t = --this.top;

     if (this.base + 1 < t) {
       return this.deq[(t & this.deq.length - 1)].take();
     }
     return confirmPop(t);
   }

   protected final synchronized FJTask confirmPop(int provisionalTop)
   {
     if (this.base <= provisionalTop) {
       return this.deq[(provisionalTop & this.deq.length - 1)].take();
     }

     this.top = (this.base = 0);
     return null;
   }

   protected final synchronized FJTask take()
   {
     int b = this.base++;

     if (b < this.top) {
       return confirmTake(b);
     }

     this.base = b;
     return null;
   }

   protected FJTask confirmTake(int oldBase)
   {
     synchronized (this.barrier) {
       if (oldBase < this.top)
       {
         return this.deq[(oldBase & this.deq.length - 1)].get();
       }

       this.base = oldBase;
       return null;
     }
   }

   protected void checkOverflow()
   {
     int t = this.top;
     int b = this.base;

     if (t - b < this.deq.length - 1)
     {
       int newBase = b & this.deq.length - 1;
       int newTop = this.top & this.deq.length - 1;
       if (newTop < newBase) newTop += this.deq.length;
       this.top = newTop;
       this.base = newBase;

       int i = newBase;
       do {
         this.deq[i].ref = null;
         i = i - 1 & this.deq.length - 1;

         if (i == newTop) break;
       }while (this.deq[i].ref != null);
     }
     else
     {
       int newTop = t - b;
       int oldcap = this.deq.length;
       int newcap = oldcap * 2;

       if (newcap >= 1073741824) {
         throw new Error("FJTask queue maximum capacity exceeded");
       }
       VolatileTaskRef[] newdeq = new VolatileTaskRef[newcap];

       for (int j = 0; j < oldcap; j++) newdeq[j] = this.deq[(b++ & oldcap - 1)];

       for (int j = oldcap; j < newcap; j++) newdeq[j] = new VolatileTaskRef();

       this.deq = newdeq;
       this.base = 0;
       this.top = newTop;
     }
   }

   protected void scan(FJTask waitingFor)
   {
     FJTask task = null;

     boolean lowered = false;

     FJTaskRunner[] ts = this.group.getArray();
     int idx = this.victimRNG.nextInt(ts.length);

     for (int i = 0; i < ts.length; i++)
     {
       FJTaskRunner t = ts[idx];
       idx++; if (idx >= ts.length) idx = 0;

       if ((t == null) || (t == this))
         continue;
       if ((waitingFor != null) && (waitingFor.isDone()))
       {
         break;
       }
       this.scans += 1;
       task = t.take();
       if (task != null) {
         this.steals += 1;
         break;
       }
       if (isInterrupted()) {
         break;
       }
       if (!lowered) {
         lowered = true;
         setPriority(this.scanPriority);
       }
       else {
         yield();
       }

     }

     if (task == null) {
       this.scans += 1;
       task = this.group.pollEntryQueue();
       if (task != null) this.steals += 1;
     }

     if (lowered) setPriority(this.runPriority);

     if ((task != null) && (!task.isDone())) {
       this.runs += 1;
       task.run();
       task.setDone();
     }
   }

   protected void scanWhileIdling()
   {
     FJTask task = null;

     boolean lowered = false;
     long iters = 0L;

     FJTaskRunner[] ts = this.group.getArray(); // gets the groups thread pool
     int idx = this.victimRNG.nextInt(ts.length);
     do
     {
       for (int i = 0; i < ts.length; i++)
       {
         FJTaskRunner t = ts[idx];
         idx++; if (idx >= ts.length) idx = 0;

         if ((t != null) && (t != this)) {
           this.scans += 1;

           task = t.take();
           if (task != null) {
             this.steals += 1;
             if (lowered) setPriority(this.runPriority);
             this.group.setActive(this);
             break;
           }
         }
       }

       if (task == null) {
         if (isInterrupted()) {
           return;
         }
         this.scans += 1;
         task = this.group.pollEntryQueue();

         if (task != null) {
           this.steals += 1;
           if (lowered) setPriority(this.runPriority);
           this.group.setActive(this);
         }
         else {
           iters += 1L;

           if (iters >= 15L) {
             this.group.checkActive(this, iters);
             if (isInterrupted())
               return;
           }
           else if (!lowered) {
             lowered = true;
             setPriority(this.scanPriority);
           }
           else {
             yield();
           }
         }
       }
     }
     while (task == null);

     if (!task.isDone()) {
       this.runs += 1;
       task.run();
       task.setDone();
     }
   }

   public void run()
   {
     try
     {
       while (!interrupted())
       {
         FJTask task = pop();
         if (task != null) {
           if (task.isDone())
             continue;
           this.runs += 1;
           task.run();
           task.setDone();
         }
         else
         {
           scanWhileIdling();
         }
       }
     } finally {
       //this.group.setInactive(this);
     }
   }

   protected final void taskYield()
   {
     FJTask task = pop();
     if (task != null) {
       if (!task.isDone()) {
         this.runs += 1;
         task.run();
         task.setDone();
       }
     }
     else
       scan(null);
   }

   protected final void taskJoin(FJTask w)
   {
     while (!w.isDone())
     {
       FJTask task = pop();
       if (task != null) {
         if (!task.isDone()) {
           this.runs += 1;
           task.run();
           task.setDone();
           if (task == w) return;
         }
       }
       else
         scan(w);
     }
   }

   protected final void coInvoke(FJTask w, FJTask v)
   {
     int t = this.top;
     if (t < (this.base & this.deq.length - 1) + this.deq.length)
     {
       this.deq[(t & this.deq.length - 1)].put(w);
       this.top = (t + 1);

       if (!v.isDone()) {
         this.runs += 1;
         v.run();
         v.setDone();
       }

       while (!w.isDone()) {
         FJTask task = pop();
         if (task != null) {
           if (!task.isDone()) {
             this.runs += 1;
             task.run();
             task.setDone();
             if (task == w) return;
           }
         }
         else
           scan(w);
       }
     }
     else
     {
       slowCoInvoke(w, v);
     }
   }

   protected void slowCoInvoke(FJTask w, FJTask v)
   {
     push(w);
     FJTask.invoke(v);
     taskJoin(w);
   }

   protected final void coInvoke(FJTask[] tasks)
   {
     int nforks = tasks.length - 1;

/* 924 */     int t = this.top;

/* 926 */     if ((nforks >= 0) && (t + nforks < (this.base & this.deq.length - 1) + this.deq.length)) {
/* 927 */       for (int i = 0; i < nforks; i++) {
/* 928 */         this.deq[(t++ & this.deq.length - 1)].put(tasks[i]);
/* 929 */         this.top = t;
       }

/* 933 */       FJTask v = tasks[nforks];
/* 934 */       if (!v.isDone()) {
/* 935 */         this.runs += 1;
/* 936 */         v.run();
/* 937 */         v.setDone();
       }

/* 942 */       for (int i = 0; i < nforks; i++) {
/* 943 */         FJTask w = tasks[i];
/* 944 */         while (!w.isDone())
         {
/* 946 */           FJTask task = pop();
/* 947 */           if (task != null) {
/* 948 */             if (!task.isDone()) {
/* 949 */               this.runs += 1;
/* 950 */               task.run();
/* 951 */               task.setDone();
             }
           }
           else
/* 955 */             scan(w);
         }
       }
     }
     else
     {
/* 961 */       slowCoInvoke(tasks);
     }
   }

   protected void slowCoInvoke(FJTask[] tasks)
   {
/* 969 */     for (int i = 0; i < tasks.length; i++) push(tasks[i]);
/* 970 */     for (int i = 0; i < tasks.length; i++) taskJoin(tasks[i]);
   }

   protected static final class VolatileTaskRef
   {
     protected volatile FJTask ref;

     protected final void put(FJTask r)
     {
       this.ref = r;
     }
     protected final FJTask get() { return this.ref; }
     protected final FJTask take() {
       FJTask r = this.ref; this.ref = null; return r;
     }

     protected static VolatileTaskRef[] newArray(int cap)
     {
       VolatileTaskRef[] a = new VolatileTaskRef[cap];
       for (int k = 0; k < cap; k++) a[k] = new VolatileTaskRef();
       return a;
     }
   }
 }

/* Location:           /home/mnovotny/projects/EMBEDDED_JBOSS_BETA3_COMMUNITY/embedded/output/lib/embedded-jboss/lib/thirdparty-all.jar
 * Qualified Name:     EDU.oswego.cs.dl.util.concurrent.FJTaskRunner
 * JD-Core Version:    0.6.0
 */