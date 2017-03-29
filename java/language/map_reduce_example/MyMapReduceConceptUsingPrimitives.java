/**

Adapted from : http://jayantkumar.in/category/java/

**/
import java.util.*;
import java.util.UUID;
public class MyMapReduceConceptUsingPrimitives
{

	private	int totalNumberOfElements;
	private	int totalNumberOfBuckets;
	private int[] values;
	private int[][] intermediateResults;
	private int[] result;

	public MyMapReduceConceptUsingPrimitives(int n, int p){
		totalNumberOfElements = n;
		totalNumberOfBuckets = p;
	}

	public void init()
	{
		values = new int[totalNumberOfElements];
		int compensate = (totalNumberOfElements % totalNumberOfBuckets!=0) ? 1 : 0;
		intermediateResults = new int[totalNumberOfBuckets+compensate][];

		for(int i = 0; i < totalNumberOfElements; i++)
		{ // randomize population using generic randomization
			values[i] = (int)(Math.random() * totalNumberOfElements);
		}

		printToScreen(values);

		System.out.println("**STEP 1 START**-> Running Conversion into Buckets**");
		System.out.println();
		int[][] b = step1ConvertIntoBuckets(values, totalNumberOfBuckets);
        System.out.println("************STEP 1 COMPLETE*************");
        System.out.println();
        System.out.println();
//		printToScreen(b);

   		System.out.println("**STEP 2 START**->Running **Map Function** concurrently for all Buckets  Sort individual lists");
		System.out.println();
		step2RunMapFunctionForAllBuckets(b);
//		printToScreen(intermediateResults);
		System.out.println("************STEP 2 COMPLETE*************");

        System.out.println();
        System.out.println();
		System.out.println("**STEP 3 START**>;Running **Reduce Function** for collating Intermediate Results and Printing Results : Receives partially sorted list, uses Timesort");
		System.out.println();
		result = step3RunReduceFunctionForAllBuckets(intermediateResults);
		System.out.println("************STEP 3 COMPLETE*************");
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

		System.out.println("BUCKETS");

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
		for(int i = 0; i < list.length; i++)
		{
			int[] elementList = list[i];
			new StartThread(elementList, i).start();
		}

        try
        {
			Thread.sleep(3000);
		}catch(Exception e)
		{
			System.out.println(" Problem : " + e);
		}

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

		public StartThread(int[] list, int i)
		{
			tempList = list;
			majorIndex = i;
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
			synchronized(this)
			{
				intermediateResults[majorIndex] = tempList;
			}

//			System.out.println(" after : " + tempList.length);
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
