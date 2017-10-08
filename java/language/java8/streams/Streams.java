package java8.streams;

import java.util.Iterator;
import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Streams{

	/**
	*	- To perform a computation, stream operations are composed into a stream pipeline.
	*	- A stream pipeline consists of a source (which might be an array, a collection, a generator function, an I/O channel, etc),
	*		zero or more intermediate operations (which transform a stream into another stream, such as filter(Predicate)),
	*		and a terminal operation (which produces a result or side-effect, such as count() or forEach(Consumer)).
	*		Streams are lazy; computation on the source data is only performed when the terminal operation is initiated,
	*		and source elements are consumed only as needed.
	*	- parallelism exploits now baked into the language. Scala like, small code big differences.
	*	- a lot of these depend on the nature of the data, compiler technology, memory design, instruction set and processor implemetation
	*	- back up theory with solid empirical benchmarking
	*	- intermediate operations, filter / map, and terminal operations, ForEach, toArray, min, max, FindFirst
	*	- intermediate are lazy, terminal are eager and consume the stream
	*	- good for splitting and reducing datasets
	*	- internal iteration, let the experts do what they do best, help them - help you
	*	- predicate interfaces allow testing and filtering
	*	- primitives allowed in custom structures that avoids autoboxing
	*	- behavioral parameters:
	*		must be non-interfering (they do not modify the stream source); and
	*  		in most cases must be stateless (their result should not depend on any state that might change during execution of the stream pipeline).
	**/

	List<Integer> listInteger;
	int[] arrayInt;

	public int sumIterator(List<Integer> list) {
		Iterator<Integer> it = list.iterator();
		int sum = 0;
		while (it.hasNext()) {
			int num = it.next();
			if (num > 10) {
				sum += num;
			}
		}
		return sum;
	}

	public int sumStream(List<Integer> list) {
		return list.stream().filter(i -> i > 10).mapToInt(i -> i).sum();
	}

	public ArrayList<Integer> filterList(ArrayList<Integer> list, int val){
		ArrayList<Integer> result = new ArrayList<>();
		Stream<Integer> sequential = list.stream(); // .parrallelStream() -- parallel

		Stream<Integer> filtered = sequential.filter(p -> p > val);

		filtered.forEach(p -> result.add(p));

		return result;
	}

	public int[] filterArray(int[] array, int val){
		int[] result;
		IntStream sequential = Arrays.stream(array); // returns stream<int[]> Arrays.stream(array) returnsintStream

		IntStream filtered = sequential.filter(p -> p > val);

		result = filtered.toArray();

		return result;
	}

	public ArrayList<Integer> mapList(List<Integer> list){
		ArrayList<Integer> result = new ArrayList<>();
		Stream<Integer> sequential = list.stream();

		Stream<Integer> mapped = sequential.map( x -> { return  x/2; } );

		mapped.forEach(x -> result.add(x));

		return result;
	}

	public int[] mapArray(int[] array){
		int[] result;
		IntStream sequential = Arrays.stream(array); // returns stream<int[]> Arrays.stream(array) returnsintStream

		IntStream mapped = sequential.map(p -> p / 2); // only one line of code

		result = mapped.toArray();

		return result;
	}

	public ArrayList<Integer> sortList(List<Integer> list){
		ArrayList<Integer> result = new ArrayList<>();
		Stream<Integer> sequential = list.stream();

		Stream<Integer> sorted = sequential.sorted(Comparator.naturalOrder()); // or just .sorted

		sorted.forEach(x -> result.add(x));

		return result;
	}

	public int[] sortArray(int[] array){
		int[] result;
		IntStream sequential = Arrays.stream(array); // returns stream<int[]> Arrays.stream(array) returnsintStream

		IntStream sorted = sequential.sorted();

		result = sorted.toArray();

		return result;
	}

	/** utility **/
	public void setList(List<Integer> list){
		listInteger = list;
	}

	public void setArray(int[] arr){
		arrayInt = arr;
	}

	public ArrayList<Integer> populateList(int size){
		ArrayList<Integer> aList = new ArrayList< >();
		for ( int i = 0, j = size; i < j; i++ ){
			aList.add((int)(Math.random() * size));
		}
		return aList;
	}

	public int[] populateArray(int size){
		int[] anArray = new int[size];
		for ( int i = 0, j = size; i < j; i++ ){
			anArray[i] = (int)(Math.random() * size);
		}
		return anArray;
	}
}