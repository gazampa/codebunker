package org.gazampa.datastructures;

import java.util.Arrays;
import java.util.Comparator;
import stopwatch.StopWatch;

class ArrayExample{

	/**
	*	Arrays are :
	*					- elements grouped logically next to each other in memory
	*					- fixed size, segmented out at compile time
	*					- primitives can be elements
	*					- indexed, random access
	*					- Unsynchronized
	*					- sortable : quicksort for primitives as they have no identity:  Tim Peters's list sort for Python ( TimSort)
	*					- The add operation runs in amortized constant time, that is, adding n elements requires O(n) time
	*					- retrieving an element from an index is fast.
	*					- removing an element wont change the array size, you would mask the value out
	*					- in modern practice, a lot depends on the compiler and chip implementation, make sure to test
	**/

	public static void main(String[] args){

		int[] array = new int[1000000];

		StopWatch count = new StopWatch();

		count.start();

		for (int i=0, j = 1000000; i < j; i++){
			Integer number = (int)( Math.random() * j );
			array[i] = number;
		}

		count.stopAndReport();

		count.restart();

		Arrays.sort( array );

		count.stopAndReport();

		count.restart();

		reverse(array);

		count.stopAndReport();

		count.restart();

		for (int i = 0,j = 500000; i < j; i++){
			if ( i == 499999) array[i] = -1;
		}

		count.stopAndReport();

		count.restart();

		array[500000] = -1;

		count.stopAndReport();

	}

	private static void reverse(int[] arr){
		int tmp;
		for ( int i = 0, j = arr.length-1, k=arr.length/2; i < k; i++, j-- ){
			tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
		}
	}

}
