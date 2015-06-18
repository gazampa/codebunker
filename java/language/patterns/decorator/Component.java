import java.util.ArrayList;
import java.lang.Thread;
class Component{

	protected int[] intArray = {0,1,2,3,4,5,6,7,8,9};

	Component(){

	}

	public int getLength(){
		return intArray.length;
	}

	public void showElements(){
		for ( int element:intArray ){
			System.out.println(element);
		}
	}

}