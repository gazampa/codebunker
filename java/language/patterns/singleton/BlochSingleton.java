/** Josuhua Bloch Enum Implementation **/
import java.util.Arrays;
public enum BlochSingleton{

	NUMBERS;

	private BlochSingleton(){}

	private final int[] numbers = {0,1,2,3,4,5,6,7,8,9};

	// see Client.java : you can overwrite values in this array in the client as only the reference is final
	public int[] getNumbers(){
		return numbers;
	}

	public void countTo9(){
		System.out.println(Arrays.toString(numbers));

	}

}