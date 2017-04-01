package mapreduceexample;
/**

Adapted from : http://jayantkumar.in/category/java/

**/
import stopwatch.StopWatch;
public class MyMapReduceRun{

	public static void main(String[] args){

		int sampleSize = 1005;
		int numberOfPartitions = 100;

		StopWatch clock = new StopWatch();

		MyMapReduceConceptUsingPrimitives primitives = new MyMapReduceConceptUsingPrimitives(sampleSize, numberOfPartitions);

		clock.start();

	    primitives.init();

		clock.stopAndReport();

		MyMapReduceConceptUsingGenerics generics = new MyMapReduceConceptUsingGenerics(sampleSize, numberOfPartitions);

		clock.start();

		generics.init();

		clock.stopAndReport();

	}

}