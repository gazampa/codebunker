package threads.forkjoin.runner.queue;

import java.util.Arrays;
import threads.forkjoin.task.iface.Element;
public class QueueWrapper{

    protected static final int INITIAL_CAPACITY = 4;
    protected static final int MAX_CAPACITY = 1073741824;
	VolatileElementRef[] deq = VolatileElementRef.newArray(INITIAL_CAPACITY);
    protected volatile int top = 0; // [E ,E ,E ,E ,E ,E ,E( top )]
    protected volatile int base = 0; // [, , ,E(base) ,E ,E ,E( top )]
    protected final Object barrier = new Object(); // used to ensure singular access

	public QueueWrapper(){}

	public QueueWrapper(int capacity){
		deq = VolatileElementRef.newArray(capacity);
	}

    public final void push(Element r)
    {
      int t = this.top;
      System.out.println(this.base & this.deq.length - 1);
      if (t < (this.base & this.deq.length - 1) + this.deq.length) //( A & B) counts in base of queue length
      {
        this.deq[(t & this.deq.length - 1)].put(r);
        this.top = (t + 1);
      }
      else
      {
        slowPush(r);
      }
    }

    protected synchronized void slowPush(Element r)
    {
      checkOverflow();
      push(r);
    }

	// re index or grow array
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
       VolatileElementRef[] newdeq = new VolatileElementRef[newcap];

       for (int j = 0; j < oldcap; j++) newdeq[j] = this.deq[(b++ & oldcap - 1)];

       for (int j = oldcap; j < newcap; j++) newdeq[j] = new VolatileElementRef();

       this.deq = newdeq;
       this.base = 0;
       this.top = newTop;
     }
   }
   // takes an element from the base of the queue, leave element in queue
   protected final synchronized Element take()
   {
     int b = this.base++;
     if (b < this.top) {
       return confirmTake(b);
     }

     this.base = b;
     return null;
   }

   protected Element confirmTake(int oldBase)
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

   public final Element pop()
   {
     int t = --this.top;
   	 System.out.println("popping " + t);
     if (this.base + 1 < t) {
       return this.deq[(t & this.deq.length - 1)].take();
     }
     return confirmPop(t);
   }

   protected final synchronized Element confirmPop(int provisionalTop)
   {
     if (this.base <= provisionalTop) {
       return this.deq[(provisionalTop & this.deq.length - 1)].take();
     }

     this.top = (this.base = 0);
     return null;
   }

   protected final synchronized void put(Element r)
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

	public int getTop(){return top;} public int getBase(){ return base; }


   protected static final class VolatileElementRef
   {
     protected volatile Element ref;

     protected final void put(Element r)
     {
       this.ref = r;
     }

     protected final Element get() { return this.ref; }
     protected final Element take() {
       Element r = this.ref; this.ref = null; return r;
     }

     protected static VolatileElementRef[] newArray(int cap)
     {
       VolatileElementRef[] a = new VolatileElementRef[cap];
       for (int k = 0; k < cap; k++) a[k] = new VolatileElementRef();
       return a;
     }
   }

	public int getSize(){
		return deq.length;
	}

	public void printArray(){
		System.out.print(Arrays.toString(deq));
	}


}