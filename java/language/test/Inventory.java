package trustwave.barista.inventory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.NoSuchElementException;

import trustwave.barista.ingredient.*;

public class Inventory{

	public static final Inventory INSTANCE = new Inventory();
	public static Inventory getInventory(){ return INSTANCE; }

//	Collection<Collection<Ingredient>> ingredients = new ArrayList<Collection<Ingredient>>();
	Collection<IngredientLinkedList> ingredients = new ArrayList<IngredientLinkedList>();
	
	Collection<Ingredient> coffee;
	Collection<Ingredient> decafCoffee;;
	Collection<Ingredient> sugar;
	Collection<Ingredient> cream;
	Collection<Ingredient> steamedMilk;
	Collection<Ingredient> foamedMilk;
	Collection<Ingredient> espresso;
	Collection<Ingredient> cocoa;
	Collection<Ingredient> whippedCream;

	IngredientLinkedList coffee1;
	IngredientLinkedList decafCoffee1;
	IngredientLinkedList sugar1;
	IngredientLinkedList cream1;
	IngredientLinkedList steamedMilk1;
	IngredientLinkedList foamedMilk1;
	IngredientLinkedList espresso1;
	IngredientLinkedList cocoa1;
	IngredientLinkedList whippedCream1;

	private Inventory(){

		coffee1 = new IngredientLinkedList();
		coffee1.setName("Coffee");
		ingredients.add(coffee1);
		decafCoffee1 =  new IngredientLinkedList();
		decafCoffee1.setName("Decaf Coffee");
		ingredients.add(decafCoffee1);
		sugar1 =  new IngredientLinkedList();
		sugar1.setName("Sugar");
		ingredients.add(sugar1);
		cream1 =  new IngredientLinkedList();
		cream1.setName("Cream");
		ingredients.add(cream1);
		steamedMilk1 =  new IngredientLinkedList();
		steamedMilk1.setName("Steamed Milk");
		ingredients.add(steamedMilk1);
		foamedMilk1 =  new IngredientLinkedList();
		foamedMilk1.setName("foamedMilk");
		ingredients.add(foamedMilk1);
		espresso1 =  new IngredientLinkedList();
		espresso1.setName("Espresso");
		ingredients.add(espresso1);
		cocoa1 =  new IngredientLinkedList();
		cocoa1.setName("Cocoa");
		ingredients.add(cocoa1);
		whippedCream1 =  new IngredientLinkedList();
		whippedCream1.setName("Whipped Cream");
		ingredients.add(whippedCream1);

/*		coffee = new LinkedList<Ingredient>();
		ingredients.add(coffee);
		decafCoffee = new LinkedList<Ingredient>();
		ingredients.add(decafCoffee);
		sugar = new LinkedList<Ingredient>();
		ingredients.add(sugar);
		cream = new LinkedList<Ingredient>();
		ingredients.add(cream);
		steamedMilk = new LinkedList<Ingredient>();
		ingredients.add(steamedMilk);
		foamedMilk = new LinkedList<Ingredient>();
		ingredients.add(foamedMilk);
		espresso = new LinkedList<Ingredient>();
		ingredients.add(espresso);
		cocoa = new LinkedList<Ingredient>();
		ingredients.add(cocoa);
		whippedCream = new LinkedList<Ingredient>();
		ingredients.add(whippedCream);
		buildInventory();
	*/
	}


	private void buildInventory(){

		for ( int i=0;i<10;i++ ){
			coffee1.add(new CoffeeIngredient());
			decafCoffee1.add(new DecafCoffeeIngredient());
			sugar1.add(new SugarIngredient());
			cream1.add(new CreamIngredient());
			steamedMilk1.add(new SteamedMilkIngredient());
			foamedMilk1.add(new FoamedMilkIngredient());
			espresso1.add(new EspressoIngredient());
			cocoa1.add(new CocoaIngredient());
			whippedCream1.add(new WhippedCreamIngredient());
		}

	}

	public Ingredient getIngredient(Collection<Ingredient> collection) throws NoSuchElementException{
		Ingredient result = null;
		if (null!=collection && collection.size()>0){
			result =((LinkedList<Ingredient>) collection).removeLast();
		}		
		return result;
	}
	
	public int decrement(Collection<Ingredient> collection) throws NoSuchElementException{
		int result = -1;
		if (null!=collection && collection.size()>0){
			((LinkedList<Ingredient>) collection).removeLast();
			result = collection.size();
		}
		return result;
	}

	public int decrementBy(Collection<Ingredient> collection, int decreaseBy)  throws NoSuchElementException{
		int result = -1;
		if (null!=collection && collection.size()>=decreaseBy){
			for (int i=0;i < decreaseBy;i++)
			((LinkedList<Ingredient>) collection).removeLast();
			result = collection.size();
		}
		return result;
	}

	public void refresh(int stockLevel){
		for (int i = coffee.size(); i<stockLevel ;i++ ){
			coffee.add (new CoffeeIngredient() );
		}
		for (int i = sugar.size(); i<stockLevel ;i++ ){
			sugar.add (new SugarIngredient() );
		}
		for (int i = steamedMilk.size(); i<stockLevel ;i++ ){
			steamedMilk.add (new SteamedMilkIngredient() );
		}
		for (int i = foamedMilk.size(); i<stockLevel ;i++ ){
			foamedMilk.add (new FoamedMilkIngredient() );
		}
		for (int i = decafCoffee.size(); i<stockLevel ;i++ ){
			decafCoffee.add (new DecafCoffeeIngredient() );
		}
		for (int i = espresso.size(); i<stockLevel ;i++ ){
			espresso.add (new EspressoIngredient() );
		}
		for (int i = cocoa.size(); i<stockLevel ;i++ ){
			cocoa.add (new CocoaIngredient() );
		}
		for (int i = whippedCream.size(); i<stockLevel ;i++ ){
			whippedCream.add (new WhippedCreamIngredient() );
		}
		for (int i = cream.size(); i<stockLevel ;i++ ){
			cream.add (new CreamIngredient() );
		}
	}

	public String toString(){
	/**
	    Inventory:
	    Cocoa,10
	    Coffee,10
	    Cream,10
	    Decaf Coffee,10
	    Espresso,10
	    Foamed Milk,10
	    Steamed Milk,10
	    Sugar,10
	    Whipped Cream,10
	**/

		String result = new String();
		StringBuilder sb = new StringBuilder();

		sb.append("Inventory:\n");

		for (IngredientLinkedList ingredientList : ingredients){
				sb.append(ingredientList.getName());
				sb.append(" : ");
				sb.append(getCollectionSize(ingredientList.getListOfIngredient()));
				sb.append("\n");
		}
		
		result = sb.toString();

		return result;
	}

	public static int getCollectionSize(Collection<Ingredient> collection){
		int result=-1;
		if ( null!=collection )
			result = collection.size();
		return result;
	}

	public IngredientLinkedList getCoffeeIngredient(){
		return coffee1;
	}

	public IngredientLinkedList getDecafCoffeeIngredient(){
		return decafCoffee1;
	}

	public IngredientLinkedList getSugarIngredient(){
		return sugar1;
	}

	public IngredientLinkedList getCreamIngredient(){
		return cream1;
	}

	public IngredientLinkedList getSteamedMilkIngredient(){
		return steamedMilk1;
	}

	public IngredientLinkedList getFoamedMilkIngredient(){
		return foamedMilk1;
	}

	public IngredientLinkedList getEspressoIngredient(){
		return espresso1;
	}

	public IngredientLinkedList getCocoaIngredient(){
		return cocoa1;
	}

	public IngredientLinkedList getWhippedCreamIngredient(){
		return whippedCream1;
	}

	public Collection<IngredientLinkedList> getIngredients(){
		return ingredients;
	}
}