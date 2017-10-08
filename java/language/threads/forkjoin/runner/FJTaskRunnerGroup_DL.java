 package EDU.oswego.cs.dl.util.concurrent;

 import java.io.PrintStream;
 import java.util.concurrent.Executor;
 import java.util.concurrent.ConcurrentLinkedQueue;

 public class FJTaskRunnerGroup implements Executor
 {
   protected final FJTaskRunner[] threads;
   protected final ConcurrentLinkedQueue<FJTask> entryQueue = new ConcurrentLinkedQueue<>();

   protected int activeCount = 0;

   protected int nstarted = 0;
   static final boolean COLLECT_STATS = true;
   long initTime = 0L;

   int entries = 0;
   static final int DEFAULT_SCAN_PRIORITY = 2;
   static final long SCANS_PER_SLEEP = 15L;
   static final long MAX_SLEEP_TIME = 100L;

   public FJTaskRunnerGroup(int groupSize)
   {
     this.threads = new FJTaskRunner[groupSize];
     initializeThreads();
     this.initTime = System.currentTimeMillis();
   }

   public void execute(Runnable r)
   {
     if ((r instanceof FJTask)) {
       this.entryQueue.add((FJTask)r);
     }
     else {
       this.entryQueue.add(new FJTask.Wrap(r));
     }
     signalNewTask();
   }

   public void executeTask(FJTask t)
   {
     try
     {
/* 199 */       this.entryQueue.add(t);
/* 200 */       signalNewTask();
     }
     catch (Exception ex) {
/* 203 */       Thread.currentThread().interrupt();
     }
   }

   public void invoke(Runnable r)
     throws InterruptedException
   {
/* 215 */     InvokableFJTask w = new InvokableFJTask(r);
/* 216 */     this.entryQueue.add(w);
/* 217 */     signalNewTask();
/* 218 */     w.awaitTermination();
   }

   public void interruptAll()
   {
/* 237 */     Thread current = Thread.currentThread();
/* 238 */     boolean stopCurrent = false;

/* 240 */     for (int i = 0; i < this.threads.length; i++) {
/* 241 */       Thread t = this.threads[i];
/* 242 */       if (t == current)
/* 243 */         stopCurrent = true;
       else
/* 245 */         t.interrupt();
     }
/* 247 */     if (stopCurrent)
/* 248 */       current.interrupt();
   }

   public synchronized void setScanPriorities(int pri)
   {
/* 260 */     for (int i = 0; i < this.threads.length; i++) {
/* 261 */       FJTaskRunner t = this.threads[i];
/* 262 */       t.setScanPriority(pri);
/* 263 */       if (t.active) continue; t.setPriority(pri);
     }
   }

   public synchronized void setRunPriorities(int pri)
   {
/* 277 */     for (int i = 0; i < this.threads.length; i++) {
/* 278 */       FJTaskRunner t = this.threads[i];
/* 279 */       t.setRunPriority(pri);
/* 280 */       if (!t.active) continue; t.setPriority(pri);
     }
   }

   public int size()
   {
/* 288 */     return this.threads.length;
   }

   public synchronized int getActiveCount()
   {
/* 298 */     return this.activeCount;
   }

   public void stats()
   {
/* 368 */     long time = System.currentTimeMillis() - this.initTime;
/* 369 */     double secs = time / 1000.0D;
/* 370 */     long totalRuns = 0L;
/* 371 */     long totalScans = 0L;
/* 372 */     long totalSteals = 0L;

/* 374 */     System.out.print("Thread\tQ Cap\tScans\tNew\tRuns\n");

/* 381 */     for (int i = 0; i < this.threads.length; i++) {
/* 382 */       FJTaskRunner t = this.threads[i];
/* 383 */       int truns = t.runs;
/* 384 */       totalRuns += truns;

/* 386 */       int tscans = t.scans;
/* 387 */       totalScans += tscans;

/* 389 */       int tsteals = t.steals;
/* 390 */       totalSteals += tsteals;

/* 392 */       String star = getActive(t) ? "*" : " ";

/* 395 */       System.out.print("T" + i + star +
/* 396 */         "\t" + t.deqSize() +
/* 397 */         "\t" + tscans +
/* 398 */         "\t" + tsteals +
/* 399 */         "\t" + truns +
/* 400 */         "\n");
     }

/* 403 */     System.out.print("Total\t    \t" +
/* 405 */       totalScans +
/* 406 */       "\t" + totalSteals +
/* 407 */       "\t" + totalRuns +
/* 408 */       "\n");

/* 410 */     System.out.print("Execute: " + this.entries);

/* 412 */     System.out.print("\tTime: " + secs);

/* 414 */     long rps = 0L;
/* 415 */     if (secs != 0.0D) rps = Math.round(totalRuns / secs);

     System.out.println("\tRate: " + rps);
   }

   protected FJTaskRunner[] getArray()
   {
     return this.threads;
   }

   protected FJTask pollEntryQueue()
   {
     try
     {
       FJTask t = this.entryQueue.poll();
       return t;
     }
     catch (Exception ex) {
       Thread.currentThread().interrupt();
     }return null;
   }

   protected synchronized boolean getActive(FJTaskRunner t)
   {
     return t.active;
   }

   protected synchronized void setActive(FJTaskRunner t)
   {
/* 466 */     if (!t.active) {
/* 467 */       t.active = true;
/* 468 */       this.activeCount += 1;
/* 469 */       if (this.nstarted < this.threads.length)
/* 470 */         this.threads[(this.nstarted++)].start();
       else
/* 472 */         notifyAll();
     }
   }

   protected synchronized void setInactive(FJTaskRunner t)
   {
/* 481 */     if (t.active) {
/* 482 */       t.active = false;
/* 483 */       this.activeCount -= 1;
     }
   }

   protected synchronized void checkActive(FJTaskRunner t, long scans)
   {
     setInactive(t);
     try
     {
       if ((this.activeCount == 0) && (this.entryQueue.peek() == null)) {
         wait();
       }
       else
       {
         long msecs = scans / 15L;
         if (msecs > 100L) msecs = 100L;
         int nsecs = msecs == 0L ? 1 : 0;
         wait(msecs, nsecs);
       }
     }
     catch (InterruptedException ex) {
       notify();
       Thread.currentThread().interrupt();
     }
   }

   protected synchronized void signalNewTask()
   {
     this.entries += 1;
     if (this.nstarted < this.threads.length)
       this.threads[(this.nstarted++)].start();
     else
       notify();
   }

   protected void initializeThreads()
   {
     for (int i = 0; i < this.threads.length; i++) this.threads[i] = new FJTaskRunner(this);
   }

   protected static final class InvokableFJTask extends FJTask
   {
     protected final Runnable wrapped;
     protected boolean terminated = false;

     protected InvokableFJTask(Runnable r) { this.wrapped = r; }

     public void run() {
       try {
         if ((this.wrapped instanceof FJTask))
           FJTask.invoke((FJTask)this.wrapped);
         else
           this.wrapped.run();
       }
       finally {
         setTerminated();
       }
     }

     protected synchronized void setTerminated() {
       this.terminated = true;
       notifyAll();
     }

     protected synchronized void awaitTermination() throws InterruptedException {
       while (!this.terminated) wait();
     }
   }
 }

/* Location:           /home/mnovotny/projects/EMBEDDED_JBOSS_BETA3_COMMUNITY/embedded/output/lib/embedded-jboss/lib/thirdparty-all.jar
 * Qualified Name:     EDU.oswego.cs.dl.util.concurrent.FJTaskRunnerGroup
 * JD-Core Version:    0.6.0
 */