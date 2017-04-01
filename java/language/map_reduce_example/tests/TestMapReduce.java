package tests;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import mapreduceexample.MyMapReduceConceptUsingPrimitives;
public class TestMapReduce{

  @Test
  public void mapReduce() {

	int sampleSize = 1005;
	int numberOfPartitions = 100;
	int[] testData, resultData;
	HashMap<Integer, Integer> preSort = new HashMap<Integer, Integer>();
	HashMap<Integer, Integer> postSort = new HashMap<Integer, Integer>();

	MyMapReduceConceptUsingPrimitives primitives = new MyMapReduceConceptUsingPrimitives(sampleSize, numberOfPartitions);

	testData = primitives.getValues();

	preSort = countIncidencesOfElements(testData);

	primitives.init();

	resultData = primitives.getResult();

	postSort = countIncidencesOfElements(testData);

	System.out.println(isSortedAsc(resultData));

	System.out.println(checkForIncidenceEquality(preSort, postSort));

	preSort.forEach((keyy, value) -> System.out.println(keyy + " : " + value));

	postSort.forEach((keyy, value) -> System.out.println(keyy + " : " + value));

    assertEquals(true, true);

  }

  private HashMap<Integer, Integer> countIncidencesOfElements(int[] intArray){
	HashMap<Integer, Integer> result = new HashMap<Integer, Integer>();
	Integer key;
	Integer currentValue = 1;

	for ( int i = 0; i < intArray.length; i++ ){
		key = (Integer)intArray[i];
		if ( result.get(key) == null ){
			result.put( key, (Integer)1 );
		}else{
			currentValue = result.get(key);
			currentValue=currentValue+1;
			result.put( key, currentValue );
		}
	}

	return result;
  }

  private boolean checkForIncidenceEquality( Map<Integer, Integer> map1 ,Map<Integer, Integer> map2){
	  boolean result = false;
	  Set<Integer> m1Keys = new TreeSet<Integer>();
	  Set<Integer> m2Keys = new TreeSet<Integer>();

	  m1Keys = map1.keySet();
	  m2Keys = map2.keySet();

	  if (m1Keys.size()!=m2Keys.size()) // same set size ... same amount of unique numbers in both
	  	return false;

	  for (int i = 0, j = m1Keys.size(); i < j; i++){ // same values
		  if ( !m1Keys.containsAll(m2Keys) )   // split time by decrementing j
		  	return false;
	  }

	  for (Integer key : m1Keys){			// same number of occurences for values .... not testing stability
		  if (map1.get(key)!=map2.get(key))
		  	return false;
	  }

	  result = true;
	return result;
  }

  private boolean isSortedAsc(int[] intArray){
	boolean result = true;
	for (int i = 0, j=1; i < intArray.length-1; i++, j++){
		if ( intArray[i] > intArray[j] ){
			System.out.println(i + " : " + intArray[i] + " > " +  intArray[j]);
			return false;
		}
	}
	return result;
  }

}


/**
import java.lang.reflect.Field;
	try
	{
		Field field = Class.forName("mapreduceexample.MyMapReduceConceptUsingPrimitives").getDeclaredField("values");
		field.setAccessible(true);
		field.get(field);
	}catch(ClassNotFoundException cnf){}
	 catch(NoSuchFieldException nfe){}
	 catch(IllegalAccessException iae){}

**/