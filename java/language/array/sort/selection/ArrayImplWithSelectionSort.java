package org.gazampa.array.sort.selection;

import org.gazampa.array.BaseArray;

public class ArrayImplWithSelectionSort extends BaseArray{

	public ArrayImplWithSelectionSort(int siz){
		super(siz);
	}

	public void sort(){
		selectionSort();
	}

	private void selectionSort(){
		int tmp, minIndex;
		for ( int i = 0, n = intArray.length; i < n; i++ ){
			minIndex = i;
			for (int j=i+1; j < n; j++){
				if( intArray[j] < intArray[minIndex] ){
					minIndex = j;
				}
			}
			tmp = intArray[i];
			intArray[i] = intArray[minIndex];
			intArray[minIndex] = intArray[i];
		}
	}

	private int max(int start, int finish){
		int max = intArray[start];
		for (int i = start, j=finish; i<j; i++){
			if ( max < intArray[i] ){
				max = intArray[i];
			}
		}
		return max;
	}

	private int min(int start, int finish){
		int min = intArray[start];
		for (int i = start, j=finish; i<j; i++){
			if ( min < intArray[i] ){
				min = intArray[i];
			}
		}
		return min;
	}

}