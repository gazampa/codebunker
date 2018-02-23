package datastructures;

import java.util.Arrays;
public class BinarySearch{

	/** donald knuth search : sort array and jump to where search element is most likely to be located **/

	private int[] elements = {1,4,8,3,9,4,7,2,0,21,78,10,62,84,34,83,36,63,82,24};

	public BinarySearch(){ sort(); }

	private void sort(){
		Arrays.sort(elements);
	}

	public int search(int n){
		int lo = 0;
		int hi = elements.length - 1;
		int mid;
		int control = 0;

		while ( lo <= hi ) {

			if ( n == elements[lo] ) return lo;

			mid = lo + ( hi - lo ) / 2;

			System.out.print(lo + " : " + hi + " : " + mid + " - ");

			if ( n > elements[mid] ){
				lo = mid + 1;
				System.out.println(n + " is greater than : " + elements[mid] + " so search in higher indexes " + lo);
			}else if ( n < elements[mid] ){
				hi = mid - 1;
				System.out.println(n + " is less than : " + elements[mid] + " so search in lower indexes " + hi);
			}else{
				return mid;
			}

			System.out.println(Arrays.toString(elements));

			control++;
			if (control > 50) break;

		}

		return -1;
	}

	public static void main(String args[]){

		BinarySearch bs = new BinarySearch();

		bs.search(5);

	}

}