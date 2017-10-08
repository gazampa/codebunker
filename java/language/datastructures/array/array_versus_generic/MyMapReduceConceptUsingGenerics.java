package mapreduceexample;
/**

Adapted from : http://jayantkumar.in/category/java/

**/

import java.util.*;
import java.util.concurrent.CountDownLatch;
import java.util.UUID;
public class MyMapReduceConceptUsingGenerics
{
	List<List<Integer>> buckets = new ArrayList<List<Integer>>();
	List<Integer> values = new ArrayList<Integer>();
	List<Integer> intermediateresults = new ArrayList<Integer>(1000);
	List<Integer> result = new ArrayList<Integer>();

	private	int totalNumberOfElements, totalNumberOfBuckets;
	private boolean printDescription = false;

	public MyMapReduceConceptUsingGenerics(int n, int p){
		totalNumberOfElements = n;
		totalNumberOfBuckets = p;
	}

	public void init()
	{
		initializeWithRandom();
		printListToScreen(values);
		if ( printDescription ) System.out.println("**STEP 1 START**-> Running Conversion into Buckets**");
		if ( printDescription ) System.out.println();
		List<List<Integer>> b = step1ConvertIntoBuckets(values,totalNumberOfBuckets);
        if ( printDescription ) System.out.println("************STEP 1 COMPLETE*************");
        if ( printDescription ) System.out.println();
        if ( printDescription ) System.out.println();

   		if ( printDescription ) System.out.println("**STEP 2 START**->Running **Map Function** concurrently for all Buckets  Sort individual lists");
		if ( printDescription ) System.out.println();
		List<Integer> res = step2RunMapFunctionForAllBuckets(b);
		if ( printDescription ) System.out.println("state of intermediate results : " + intermediateresults);
		if ( printDescription ) System.out.println("************STEP 2 COMPLETE*************");

        if ( printDescription ) System.out.println();
        if ( printDescription ) System.out.println();
		if ( printDescription ) System.out.println("**STEP 3 START**>;Running **Reduce Function** for collating Intermediate Results and Printing Results : Receives partially sorted list, uses Timesort");
		if ( printDescription ) System.out.println();
		result = step3RunReduceFunctionForAllBuckets(res);
		printListToScreen(result);
		if ( printDescription ) System.out.println("************STEP 3 COMPLETE*************");

	}

	public List<List<Integer>> step1ConvertIntoBuckets(List<Integer> list,int numberofbuckets){
		int n = list.size();
		int m = n / numberofbuckets;
		int rem = n% numberofbuckets;

		int count = 0;
		if ( printDescription ) System.out.println("BUCKETS");
		for(int j = 0; j < numberofbuckets; j++)
		{
			List<Integer> temp = new ArrayList<Integer>();
			for(int i=1; i<= m; i++)
			{

				temp.add(values.get(count));
				count++;

			}
			buckets.add(temp);
			temp = new ArrayList<Integer>();
		}
		if(rem != 0)
		{
			List<Integer> temp = new ArrayList<Integer>();
			for(int i =1; i<=rem;i++)
			{
				temp.add(values.get(count));
				count++;
			}
			buckets.add(temp);
		}
        System.out.println();
//		System.out.println(buckets);
		System.out.println();
		return buckets;

	}

	public List<Integer> step2RunMapFunctionForAllBuckets(List<List<Integer>> list)
	{
		CountDownLatch threadsFinished = new CountDownLatch(list.size());

		for(int i=0; i < list.size(); i++)
		{
			List<Integer> elementList = (ArrayList<Integer>)list.get(i);
			new StartThread(elementList, threadsFinished).start();
		}

		try{
			threadsFinished.await();
		}catch(InterruptedException ie){System.out.println(" a thread was interrupted ....");}

		return intermediateresults;
	}

	public List<Integer> step3RunReduceFunctionForAllBuckets(List<Integer> list)
	{
		ArrayList<Integer> results = new ArrayList<Integer>();
		for(int i=0; i < list.size(); i++)
		{
			//you can do some processing here, like finding max of all results etc
			results.add(list.get(i));
		}
		// sorting a partially sorted list using timesort
		Collections.sort(results);

		//System.out.println();
		//System.out.println("Total Element Count is "+ results.size() + " : " + results);
		//System.out.println();

		return results;

	}

	class StartThread extends Thread
	{
		private List<Integer> tempList = new ArrayList<Integer>();
		private CountDownLatch countDownLatch;
		public StartThread(List<Integer> list, CountDownLatch latch)
		{
			tempList = list;
			countDownLatch = latch;
		}
		public void run()
		{
//			System.out.println(" before : " + tempList);
			Collections.sort(tempList);
//			System.out.println(" after : " + tempList);
			for(int i=0; i < tempList.size();i++)
			{
				Integer element = tempList.get(i);

				synchronized(this)
				 {
					intermediateresults.add(element);
				 }

			}
			countDownLatch.countDown();
		}

	}

	private void initializeWithRandom(){
		for(int i = 0; i < totalNumberOfElements; i++)
		{ // randomize population using generic randomization
			values.add( ((int)(Math.random() * totalNumberOfElements)) );
		}
	}

	public void printListsToScreen(List<List<Integer>> lists)
	{
		System.out.println(lists.size());
		for (List<Integer> list : lists){
			System.out.println(list +  " : " + list.size());
			//System.out.println(array[i].length);
		}
	}

	public void printListToScreen(List<Integer> list)
	{
		System.out.println(list);
	}

}
