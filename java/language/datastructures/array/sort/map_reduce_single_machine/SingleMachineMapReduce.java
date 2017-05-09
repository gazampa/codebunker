package org.gazampa.array.sort.mapreduce;
/**

Adapted from : http://jayantkumar.in/category/java/

**/
import java.util.*;
import java.util.concurrent.CountDownLatch;
import java.util.UUID;
public class SingleMachineMapReduce
{
	private int[] values;
	private int[][] intermediateResults;
	private int[] result;
	private	int totalNumberOfElements, totalNumberOfBuckets, bucketForRemainder;
	private boolean printDescription = false;

	public SingleMachineMapReduce(int n, int p){
		totalNumberOfElements = n;
		totalNumberOfBuckets = p;
		values = new int[totalNumberOfElements];
		intializeWithRandom();
		bucketForRemainder = (totalNumberOfElements % totalNumberOfBuckets!=0) ? 1 : 0;
		intermediateResults = new int[totalNumberOfBuckets+bucketForRemainder][];
	}

	public void init()
	{
		printToScreen(values);

		int[][] b = step1ConvertIntoBuckets(values, totalNumberOfBuckets);

//		printToScreen(b);

		step2RunMapFunctionForAllBuckets(b);

//		printToScreen(intermediateResults);

		result = step3RunReduceFunctionForAllBuckets(intermediateResults);

		printToScreen(result);

	}

	// break an array into a specifed number of sub arrays  ----> these would be sent out to worker nodes
	public int[][] step1ConvertIntoBuckets(int[] list, int numberOfBuckets){
		int n = list.length;
		int m = n / numberOfBuckets;
		int rem = n % numberOfBuckets;
		int majorIndex = 0;
		int extraBucket = (rem!=0) ? 1 : 0;
		int adjustedNumber = numberOfBuckets + extraBucket;
		int[][] buckets = new int[adjustedNumber][];
		int[] temp = new int[m];

		if (printDescription) System.out.println("BUCKETS");

		for(int i = 0, mx = buckets.length - extraBucket; i < mx; i++)
		{
			for(int j = 0; j < m; j++)
			{
				temp[j] = values[majorIndex];
				majorIndex++;
			}
			buckets[i] = temp;
			temp = new int[m];
		}
		if(rem != 0)
		{
			temp = new int[rem];
			for(int i = 0; i < rem; i++)
			{
				temp[i] = values[majorIndex];
				majorIndex++;
			}
			buckets[adjustedNumber-1] = temp;
		}

		System.out.println();
		return buckets;

	}

	// apply some logic to break units of work into some more desirable or descriptive state --- processing done on seperate machines
	public int[][] step2RunMapFunctionForAllBuckets(int[][] list)
	{
		CountDownLatch threadsFinished = new CountDownLatch(list.length);
		for(int i = 0; i < list.length; i++)
		{
			int[] elementList = list[i];
			new StartThread(elementList, i, threadsFinished).start();
		}

		try{
			threadsFinished.await();
		}catch(InterruptedException ie){System.out.println(" a thread was interrupted ....");}

		return intermediateResults;
	}

	// re organize the units to a more fully composed strucutre in a more manageable state,
	// here the original array is now partially sorted as it is composed of fully sorted sub arrays. -- its now quicker to sort
	public int[] step3RunReduceFunctionForAllBuckets(int[][] list)
	{
		int[] results = new int[totalNumberOfElements];
		int majorIndex = 0;
		int outerLength = list.length;
		for(int i=0; i < outerLength; i++)
		{
			int innerLength = list[i].length;
			for ( int j = 0;  j < innerLength ; j++ ){
				results[majorIndex] = list[i][j];
				majorIndex++;
			}

		}
		// sorting a partially sorted list using java library choice of sorts. - primitive array -- quicksort, depending on size
		Arrays.sort(results);

		return results;
	}

	class StartThread extends Thread
	{
		private int[] tempList;
		private final int majorIndex;
		private CountDownLatch countDownLatch;
		public StartThread(int[] list, int i, CountDownLatch latch)
		{
			tempList = list;
			majorIndex = i;
			countDownLatch = latch;
		}
		public void run()
		{
			Arrays.sort(tempList);
			int[] holder = new int[tempList.length];
//			synchronized(this) // not neccesary - each thread writes to a seperate index with ... //http://stackoverflow.com/questions/8978191/java-concurrency-writing-to-different-indexes-of-the-same-array
//			{
				intermediateResults[majorIndex] = tempList;
//			}
			countDownLatch.countDown();
		}

	}

	// randomize population using generic randomization
	private void intializeWithRandom(){
		for(int i = 0; i < totalNumberOfElements; i++)
		{
			values[i] = (int)(Math.random() * totalNumberOfElements);
		}
	}

	// convienince to print out array
	public void printToScreen(int[] array)
	{
		System.out.println(Arrays.toString(array));
	}

	// print out the data structure
	public void printToScreen(int[][] array)
	{
		System.out.println(array.length);
		for (int i = 0, j = array.length; i < j; i++){
			System.out.println(Arrays.toString(array[i]) +  " : " + array[i].length);
		}
	}

	public int[] getValues(){
		return Arrays.copyOf(values, values.length);
	}

	public int[] getResult(){
		return Arrays.copyOf(result, result.length);
	}

}
