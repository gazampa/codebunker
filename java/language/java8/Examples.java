package java8;

import java.util.List;
import java.util.ArrayList;
import java8.interfaces.Interface;
import java8.interfaces.InterfaceWithMethodImplementations;
import java8.lambda.Lambda;
import org.gazampa.stopwatch.StopWatch;
class Examples{

	/** some examples taken from the JournalDev magazine **/

	public static void main(String[] args){

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