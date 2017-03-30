/**

Adapted from : http://jayantkumar.in/category/java/

**/

class MyMapReduceRun{

	public static void main(String[] args){
		int sampleSize = 1005;
		int numberOfPartitions = 100;
		long startTime, endTime, duration;

		MyMapReduceConceptUsingPrimitives primitives = new MyMapReduceConceptUsingPrimitives(sampleSize, numberOfPartitions);

		startTime = System.nanoTime();

	    primitives.init();

		endTime = System.nanoTime();

		duration = endTime - startTime;

		System.out.println(" time elapsed : " + duration);

		MyMapReduceConceptUsingGenerics generics = new MyMapReduceConceptUsingGenerics(sampleSize, numberOfPartitions);

		startTime = System.nanoTime();

		generics.init();

		endTime = System.nanoTime();

		duration = endTime - startTime;

		System.out.println(" time elapsed : " + duration);

	}

}