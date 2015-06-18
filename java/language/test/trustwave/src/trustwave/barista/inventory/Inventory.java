package trustwave.barista.inventory;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.NoSuchElementException;

import trustwave.barista.constants.BaristaConstants;
import trustwave.barista.ingredient.*;

public class Inventory{
	public static final Inventory INSTANCE = new Inventory();

	public static Inventory getInventory(){ return INSTANCE; }

//	Collection<Collection<Ingredient>> ingredients = new ArrayList<Collection<Ingredient>>();
	Collection<IngredientLinkedList> ingredients = new ArrayList<IngredientLinkedList>();
	
	IngredientLinkedList coffee;
	IngredientLinkedList decafCoffee;
	IngredientLinkedList sugar;
	IngredientLinkedList cream;
	IngredientLinkedList steamedMilk;
	IngredientLinkedList foamedMilk;
	IngredientLinkedList espresso;
	IngredientLinkedList cocoa;
	IngredientLinkedList whippedCream;

	private Inventory(){

		coffee = new IngredientLinkedList();
		coffee.setName(BaristaConstants.getIngredientNameCoffee());
		ingredients.add(coffee);

		decafCoffee =  new IngredientLinkedList();
		decafCoffee.setName(BaristaConstants.getIngredientNameDecafCoffee());
		ingredients.add(decafCoffee);
		
		sugar =  new IngredientLinkedList();
		sugar.setName(BaristaConstants.getIngredientNameSugar());
		ingredients.add(sugar);
		
		cream =  new IngredientLinkedList();
		cream.setName(BaristaConstants.getIngredientNameCream());
		ingredients.add(cream);
		
		steamedMilk =  new IngredientLinkedList();
		steamedMilk.setName(BaristaConstants.getIngredientNameSteamedMilk());
		ingredients.add(steamedMilk);
		
		foamedMilk =  new IngredientLinkedList();
		foamedMilk.setName(BaristaConstants.getIngredientNameFoamedMilk());
		ingredients.add(foamedMilk);
		
		espresso =  new IngredientLinkedList();
		espresso.setName(BaristaConstants.getIngredientNameEspresso());
		ingredients.add(espresso);
		
		cocoa =  new IngredientLinkedList();
		cocoa.setName(BaristaConstants.getIngredientNameCocoa());
		ingredients.add(cocoa);
		
		whippedCream =  new IngredientLinkedList();
		whippedCream.setName(BaristaConstants.getIngredientNameWhippedCream());
		ingredients.add(whippedCream);

		buildInventory();
	}

	private void buildInventory(){

		for ( int i=0;i<BaristaConstants.getStockLevel();i++ ){
			coffee.add(new CoffeeIngredient(BaristaConstants.getUnitPriceCoffee()));
			decafCoffee.add(new DecafCoffeeIngredient(BaristaConstants.getUnitPriceDecafCoffee()));
			sugar.add(new SugarIngredient(BaristaConstants.getUnitPriceSugar()));
			cream.add(new CreamIngredient(BaristaConstants.getUnitPriceCream()));
			steamedMilk.add(new SteamedMilkIngredient(BaristaConstants.getUnitPriceSteamedMilk()));
			foamedMilk.add(new FoamedMilkIngredient(BaristaConstants.getUnitPriceFoamedMilk()));
			espresso.add(new EspressoIngredient(BaristaConstants.getUnitPriceEspresso()));
			cocoa.add(new CocoaIngredient(BaristaConstants.getUnitPriceCocoa()));
			whippedCream.add(new WhippedCreamIngredient(BaristaConstants.getUnitPriceWhippedCream()));
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
		for (int i = coffee.getCollectionSize(); i<stockLevel ;i++ ){
			coffee.add (new CoffeeIngredient(new BigDecimal("0.75")) );
		}
		for (int i = sugar.getCollectionSize(); i<stockLevel ;i++ ){
			sugar.add (new SugarIngredient(new BigDecimal("0.75")) );
		}
		for (int i = steamedMilk.getCollectionSize(); i<stockLevel ;i++ ){
			steamedMilk.add (new SteamedMilkIngredient(new BigDecimal("0.35")) );
		}
		for (int i = foamedMilk.getCollectionSize(); i<stockLevel ;i++ ){
			foamedMilk.add (new FoamedMilkIngredient(new BigDecimal("0.35")) );
		}
		for (int i = decafCoffee.getCollectionSize(); i<stockLevel ;i++ ){
			decafCoffee.add (new DecafCoffeeIngredient(new BigDecimal("0.75")) );
		}
		for (int i = espresso.getCollectionSize(); i<stockLevel ;i++ ){
			espresso.add (new EspressoIngredient(new BigDecimal("1.10")) );
		}
		for (int i = cocoa.getCollectionSize(); i<stockLevel ;i++ ){
			cocoa.add (new CocoaIngredient(new BigDecimal("0.90")) );
		}
		for (int i = whippedCream.getCollectionSize(); i<stockLevel ;i++ ){
			whippedCream.add (new WhippedCreamIngredient(new BigDecimal("1.00")) );
		}
		for (int i = cream.getCollectionSize(); i<stockLevel ;i++ ){
			cream.add (new CreamIngredient(new BigDecimal("0.25")) );
		}
	}

	public String toString(){

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
		return coffee;
	}

	public IngredientLinkedList getDecafCoffeeIngredient(){
		return decafCoffee;
	}

	public IngredientLinkedList getSugarIngredient(){
		return sugar;
	}

	public IngredientLinkedList getCreamIngredient(){
		return cream;
	}

	public IngredientLinkedList getSteamedMilkIngredient(){
		return steamedMilk;
	}

	public IngredientLinkedList getFoamedMilkIngredient(){
		return foamedMilk;
	}

	public IngredientLinkedList getEspressoIngredient(){
		return espresso;
	}

	public IngredientLinkedList getCocoaIngredient(){
		return cocoa;
	}

	public IngredientLinkedList getWhippedCreamIngredient(){
		return whippedCream;
	}

	public Collection<IngredientLinkedList> getIngredients(){
		return ingredients;
	}
}