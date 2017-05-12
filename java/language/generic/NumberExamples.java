package generics;

import java.util.List;
import java.util.ArrayList;
import java.math.BigInteger;
class NumberExamples{

	/**
	*	Arrays in java will accept subtypes of their declared type , ie, super[] ~ sub[]
	*	Generic Collections will not, they are invariant, List<Super> !~ List<Sub>
	*	Generics restrict what can be added to a collection, they dont like mixing lists of subtypes,
	*   keep lists of the same type, dont cross the streams
	*	Type Erasure ocurs at compile time, the compiler removes all the type tags
	*	The generic wildcard character, ? extends, allows read only iteration of many different types
	*	The generic wildcard character, ? super, allows modification of specified types but not iteration
	*	List<?> != List<Object>. List<? extends Object> == List<?>
	*	In an upper bounded list, we extract values and use them.
	*	In a lower bounded list, we supply values. This combination has a traditional name: PECS. but as I read that by extending you can consume, by super, you can produce
	*	Using parametric polymorphism, a function or a data type can be written generically so that it can
	*		handle values identically without depending on their type.[1] Such functions and data types are called
	*			generic functions and generic datatypes respectively and form the basis of generic programming.
	*
	**/


	public static void main(String[] args){

		Numbers n = new Numbers();

		ArrayList<Integer> integers = new ArrayList< >();
		ArrayList<BigInteger> bigIntegers = new ArrayList< >();
		ArrayList<Float> floats = new ArrayList< >();

		n.populateAListInteger(integers, 10);
		n.populateAListBigInteger(bigIntegers, 10);
		n.populateAListFloat(floats, 10);

		// public <T> void readAListOfAnything(List<T> numbers) works as toString is a method of everything
		// public void readAListOfNumbers(List<? extends Number> numbers) now you can only pass something that is a Number
		n.readAListOfNumbers(integers);
		println();
		n.readAListOfNumbers(bigIntegers);
		println();
		n.readAListOfNumbers(floats);
		println();

		// add numbers to -->their<-- list
		n.writeToAListOfNumbers(integers, new Integer("50"));
		n.readAListOfNumbers(integers);
		println();
		n.writeToAListOfNumbers(bigIntegers, new BigInteger("51"));
		n.readAListOfNumbers(bigIntegers);
		println();

		// add numbers
		System.out.println(n.addNumbersAsDoubles(new Integer("20"), new BigInteger("22")));

	}

	static void println(){
		System.out.println();
	}

}

/**
		// use univeral method for a Number
		System.out.println(" byte conversion");
		n.readAListOfNumbersAsByte(integers);
		println();
		n.readAListOfNumbersAsDouble(floats);
		println();

**/