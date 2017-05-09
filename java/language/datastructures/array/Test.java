import java.util.Arrays;

public class Test{

	public static void main(String args[]){

 		int[] arr = {2,6,4,9,8,1,3,5,7,0};

		System.out.println(Arrays.toString(arr));

		ArrayImplWithInsertionSort i = new ArrayImplWithInsertionSort();
		i.setArray(arr);
		i.sort();

		System.out.println(Arrays.toString(arr));

	}


}