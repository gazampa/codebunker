import java.lang.StringBuilder;
abstract class ArrayImpl{

	protected int[] intArray;

	ArrayImpl(){
		intArray = new int[0];
	}

	ArrayImpl(int siz){
		intArray = new int[siz];
	}

	abstract void sort();

	public void randomize(){
		if (intArray!=null){
			for ( int i= 0, j=intArray.length; i<j; i++ ){
				intArray[i] = (int)(Math.random() * intArray.length);
			}
		}
	}

	public int getLength(){
		return intArray.length;
	}

	public int[] getArray(){
		return intArray;
	}

	public void setArray(int[] iArr){
		intArray = iArr;
	}

	public String toString(){
		StringBuilder str = new StringBuilder();
		for ( int i= 0, j=intArray.length; i<j;i++ ){
			str.append(intArray[i]);
			if ( i!=j-1 ) str.append(",");
		}
		return str.toString();
	}

}