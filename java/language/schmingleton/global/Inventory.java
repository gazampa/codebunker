import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 *
 * @author Billy : Global State. How to Fix this. Look into it to see how it can be done better.
 *
 */
public enum Inventory{
	//public static final Inventory INSTANCE = new Inventory();
	INSTANCE;
	//public static Inventory getInventory(){ return INSTANCE; }

	private Collection<LinkedList<String>> inventory = new ArrayList<LinkedList<String>>();

	private LinkedList<String> coffee;

	Inventory(){

		coffee = new LinkedList<String>();
		inventory.add(coffee);

		buildInventoryComponents();
	}

	private void buildInventoryComponents(){

		for ( int i=0;i<10;i++ ){
			coffee.add(new String("STRING_VALUE"));
		}
	}

	public LinkedList<String> getCollectionComponent() throws NoSuchElementException{
		LinkedList<String> result = null;
		if (null!=inventory && inventory.size()>0){
			result =((ArrayList<LinkedList<String>>) inventory).get(0);
		}
		return result;
	}

	public int decrement() throws NoSuchElementException{
		int result = -1;
		if (null!=inventory && inventory.size()>0){
			LinkedList<String> component = ((ArrayList<LinkedList<String>>) inventory).get(0);
			component.removeLast();
			result = component.size();
		}
		return result;
	}

	public int decrement(int decreaseBy)  throws NoSuchElementException{
		int result = -1;
		if (null!=inventory && inventory.size()>0){
			LinkedList<String> component = ((ArrayList<LinkedList<String>>) inventory).get(0);
			if (component!=null && component.size()>=decreaseBy ){
				for (int i=0;i < decreaseBy;i++)
				component.removeLast();
			}
			result = component.size();
		}
		return result;
	}

	public void refresh(int stockLevel){
		for (int i = coffee.size(); i<stockLevel ;i++ ){
			coffee.add (new String("STRING_VALUE_REFRESH") );
		}
	}

	public String toString(){

		String result;
		StringBuilder sb = new StringBuilder();

		sb.append("Singleton Inventory : ");
		sb.append(inventory.size());
		sb.append("\n");
		for (LinkedList<String> ingredientList : inventory){
				sb.append("A Linked List of String ");
				sb.append(ingredientList);
				sb.append(" : ");
				sb.append(ingredientList.size());
				sb.append("\n");
		}

		result = sb.toString();

		return result;
	}

	public int getSize(){
		int result=-1;
		if ( null!=inventory )
			result = inventory.size();
		return result;
	}

	public LinkedList<String> getCoffeeIngredientList(){
		return coffee;
	}


}