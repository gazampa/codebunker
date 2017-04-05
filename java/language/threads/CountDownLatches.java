import java.util.Arrays;
import java.util.concurrent.CountDownLatch;

 class CountDownLatches {

   void main() throws InterruptedException {
     final int numberOfThreads = 10;
     //CountDownLatch startSignal = new CountDownLatch(1);
     CountDownLatch doneSignal = new CountDownLatch(numberOfThreads);

     for (int i = 0; i < numberOfThreads; ++i) // create and start threads
       new Thread(new Worker(doneSignal)).start();


     doneSignal.await();           // wait for all to finish

     doFirstThing();            // don't let run yet
     //startSignal.countDown();      // let all threads proceed

     doSomethingElse();

     doOneLastThing();

   }

   private void doFirstThing(){
	   System.out.println("do first thing");
   }

   private void doSomethingElse(){
	   System.out.println("do something else");
   }

   private void doOneLastThing(){
	   System.out.println("one last thing");
   }



 }

 class Worker implements Runnable {
   //private final CountDownLatch startSignal;
   private final CountDownLatch doneSignal;

   Worker(CountDownLatch doneSignal) {
      //this.startSignal = startSignal;
      this.doneSignal = doneSignal;
   }

   public void run() {
      //try {
   //     startSignal.await();
        System.out.println(" I waited for the countdown ... ");
        doWork();
        doneSignal.countDown();
      //} catch (InterruptedException ex) {} // return;
   }

   void doWork() {

	   int[] array = new int[1000];

       for(int i = 0; i < array.length; i++)
	   { // randomize population using generic randomization
			array[i] = (int)(Math.random() * array.length);
	   }

		Arrays.sort(array);

   }

 }