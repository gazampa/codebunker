public class TaskThread extends Thread{
	private ThreadPool pool;

	public TaskThread(ThreadPool thePool){
		pool = thePool;
	}

	public void run(){
		while(true){
			Runnable job = pool.getNext();
			try{
				job.run();
				System.out.print(this.getName()+" : ");
			} catch (Exception e){
				System.err.println("Job exception : "+e);
			}
		}
	}
}