/** Josuhua Bloch Enum Implementation **/
import java.util.Arrays;
public enum BlochSingleton{

	INSTANCE;

	private final int[] numbers = {0,1,2,3,4,5,6,7,8,9};

	public void countTo9(){
		System.out.println(Arrays.toString(numbers));

	}

}