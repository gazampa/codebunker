class Client{

	public static void main(String[] args){
		CountDownLatches d = new CountDownLatches();

		try{
			d.main();
		}catch(InterruptedException ie){
			System.out.println(" ..thread interupted");
		}
	}

}