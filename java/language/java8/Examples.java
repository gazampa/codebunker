package java8;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java8.interfaces.Interface;
import java8.interfaces.InterfaceWithMethodImplementations;
import java8.lambda.Lambda;
import java8.streams.Streams;
import org.gazampa.stopwatch.StopWatch; // jmh provides more rigorous benchmarking
class Examples{

	/** some examples based on article in JournalDev magazine : http://www.journaldev.com/2774/java-8-stream **/

	public static void main(String[] args){

		/** Stream Examples **/

		Streams s = new Streams();
		ArrayList<Integer> list = s.populateList(100);
		int[] array = s.populateArray(100);
		ArrayList<Integer> resultList;
		int[] resultArray;
		StopWatch sw = new StopWatch();

		sw.start();
		resultList = s.filterList(list, 500);
		sw.stopAndReport();
		System.out.println(resultList.toString());

		sw.restart();
		resultArray = s.filterArray(array, 500);
		sw.stopAndReport();
		System.out.println(Arrays.toString(resultArray));

		sw.restart();
		resultList = s.mapList(list);
		sw.stopAndReport();
		System.out.println(resultList.toString());

		sw.restart();
		resultArray = s.mapArray(array);
		sw.stopAndReport();
		System.out.println(Arrays.toString(array));

		sw.restart();
		resultList = s.sortList(list);
		sw.stopAndReport();
		System.out.println(resultList.toString());

		sw.restart();
		resultArray = s.sortArray(array);
		sw.stopAndReport();
		System.out.println(Arrays.toString(array));

	}

}

/** Interface Examples
	Interface iface = new Interface();

	System.out.println(iface.interfaceMethod());
	System.out.println(iface.staticsMethod());
	System.out.println(iface.imLikeAbstractInherited());
	// you have to make the interface public
	System.out.println(InterfaceWithMethodImplementations.iCantBeOverridden());

**/

/** Lambda Examples
	Lambda lamda = new Lambda();
	StopWatch sw = new StopWatch();

	sw.start();
	lamda.isPrime(1299721);	//1299721 : 100001st : http://www.bigprimes.net/archive/prime/1001/
	sw.stopAndReport();

	sw.restart();
	lamda.isLambdaPrime(1299721);
	sw.stopAndReport();

	List<Integer> list = new ArrayList< >(100);
	for ( int i = 0, j = 100; i < j; i++ ){
		list.add(0);
	}

	lamda.list = list;

	sw.restart();
	System.out.println(lamda.for_4filters());
	sw.stopAndReport("standard");

	sw.restart();
	System.out.println(lamda.forEach_4filters());
	sw.stopAndReport("for each");

	sw.restart();
	System.out.println(lamda.iterator_4filters());
	sw.stopAndReport("iterator");
**/