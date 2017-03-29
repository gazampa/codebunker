/**

Adapted from : http://jayantkumar.in/category/java/

**/

class MyMapReduceRun{

	public static void main(String[] args){
		int sampleSize = 1005;
		int numberOfPartitions = 100;
		MyMapReduceConceptUsingPrimitives my = new MyMapReduceConceptUsingPrimitives(sampleSize, numberOfPartitions);
	    my.init();
	}

}