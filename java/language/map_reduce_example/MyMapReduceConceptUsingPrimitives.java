/**

Adapted from : http://jayantkumar.in/category/java/

**/
import java.util.*;
import java.util.concurrent.CountDownLatch;
import java.util.UUID;
public class MyMapReduceConceptUsingPrimitives
{
	private int[] values;
	private int[][] intermediateResults;
	private int[] result;
	private	int totalNumberOfElements, totalNumberOfBuckets, bucketForRemainder;
	private boolean printDescription = false;

	public MyMapReduceConceptUsingPrimitives(int n, int p){
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

		if ( printDescription ) System.out.println("**STEP 1 START**-> Running Conversion into Buckets**");
		if ( printDescription ) System.out.println();
		int[][] b = step1ConvertIntoBuckets(values, totalNumberOfBuckets);
        if ( printDescription ) System.out.println("************STEP 1 COMPLETE*************");
        if ( printDescription ) System.out.println();
        if ( printDescription ) System.out.println();
//		printToScreen(b);

   		if ( printDescription ) System.out.println("**STEP 2 START**->Running **Map Function** concurrently for all Buckets  Sort individual lists");
		if ( printDescription ) System.out.println();
		step2RunMapFunctionForAllBuckets(b);

//		printToScreen(intermediateResults);
		if ( printDescription ) System.out.println("************STEP 2 COMPLETE*************");

        if ( printDescription ) System.out.println();
        if ( printDescription ) System.out.println();
		if ( printDescription ) System.out.println("**STEP 3 START**>;Running **Reduce Function** for collating Intermediate Results and Printing Results : Receives partially sorted list, uses Timesort");
		if ( printDescription ) System.out.println();
		result = step3RunReduceFunctionForAllBuckets(intermediateResults);
		if ( printDescription ) System.out.println("************STEP 3 COMPLETE*************");
		printToScreen(result);

	}

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

	public int[] step3RunReduceFunctionForAllBuckets(int[][] list) // <<<<<----- change to take a multi dim array and implement merge and sort for multiple arrays
	{
		int[] results = new int[totalNumberOfElements];
		int majorIndex = 0;
		int outerLength = list.length;
		for(int i=0; i < outerLength; i++)
		{
			int innerLength = list[i].length;
//			System.out.println("-- >" + i + " : " + Arrays.toString(list[i]));
			for ( int j = 0;  j < innerLength ; j++ ){
			//you can do some processing here, like finding max of all results etc
//				System.out.println(majorIndex + " : " + list[i][j]);
				results[majorIndex] = list[i][j];
				majorIndex++;
			}
//			System.out.println(majorIndex + " : " + innerLength + " : " + i);
		}
		// sorting a partially sorted list using java library choice of sorts.
		Arrays.sort(results);

		System.out.println();
		//System.out.println("Total Count is "+ results.length + " : " + Arrays.toString(results));
		System.out.println();

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
//			System.out.println(" before : " + tempList);
//			Arrays.toString(tempList);
//			System.out.println(" after : " + tempList);
//			System.out.println(" before : " + tempList.length);
			int[] holder = new int[tempList.length];
//			for(int i = 0; i < tempList.length; i++)
//			{
//				holder[i] = tempList[i];
//
//			}
//			synchronized(this)
//			{
				intermediateResults[majorIndex] = tempList;
//			}

//			System.out.println(" after : " + tempList.length);
			countDownLatch.countDown();
		}

	}

	private void intializeWithRandom(){
		for(int i = 0; i < totalNumberOfElements; i++)
		{ // randomize population using generic randomization
			values[i] = (int)(Math.random() * totalNumberOfElements);
		}
	}

	public void printToScreen(int[][] array)
	{
		System.out.println(array.length);
		for (int i = 0, j = array.length; i < j; i++){
			System.out.println(Arrays.toString(array[i]) +  " : " + array[i].length);
			//System.out.println(array[i].length);
		}
	}
	public void printToScreen(int[] array)
	{
		System.out.println(Arrays.toString(array));
	}
}
