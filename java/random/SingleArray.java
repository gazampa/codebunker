package structure;
public class SingleArray{

	public static void main(String[] args){
		int[] arrInt = {1,2,3,4,5,6,7,8,9,0};

		boolean found = false;

		found =  LinearSearch(5, arrInt);

		System.out.println("Linear Found : " + found);
	
		found = BinarySearch(8, arrInt);

		System.out.println("Binary Found : " + found);

		int[] arrIntUnorder = {10,25,3,74,5,65,17,38,29,90};

		quicksort(0,arrIntUnorder.length-1, arrIntUnorder);

		for (int i = 0; i < arrIntUnorder.length; i++){
			System.out.println(arrIntUnorder[i]);
		}
	}	

	/** average search time is length / 2 **/
	public static boolean LinearSearch(int srch, int[] arr){
		boolean result = false;
		for (int i = 0; i<arr.length; i++){
			if ( srch==arr[i] ){
				result = true;
			}
		}
		return result;
	}
	
	/** must be  a sorted array **/
	public static boolean BinarySearch(int srch, int[] arr){
		boolean result = false;

		int lo = 0;int hi = arr.length -1;int mid;

		while ( lo <= hi ) {
			mid = ( lo + hi ) / 2;
			if ( srch > arr[mid] ){
				lo = mid + 1;
			} else if ( srch < arr[mid] ){
				hi = mid -1;
			}else if ( srch == arr[mid] ){
				result = true;
				break;
			}
			if ( lo >= hi ) { 
				break;
			}
		}

		return result;
	}

	/** shuffle max elements to end of array **/
	public static void BubbleSort(int[] arr){
		for ( int iLast=arr.length-1; iLast > 0 ; iLast--){
			for ( int iComp=0; iComp < iLast; iComp++){
				if (arr[iComp] > arr[iComp+1]){
					swap(iComp, iComp+1, arr);
				}
			}
		}
	}

	/** swap 2 elements **/
	private static void swap(int a, int b, int[] arr){
		int tmp;
		tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
	}

	private static void quicksort(int lo, int hi, int[] arr){
		int i = lo, j = hi;
		int pivot = arr[lo + (hi-lo)/2];

		while( i <= j){ // get first larger value on left
			while( arr[i] < pivot ){
				i++;
			} // get next smaller value on right
			while( arr[j] > pivot ){
				j--;
			} // swap them
			if ( i <= j ){
				swap(i, j, arr);
				i++;
				j++;
			}
		}
		if ( lo < j )
			quicksort(lo, j, arr);
		if ( hi > i ) 
			quicksort(i, hi, arr);
	}
}
