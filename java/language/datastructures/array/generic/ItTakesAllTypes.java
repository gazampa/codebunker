package generic;
 /** a generic holder for all types of things but only that thing **/
import java.util.List;
public class ItTakesAllTypes<T>{

	T instance;
	T[] arrayOfT;

	public ItTakesAllTypes(){}

	public ItTakesAllTypes(T t){
		instance = t;
	}

	public ItTakesAllTypes(T[] t){
		arrayOfT = t;
	}

	@SuppressWarnings("unchecked")
	public ItTakesAllTypes(List<T> t){

		arrayOfT = (T[])t.toArray(); // unchecked cast
	}

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

}