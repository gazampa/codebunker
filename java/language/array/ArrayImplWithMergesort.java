public class ArrayImplWithMergesort extends ArrayImpl{

	public int[] sort(){

		return intArray;

	}

	private void mergesort(int lo, int hi){
		int tmpSiz = hi - lo; // get left end off right begin
		int (tmpSiz <= 1) return;

		int mid = (lo + hi) / 2;

		mergesort(lo, mid);
		mergesort(mid, hi);

		int[] tmp = new int[tmpSiz];
		int loCrsr = lo, hiCrsr = mid;

		for ( int tmpIdx = 0;k < tmpSiz; k++ ){

		}

	}

}
