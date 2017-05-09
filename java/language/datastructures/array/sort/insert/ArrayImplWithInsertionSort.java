package org.gazampa.array.sort.insert;

import java.util.Arrays;
import org.gazampa.array.BaseArray;

public class ArrayImplWithInsertionSort extends BaseArray{

	public ArrayImplWithInsertionSort(int siz){
		super(siz);
	}

	public void sort(){

		insertionSort();

	}

	private void insertionSort(){
		int tmp;
		for ( int i = 1; i < intArray.length; i++ ){
			for ( int j = i; j > 0; j-- ){
				System.out.println(" loop iter ... " + i);
				if (intArray[j] < intArray[j-1]){
					System.out.println( "swapping a["+j+"] "+intArray[j] + " :: a["+(j-1)+"] "+intArray[j-1] );
					swap ( j, j-1 );
				}
				System.out.println(Arrays.toString(intArray));
			}
		}
	}

	private void insertionSortOptimized(){
		for (int i=1;i<intArray.length;i++){
			int tmp = intArray[i];
			int j;
			for( j=i-1; j >=0 && tmp <=intArray[j]; j--){
				intArray[j+1] = intArray[j];
			}
			intArray[j+1] = tmp;
		}
	}

	private void swap(int x, int y){
		int tmp;
		tmp = intArray[x];
		intArray[x] = intArray[y];
		intArray[y] = tmp;
	}

	private void moveLeft(int index){
		if (index <= 0 ) return;
		int tmp;
		tmp = intArray[index];
		intArray[index-1] =  intArray[index];
		intArray[index] = tmp;
	}

	private void moveRight(int index){
		if ( index >= intArray.length ) return;
		int tmp;
		tmp = intArray[index];
		intArray[index+1] =  intArray[index];
		intArray[index] = tmp;
	}

}