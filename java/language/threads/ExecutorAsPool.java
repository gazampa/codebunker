import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class ExecutorAsPool{

    public static void main(String[] args) {

		final int numberOfTasks = 100;
		final int arraySize = 10;

        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int i = 0; i < numberOfTasks; i++) {

            Thread thread = new ThreadImpl(arraySize);

            executor.execute(thread);

          }

        executor.shutdown();

		try {
			executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
		} catch (InterruptedException e) {
			System.out.println("The xecutor has not left the building");
		}

        while (!executor.isTerminated()) {
			System.out.println("Shutting Down Executor");
        }

        System.out.println("Finished");

    }

}