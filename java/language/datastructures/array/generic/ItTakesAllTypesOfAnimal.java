package generic;
 /** a generic holder for all types of things but only that thing
 *   - interchanging lists for arrays throws downcast errors at runtime : arrays don’t support type erasure
 **/
import java.util.Arrays;
import java.util.List;
public class ItTakesAllTypesOfAnimal<T extends Animal>{

	T instance;
	T[] arrayOfT;
	List<T> listOfT;

	public ItTakesAllTypesOfAnimal(){}

	public ItTakesAllTypesOfAnimal(T t){
		instance = t;
	}

	public ItTakesAllTypesOfAnimal(T[] t){
		arrayOfT = t;
	}

	// converting a genric list to a generic array < --- compiles but cant downcast from Object to Animal at runtime

	@SuppressWarnings("unchecked")
	public ItTakesAllTypesOfAnimal(List<T> t){
		//arrayOfT = t.toArray(newArr); // unchecked cast
		//Animal[] newArr = (T[])t.toArray();
		//arrayOfT = (T[])t.toArray(newArr);
		T[] newArr = (T[])java.lang.reflect.Array.newInstance(Animal.class, t.size());
		newArr = (T[])t.toArray();
		arrayOfT = newArr;
	}

//	public ItTakesAllTypesOfAnimal(List<T> t){ // < -- keep a list a list
//		listOfT = t; // unchecked cast
//	}

	public T getType(){
		return instance;
	}

	public void setType(T t){
		instance = t;
	}

	public T[] getArrayT(){
		return arrayOfT;
	}

	public void setArrayType(T[] t){
		arrayOfT = t;
	}

	public String howAreYou(){
		return instance.howAmI();
	}

	public String howAreYouAll(){
		StringBuilder sb = new StringBuilder();
		if ( arrayOfT != null ){
			for ( int i = 0, j = arrayOfT.length; i < j; i++ ){
					System.out.println(arrayOfT[i]);
				//sb.append(arrayOfT[i] + " " + arrayOfT[i].howAmI());
			}

		}
		return sb.toString();
	}

//	public String howAreYouAll(){
//		StringBuilder sb = new StringBuilder();
//		if ( listOfT != null ){
//			for ( T single : listOfT ){
//				sb.append(single + " " + single.howAmI());
//			}
//
//		}
//		return sb.toString();
//	}

}