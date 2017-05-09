package org.gazampa.array.sort.merge;

import java.util.Arrays;
import java.util.UUID;
import org.gazampa.array.BaseArray;

public class ArrayImplWithMergesort extends BaseArray{

	private int[] helper;

	public ArrayImplWithMergesort(int siz){
		super(siz);
	}

	public void sort(){
		this.helper = new int[intArray.length];
		mergesort(0, intArray.length-1, "INITIAL");
	}

	private void mergesort(int low, int high, String order) {
		String uniqueID = UUID.randomUUID().toString();
		//System.out.println(uniqueID + "  -  entering mergesort call ... " + order + " : " + low +  " < " + high);
		// check if low is smaller then high, if not then the array is sorted
		if (low < high) {
			// Get the index of the element which is in the middle
			int middle = low + (high - low) / 2;
			// Sort the left side of the array
			mergesort(low, middle, "LOW");
			// Sort the right side of the array
			mergesort(middle + 1, high, "HIGH");
			// Combine them both
			merge(low, middle, high, uniqueID);
		}
		//System.out.println(uniqueID + "  -  exiting mergesort call ... " + order + " : "  + low +  " < " + high);
	}

	private void merge(int low, int middle, int high, String uniqueId) {
		// Copy both parts into the helper array
		for (int i = low; i <= high; i++) {
			helper[i] = intArray[i];
		}

		//System.out.println(uniqueId + "  -  entering merge ... " + Arrays.toString(intArray) + " : " + Arrays.toString(helper));

		int i = low;
		int j = middle + 1;
		int k = low;
		// Copy the smallest values from either the left or the right side back
		// to the original array
		while (i <= middle && j <= high) {
			if (helper[i] <= helper[j]) {
				intArray[k] = helper[i];
				i++;
			} else {
				intArray[k] = helper[j];
				j++;
			}
			k++;
			System.out.println(uniqueId + "  -  switching ... " + Arrays.toString(intArray) + " : " + Arrays.toString(helper));
		}
		// Copy the rest of the left side of the array into the target array
		while (i <= middle) {
			intArray[k] = helper[i];
			k++;
			i++;
		}
		System.out.println(uniqueId + "  -  copying ... " + Arrays.toString(intArray) + " : " + Arrays.toString(helper));
	}

}
/**
	private void mergesort(int lo, int hi){
		int tmpSiz = hi - lo; // get left end off right begin
		if (tmpSiz <= 1) return;

		int mid = (lo + hi) / 2;

		mergesort(lo, mid);
		mergesort(mid, hi);

		int[] tmp = new int[tmpSiz];
		int loCrsr = lo, hiCrsr = mid;

		for ( int tmpIdx = 0;k < tmpSiz; k++ ){

		}

	}

**/