import java.util.Queue;

public class MyWorker extends Thread {
    private static int instance = 0;
    private final Queue<Runnable> queue;

    public MyWorker(Queue queue) {
        this.queue = queue;
        setName("MyWorker:" + (instance++));
    }

    @Override
    public void run() {
        while ( true ) {
            try {
                Runnable work = null;

                synchronized ( queue ) {
                    while ( queue.isEmpty() )
                        queue.wait();

                    // Get the next work item off of the queue
                    work = queue.remove();
                }

                // Process the work item
                work.run();
            }
            catch ( InterruptedException ie ) {
                break;  // Terminate
            }
        }
    }

    private void doWork(Runnable work) { /*...*/ }
}