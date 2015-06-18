package trustwave.barista.drink;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import trustwave.barista.constants.BaristaConstants;
import trustwave.barista.validator.Validator;

public class DrinksForSale{
	
	ArrayList<Drink> drinksForSale = new ArrayList<Drink>();
	
	ArrayList<String> stuff = new ArrayList<String>();
	
	public static final DrinksForSale INSTANCE = new DrinksForSale();
	public static DrinksForSale getAvailableDrinks(){return INSTANCE;}
	
	private DrinksForSale(){
		
		buildAvailableDrinks();
	}

	private void buildAvailableDrinks(){
		drinksForSale.add(new CoffeeDrink(BaristaConstants.getPriceCoffee()) );
		drinksForSale.add(new DecafCoffeeDrink(BaristaConstants.getPriceDecafCoffee()) );
		drinksForSale.add(new CaffeLatteDrink(BaristaConstants.getPriceLatte()) );
		drinksForSale.add(new CaffeMochaDrink(BaristaConstants.getPriceMocha()) );
		drinksForSale.add(new CappuccinoDrink(BaristaConstants.getPriceCappuccino()) );		
		drinksForSale.add(new CaffeAmericanoDrink(BaristaConstants.getPriceAmericano()) );
	}
	
	public Collection<Drink> getDrinksForSale(){
		return drinksForSale;
	}
	
	private void addDrink(Collection<Drink> availableDrinks, Drink drink){
		if (null!=availableDrinks && null!=drink){
			availableDrinks.add(drink);
		}
	}

	public Drink getDrink(int index){
		Drink result = null;
		if ( null!=drinksForSale)
			result = ((ArrayList<Drink>)drinksForSale).get(index);
		return result;
	}
	
	public static boolean isAvailable(Validator DrinkValidator, Drink drink){
		return DrinkValidator.validate(drink.getName());
	}
	
	public String toString(){
		String result = new String();
		StringBuilder sb = new StringBuilder();
		for ( Drink drink : drinksForSale ){
			sb.append(drink.getName());
			sb.append(", ");
			sb.append(drink.getPrice());
			sb.append("\n");
		}
		return result;
	}
}