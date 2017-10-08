public class Main_LinkedList{

	public static void main(String[] args){
		final String message[] = {"Reference List", "Christmas List", "Wish List","Best List", "Priority List", "A List"};

		ThreadPool pool = new ThreadPool(10);

		for( int i=0; i<5;i++ ){

			Runnable runner = new Runnable(){
				int taskNumber=0;
				public void run(){
					for (int j=0;j<message.length;j++){
						System.out.println("j : "+taskNumber+" : "+message[j]);
						taskNumber++;
					}
				}
			};

			pool.run(runner);
		}
	}
}