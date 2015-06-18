package trustwave.barista.ingredient;

import java.util.Collection;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class IngredientLinkedList{
	
	private String name;

	LinkedList<Ingredient> listOfIngredient = new LinkedList<Ingredient>();
	
	public Ingredient getIngredient(Collection<Ingredient> collection) throws NoSuchElementException{
		Ingredient result = null;
		if (null!=collection && collection.size()>0){
			result =((LinkedList<Ingredient>) collection).removeLast();
		}		
		return result;
	}
	
	public void add(Ingredient ingredient){
		if ( null!=listOfIngredient && null!=ingredient ){	
				listOfIngredient.add(ingredient);
		}
	}
	
	public int decrement(Collection<Ingredient> collection) throws NoSuchElementException{
		int result = -1;
		if (null!=collection && collection.size()>0){
			((LinkedList<Ingredient>) collection).removeLast();
			result = collection.size();
		}
		return result;
	}

	public int decrementBy( int decreaseBy)  throws NoSuchElementException{
		int result = -1;
		if (null!=listOfIngredient && listOfIngredient.size()>=decreaseBy){
			for (int i=0;i < decreaseBy;i++)
				listOfIngredient.removeLast();
			result = listOfIngredient.size();
		}
		return result;
	}

	public int getCollectionSize(){
		int result=-1;
			result = listOfIngredient.size();
		return result;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Collection<Ingredient> getListOfIngredient() {
		return listOfIngredient;
	}

	public void setListOfIngredient(LinkedList<Ingredient> listOfIngredient) {
		this.listOfIngredient = listOfIngredient;
	}
	
}