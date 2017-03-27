public class ArrayImplWithQuicksort extends ArrayImpl implements SortableArray, Randomizable{

	private int callCounter = 0;

	public ArrayImplWithQuicksort(int siz){
		super(siz);
	}


	public void sort(){

		quicksort(0,intArray.length-1);

	}

	private void quicksort(int begin, int end){
		callCounter++;
		int pivotValue = intArray[( begin + (end-begin) / 2 )];
		System.out.println("pivot : " + pivotValue);
		int innerLo = begin, innerHi = end;
		System.out.println("comparing : " + innerLo + " <= " + innerHi);
		while( innerLo <= innerHi ){
			while( intArray[innerLo] < pivotValue ){
				innerLo++;
			}
			while(intArray[innerHi] > pivotValue ){
				innerHi--;
			}
			if (innerLo <= innerHi){
				System.out.println(" swapping : " + innerLo + " : " + innerHi + "  :  " + toString());
				swap( innerLo, innerHi );
				innerLo++;
				innerHi--;
			}
		}

		if ( begin < innerHi ){
			quicksort(begin, innerHi);
		}
		if ( end > innerLo ){
			quicksort(innerLo, end);
		}

	}

	private void swap(int i, int j){
		int tmp = intArray[j];
		intArray[j] = intArray[i];
		intArray[i] = tmp;
	}

	public int getCallCounter(){
		return callCounter;
	}

}

/**
algorithm quicksort(A, lo, hi) is
    if lo < hi then
        p := partition(A, lo, hi)
        quicksort(A, lo, p – 1)
        quicksort(A, p + 1, hi)

algorithm partition(A, lo, hi) is
    pivot := A[hi]
    i := lo - 1
    for j := lo to hi - 1 do
        if A[j] = pivot then
            i := i + 1
            swap A[i] with A[j]
    swap A[i+1] with A[hi]
    return i + 1
**/