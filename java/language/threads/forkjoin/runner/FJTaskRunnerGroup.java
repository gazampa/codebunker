package threads.forkjoin.runner;

 import java.io.PrintStream;
 import java.util.concurrent.Executor;
 import java.util.concurrent.ConcurrentLinkedQueue;
 import threads.forkjoin.runner.FJTask;
 public class FJTaskRunnerGroup implements Executor
 {
    protected final TaskRunner[] threads; // thread pool
    protected final ConcurrentLinkedQueue<FJTask> entryQueue = new ConcurrentLinkedQueue<>(); // task queue <-- how is this consumed : threads need notification not polling

    protected int activeCount = 0;
    protected int nstarted = 0;
    long initTime = 0L;
    int entries = 0;

	public FJTaskRunnerGroup(){
		threads = new TaskRunner[5];
		for ( int i = 0, j = 5; i < j; i++ ){
			threads[i] = new TaskRunner(this);
		}
	}
	 // adds task to a central queue
	public void execute(final Runnable r) {

		entryQueue.add((FJTask)r);

	}

	public void executeTask(final FJTask t) {

		entryQueue.add(t);
		signalNewTask();
	}

    protected FJTask pollEntryQueue() {
      try {
        FJTask t = this.entryQueue.poll();
        return t;
      } catch (Exception ex) {
        Thread.currentThread().interrupt();
      }return null;
    }

    protected synchronized void setInactive(TaskRunner t)
    {

      if (t.active) {
        t.active = false;
        this.activeCount -= 1;
      }

    }

	public int getSize(){
		return entryQueue.size();
	}

    protected synchronized void signalNewTask()
    {
      if (this.nstarted < this.threads.length)
        this.threads[(this.nstarted++)].start();
      else
        notify();
    }

	public void closeDown(){
		for (int i = 0, j = threads.length; i < j; i++){
			threads[i].interrupt();
		}
	}


}