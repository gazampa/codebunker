import java.util.*;
import java.util.UUID;
public class MyMapReduce
{
	List<List<Integer>> buckets = new ArrayList<List<Integer>>();
	List<Integer> intermediateresults = new ArrayList<Integer>(1000);
	List<Integer> values = new ArrayList<Integer>();

	public void init(int n)
	{
		int totalNumberOfElements = n;

		for(int i = 0; i < totalNumberOfElements; i++)
		{ // randomize population using generic randomization
			values.add( ((int)(Math.random() * totalNumberOfElements)) );
		}

		System.out.println("**STEP 1 START**-> Running Conversion into Buckets**");
		System.out.println();
		List<List<Integer>> b = step1ConvertIntoBuckets(values,100);
        System.out.println("************STEP 1 COMPLETE*************");
        System.out.println();
        System.out.println();

   		System.out.println("**STEP 2 START**->Running **Map Function** concurrently for all Buckets  Sort individual lists");
		System.out.println();
		List<Integer> res = step2RunMapFunctionForAllBuckets(b);
		System.out.println("state of intermediate results : " + intermediateresults);
		System.out.println("************STEP 2 COMPLETE*************");

        System.out.println();
        System.out.println();
		System.out.println("**STEP 3 START**>;Running **Reduce Function** for collating Intermediate Results and Printing Results : Receives partially sorted list, uses Timesort");
		System.out.println();
		step3RunReduceFunctionForAllBuckets(res);
		System.out.println("************STEP 3 COMPLETE*************");

	}

	public List<List<Integer>> step1ConvertIntoBuckets(List<Integer> list,int numberofbuckets){
		int n = list.size();
		int m = n / numberofbuckets;
		int rem = n% numberofbuckets;

		int count = 0;
		System.out.println("BUCKETS");
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
		System.out.println(buckets);
		System.out.println();
		return buckets;

	}

	public List<Integer> step2RunMapFunctionForAllBuckets(List<List<Integer>> list)
	{
		for(int i=0; i < list.size(); i++)
		{
			List<Integer> elementList = (ArrayList<Integer>)list.get(i);
			new StartThread(elementList).start();
		}

        try
        {
			Thread.sleep(3000);
		}catch(Exception e)
		{
			System.out.println(" Problem : " + e);
		}

		return intermediateresults;
	}

	public void step3RunReduceFunctionForAllBuckets(List<Integer> list)
	{
		ArrayList<Integer> results = new ArrayList<Integer>();
		System.out.println("-->" + list.size() + " : " + list);
		for(int i=0; i < list.size(); i++)
		{
			//you can do some processing here, like finding max of all results etc
			results.add(list.get(i));
		}
		// sorting a partially sorted list using timesort
		Collections.sort(results);

		System.out.println();
		System.out.println("Total Count is "+ results.size() + " : " + results);
		System.out.println();

	}

	class StartThread extends Thread
	{
		private List<Integer> tempList = new ArrayList<Integer>();
		public StartThread(List<Integer> list)
		{
			tempList = list;
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
		}

	}

}
