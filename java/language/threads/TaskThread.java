public class TaskThread extends Thread{

	private ThreadPool pool;

	public TaskThread(ThreadPool thePool){
		pool = thePool;
	}

	public void run(){
		while( true ){
			// blocks until job
			Runnable job = pool.getNext();
			try{
				job.run();
				System.out.println("The List was read by : " + this.toString());
			}catch(Exception e){
				System.err.println("Job Exception: "+e);
			}
		}
	}
}