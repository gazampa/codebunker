package org.gazampa.datastructures;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.ListIterator;
import stopwatch.StopWatch;

class LinkedListExample{

	/**
	*	Linkedlists are :
	*					- each element is a node which contains the element and a pointer to the next element
	*					- takes up a little more space on account of the pointer info, especially doubly linked
	*					- Sequential Access that can grow in memory
	*					- Unsynchronized
	*					- sortable :
	*					- The add or retrieve operation is O(1) for head / tails and O(n) for into a sorted list
	*					- this involves rewriting the adjacent pointers
	*					- in modern practice, a lot depends on the compiler and chip implementation, make sure to test
	**/

	public static void main(String[] args){

		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		StopWatch count = new StopWatch();

		count.start();

		for ( int i=0, j=1000000; i<j; i++ ){
			Integer number = (int)( Math.random()*j );
			linkedList.addLast(new Integer(number));
		}

		count.stopAndReport();

		count.restart();

		Collections.sort(linkedList);

		count.stopAndReport();

		count.restart();

		Collections.sort(linkedList, new DescOrder());

		count.stopAndReport();

		count.restart();

		ListIterator<Integer> iter = linkedList.listIterator(0);

		for ( int i = 0, j = 500000; i < j; i++){
			iter.next();
			if ( i == 499999 ) iter.remove();
		}

		count.stopAndReport();

		count.restart();

		linkedList.remove(500000);

		count.stopAndReport();

	}

}

class DescOrder implements Comparator<Integer>{
	public int compare(Integer o1, Integer o2){
		return o2.compareTo(o1);
	}
}