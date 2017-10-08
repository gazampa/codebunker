class Wombat implements Runnable{

	private int i;
	public synchronized void run(){
		if ( i%5 !=0 ){ i++; }
		for (int x=0;x<5;x++,i++){
			if (x>1) Thread.yield();
		}
		System.out.print(i + " ");
	}

	public static void main(String[] args){
		Wombat n = new Wombat();
		for(int x=100;x>0;--x){
			new Thread(n).start();
		}
	}
}