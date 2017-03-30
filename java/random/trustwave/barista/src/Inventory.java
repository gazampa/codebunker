import java.util.Collection;
import java.util.LinkedList;

/** GROUP INGREDIENTS USING DEORATOR**/


public class Inventory{

	public static final Inventory INSTANCE = new Inventory();

	Collection<Ingredient> coffee;
	Collection<Ingredient> decafCoffee;;
	Collection<Ingredient> sugar;
	Collection<Ingredient> cream;
	Collection<Ingredient> steamedMilk;
	Collection<Ingredient> foamedMilk;
	Collection<Ingredient> espresso;
	Collection<Ingredient> cocoa;
	Collection<Ingredient> whippedCream;

	private Inventory(){

		coffee = new LinkedList<Ingredient>();
		decafCoffee = new LinkedList<Ingredient>();
		sugar = new LinkedList<Ingredient>();
		cream = new LinkedList<Ingredient>();
		steamedMilk = new LinkedList<Ingredient>();
		foamedMilk = new LinkedList<Ingredient>();
		espresso = new LinkedList<Ingredient>();
		cocoa = new LinkedList<Ingredient>();
		whippedCream = new LinkedList<Ingredient>();

		buildInventory();
	}


	private void buildInventory(){

		for ( int i=0;i<10;i++ ){
			coffee.add(new CoffeeIngredient());
			decafCoffee.add(new DecafCoffeeIngredient());
			sugar.add(new SugarIngredient());
			cream.add(new CreamIngredient());
			steamedMilk.add(new SteamedMilkIngredient());
			foamedMilk.add(new FoamedMilkIngredient());
			//espresso.add(new EspressoIngredient());
			cocoa.add(new CocoaIngredient());
			//whippedCream.add(new WhippedCreamIngredient());
		}

	}

	public void refresh(){
		for (int i = coffee.size(); i<10 ;i++ ){
			coffee.add (new CoffeeIngredient() );
		}

		for (int i = sugar.size(); i<10 ;i++ ){
			sugar.add (new SugarIngredient() );
		}

		for (int i = steamedMilk.size(); i<10 ;i++ ){
			steamedMilk.add (new SteamedMilkIngredient() );
		}

		for (int i = foamedMilk.size(); i<10 ;i++ ){
			foamedMilk.add (new FoamedMilkIngredient() );
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
		sb.append("Coffee, ");
		sb.append(getCollectionSize(coffee));
		sb.append("\n");
		sb.append("Sugar, ");
		sb.append(getCollectionSize(sugar));
		sb.append("\n");
		sb.append("Steamed Milk, ");
		sb.append(getCollectionSize(steamedMilk));
		sb.append("\n");
		sb.append("FoamedMilk,");
		sb.append(getCollectionSize(foamedMilk));
		sb.append("\n");

		result = sb.toString();

		return result;
	}

	public static int getCollectionSize(Collection<Ingredient> collection){
		int result=-1;
		if ( null!=collection )
			result = collection.size();
		return result;
	}

	public static Inventory getInventory(){
		return INSTANCE;
	}

	public Collection<Ingredient> getCoffeeIngredient(){
		return coffee;
	}

	public Collection<Ingredient> getDecafCoffeeIngredient(){
		return decafCoffee;
	}

	public Collection<Ingredient> getSugarIngredient(){
		return sugar;
	}

	public Collection<Ingredient> getCreamIngredient(){
		return cream;
	}

	public Collection<Ingredient> getSteamedMilkIngredient(){
		return steamedMilk;
	}

	public Collection<Ingredient> getFoamedMilkIngredient(){
		return foamedMilk;
	}

	public Collection<Ingredient> getEspressoIngredient(){
		return espresso;
	}

	public Collection<Ingredient> getCocoaIngredient(){
		return cocoa;
	}

	public Collection<Ingredient> getWhippedCreamIngredient(){
		return whippedCream;
	}

}