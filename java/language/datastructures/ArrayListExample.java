package org.gazampa.datastructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import stopwatch.StopWatch;
class ArrayListExample{

	/**
	*	Arraylists are :
	*					- elements grouped logically next to each other in memory
	*					- Resizeable, indexed, random access
	*					- Unsynchronized
	*					- sortable : stable, adaptive, iterative mergesort :  Tim Peters's list sort for Python ( TimSort)
	*					- The add operation runs in amortized constant time, that is, adding n elements requires O(n) time
	*					- the growth policy is not specified, adding an element is amortized
	*					- deleting items from an arraylist is slow as the back up array needs to be shifted around
	*					- retrieving an element from an index is fast.
	*					- in modern practice, a lot depends on the compiler and chip implementation, make sure to test
	**/

	public static void main(String[] args){

		ArrayList<Integer> arrayList = new ArrayList<Integer>(100);

		StopWatch count = new StopWatch();

		count.start();

		for (int i=0, j = 1000000; i < j; i++){
			Integer number = (int)( Math.random() * j );
			arrayList.add(new Integer(number));
		}

		count.stopAndReport();

		count.restart();

		Collections.sort( arrayList );

		count.stopAndReport();

		count.restart();

		Collections.sort( arrayList, new DescOrder() );

		count.stopAndReport();

		count.restart();

		for (int i = 0,j = 500000; i < j; i++){
			if ( i == 499999) arrayList.remove(i);
		}

		count.stopAndReport();

		count.restart();

		arrayList.remove(500000);

		count.stopAndReport();

	}

}

class DescOrder implements Comparator<Integer>{
	public int compare(Integer o1, Integer o2){
		return o2.compareTo(o1);
	}
}

