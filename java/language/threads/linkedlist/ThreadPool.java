import java.util.LinkedList;

public class ThreadPool{
	private LinkedList tasks = new LinkedList();

	public ThreadPool(int size){
		for(int i=0;i<size;i++){
			Thread thread = new TaskThread(this);
			thread.start();
		}
	}

	public void run(Runnable task){
		synchronized(tasks){
			tasks.addLast(task);
			tasks.notify();
		}
	}

	public Runnable getNext(){
		Runnable returnVal = null;
		synchronized(tasks){
			while(tasks.isEmpty()){
				try{
					tasks.wait();
				} catch (InterruptedException ex){
					System.err.println("Interrupted");
				}
			}
			returnVal = (Runnable)tasks.removeFirst();
		}
		return returnVal;
	}

}