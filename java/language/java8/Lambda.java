package java8.lambda;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.IntStream;
import java.util.UUID;
public class Lambda{
	/**
	*	- a function definition that is not bound to an identifier
	*	- similiar to anonymous functions but without the overhead, scope
	*	- http://www.oracle.com/technetwork/java/jvmls2013kuksen-2014088.pdf
	*	- teams up with functional interfaces, Runnable, Comparable, etc
	*	- New interfaces that exploit Sequential and Parralellism use them
	**/

	public Runnable getRunnable(){
		return new Runnable(){
					@Override
					public void run() {
						System.out.println("My Runnable");
			}};
	}

	public Runnable getLambdaRunnable(){
		return () -> System.out.println("My Runnable");
	}

	/** performance - taken from pdf aboove **/
	public boolean isPrime(int number) {
		if(number < 2) return false;
		for(int i=2; i<number; i++){
			if(number % i == 0) return false;
		}
		return true;
	}

	public boolean isLambdaPrime(int number) {
		return number > 1
				&& IntStream.range(2, number).noneMatch(
						index -> number % index == 0);
	}

	public List < Integer > list = new ArrayList < >(); // used for benchmark example

	public int for_4filters () {
		Counter c = new Counter ();
		for ( Integer i : list ) {
			if ((i & 0xf) == 0 &&
				(i & 0xff ) == 0 &&
				(i & 0xfff ) == 0 &&
				(i & 0xffff ) == 0) {
				c.add(i);
			}
		}
		return c.value() ;
	}

	public int forEach_4filters () {
		Counter c = new Counter ();
		list . stream ()
			. filter(i -> (i & 0xf) == 0)
			. filter(i -> (i & 0xff) == 0)
			. filter (i -> (i & 0xfff ) == 0)
			. filter (i -> (i & 0xffff ) == 0)
			. forEach (c:: add );
		return c.value() ;
	}
	// compare against zero
	public int iterator_4filters () {
		Counter c = new Counter ();
		Iterator < Integer > iterator = list.stream ()
			.filter (i -> (i & 0xf) == 0)
			.filter (i -> (i & 0xff ) == 0)
			.filter (i -> (i & 0xfff ) == 0)
			.filter (i -> (i & 0xffff ) == 0)
			.iterator ();
		while ( iterator . hasNext ()) {
			c. add ( iterator.next() );
		}
		return c.value() ;
	}

}

class Counter implements Comparable<Counter> {

	private final String name;
    private final int maxCount;    // maximum value
    private int count;             // current value

    // create a new counter with the given parameters
    public Counter() {
        name = UUID.randomUUID().toString();
    	maxCount = Integer.MAX_VALUE;
    	count = 0;
    }

    public Counter(String id) {
        name = id;
    	maxCount = Integer.MAX_VALUE;
        count = 0;
    }

    public Counter(int max) {
        name = UUID.randomUUID().toString();
    	maxCount = max;
        count = 0;
    }

    public Counter(String id, int max) {
        name = id;
        maxCount = max;
    	count = 0;
    }

    // increment the counter by 1
    public void increment() {
        if (count < maxCount) count++;
    }

    public void increment(Integer i) {
        if (count < maxCount) count++;
    }

	public void add(Integer i){
		count += i;
	}

    // return the current count
    public int value() {
        return count;
    }

    // return a string representation of this counter
    public String toString() {
        return name + ": " + count;
    }

    // compare two Counter objects based on their count
    public int compareTo(Counter that) {
        if      (this.count < that.count) return -1;
        else if (this.count > that.count) return +1;
        else                              return  0;
    }

}