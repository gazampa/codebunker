import java.util.*;

public class MyMapReduce
{
	List<List<String>> buckets = new ArrayList<List<String>>();
	List<String> intermediateresults = new ArrayList<String>(1000);
	List<String> values = new ArrayList<String>();

	public void init()
	{
		for(int i = 1; i<=1000; i++)
		{
			values.add("0" + new Integer(i).toString());
		}

		System.out.println("**STEP 1 START**-> Running Conversion into Buckets**");
		System.out.println();
		List<List<String>> b = step1ConvertIntoBuckets(values,100);
        System.out.println("************STEP 1 COMPLETE*************");
        System.out.println();
        System.out.println();

   		System.out.println("**STEP 2 START**->Running **Map Function** concurrently for all        Buckets");
		System.out.println();
		List<String> res = step2RunMapFunctionForAllBuckets(b);
		System.out.println("************STEP 2 COMPLETE*************");

        System.out.println();
        System.out.println();
		System.out.println("**STEP 3 START**>;Running **Reduce Function** for collating Intermediate Results and Printing Results");
		System.out.println();
		step3RunReduceFunctionForAllBuckets(res);
		System.out.println("************STEP 3 COMPLETE*************");

	}
	public List<List<String>> step1ConvertIntoBuckets(List<String> list,int numberofbuckets)
	{
		int n = list.size();
		int m = n / numberofbuckets;
		int rem = n% numberofbuckets;

		int count = 0;
		System.out.println("BUCKETS");
		for(int j =1; j<= numberofbuckets; j++)
		{
			List<String> temp = new ArrayList<String>();
			for(int i=1; i<= m; i++)
			{

				temp.add(values.get(count));
				count++;


			}
			buckets.add(temp);
			temp = new ArrayList<String>();
		}
		if(rem != 0)
		{
			List<String> temp = new ArrayList<String>();
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

	public List<String> step2RunMapFunctionForAllBuckets(List<List<String>> list)
	{
		for(int i=0; i < list.size(); i++)
		{
			List<String> elementList = (ArrayList<String>)list.get(i);
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

	public void step3RunReduceFunctionForAllBuckets(List<String> list)
	{
		ArrayList<String> results = new ArrayList<String>();
		//int sum =0;
		System.out.println("-->" + list.size() + " : " + list);
		for(int i=0; i < list.size(); i++)
		{
			//you can do some processing here, like finding max of all results etc
			//int t=0;
			try {
				results.add(list.get(i));
				//t = Integer.parseInt((String)list.get(i));
			}catch(NumberFormatException nfe){}

			//sum += t;
		}

		TreeSet<String> strings = new TreeSet<String>();
		TreeSet<Integer> numbers = new TreeSet<Integer>();
		for (String str : results){
			if (null!=str)
				strings.add(str);
		}
		for (String number : strings){
			if (null!=number)
				numbers.add(Integer.parseInt(number));
		}

		System.out.println();
		System.out.println("Total Count is "+ strings.size() + " : " + strings);
		System.out.println("Total Count is "+ numbers.size() + " : " + numbers);

//		for (Integer number : numbers){
//			System.out.println(	number );
//		}

		System.out.println();

	}

		class StartThread extends Thread
		{
			private List<String> tempList = new ArrayList<String>();
			public StartThread(List<String> list)
			{
				tempList = list;
			}
			public void run()
			{

				for(int i=0; i < tempList.size();i++)
				{
					String str = tempList.get(i);

					synchronized(this)
                     {
						String siz = new Integer(str.length()).toString();
						//System.out.println(str + " : " + siz );
						intermediateresults.add(str);
					 }


				}
			}

		}

}
