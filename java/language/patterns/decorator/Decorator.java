public class Decorator extends AbstractSwapDecorator{

	public int[] swap(){
		int[] result = new int [10];
		for ( int i=0,j=9;i<10;i++,j--){
			result[j]=intArray[i];
		}
		return result;
	}

}