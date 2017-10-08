package generics;

import java.util.List;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.Iterator;
public class Numbers{
	/**
	*	The abstract class Number is the superclass of classes BigDecimal,
	*		BigInteger, Byte, Double, Float, Integer, Long, and Short.
	*	Subclasses of Number must provide methods to convert the represented
	*		numeric value to byte, double, float, int, long, and short.
	*
	**/

	// reading
	public <T> void readAListOfAnything(List<T> numbers){
		Iterator<T> iter = numbers.iterator();
		while ( iter.hasNext() ){
			T element = iter.next(); // shouldnt this be E
			System.out.print(element + " "); // everyone has a toString() method
		}
	}

	public void readAListOfNumbers(List<? extends Number> numbers){
		for ( Number number : numbers ){
			System.out.print(number + " "); // Every Number has a byteValue method
		}
	}

	public void readAListOfNumbersAsByte(List<? extends Number> numbers){
		for ( Number number : numbers ){
			System.out.print(number.byteValue() + " "); // Every Number has a byteValue method
		}
	}

	public void readAListOfNumbersAsDouble(List<? extends Number> numbers){
		for ( Number number : numbers ){
			System.out.print(number.doubleValue() + " "); // Every Number has a byteValue method
		}
	}

	//writing
	public <T> void writeToAListOfAnything(List<T> list, T element){
		list.add(element);
	}

	public <E> void writeToAListOfNumbers(List<? super E> list, E element){
		list.add(element);
	}

	public <E> List<? super E> filterAListOfNumbers(List<? super E> list, E element){
		list.add(element);
		return list;
	}

	//rithmitic ?
	// youd have to provide a universal way for addition of binary values,
	// different memory types have different methods ( guessing from error message - bad operand types for binary operator )
	public Number addNumbersAsDoubles(Number x, Number y){ // <T extends Number> double addNumbersAsDoubles(T x, T y)

		return x.doubleValue() + y.doubleValue() ;
	}

	// utility to generate lists to use
	public void populateAListInteger(List<Integer> list, int size){
		for ( int i = 0; i < size; i++ ){
			list.add((Integer)(int)(Math.random() * size));
		}
	}

	public void populateAListBigInteger(List<BigInteger> list, int size){
		for ( int i = 0; i < size; i++ ){
			list.add( BigInteger.valueOf( (int)(Math.random() * size) ) ) ;
		}
	}

	public void populateAListFloat(List<Float> list, int size){
		for ( int i = 0; i < size; i++ ){
			list.add( (float)(Math.random() * size) );
		}
	}
}