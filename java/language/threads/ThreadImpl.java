import java.util.Arrays;
class ThreadImpl extends Thread{

	final int sz;
	int[] intArr;

	public ThreadImpl(int n){
		sz = n;
		intArr = new int[sz];
	}

	public void run(){
		randomize(intArr);
		Arrays.sort(intArr);
		System.out.println(Thread.currentThread().getName() + " : " + Arrays.toString(intArr));
	}

	public void randomize(int[] array){
		for ( int i = 0; i < sz; i++ ){
			array[i] = (int) ( Math.random() * sz );
		}
	}

}