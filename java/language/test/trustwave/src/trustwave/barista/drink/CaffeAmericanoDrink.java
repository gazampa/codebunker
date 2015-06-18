package trustwave.barista.drink;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;

import trustwave.barista.constants.BaristaConstants;
import trustwave.barista.ingredient.*;

public class CaffeAmericanoDrink implements Drink{
//Coffee 	3 units of coffee, 1 unit of sugar, 1 unit of cream
	private final String name = BaristaConstants.getDrinkNameCaffeAmericano();
	private BigDecimal price;
	Collection<Ingredient> coffee = new ArrayList<Ingredient>();
	Collection<Ingredient> sugar = new ArrayList<Ingredient>();
	Collection<Ingredient> cream = new ArrayList<Ingredient>();

	public CaffeAmericanoDrink(){}

	public CaffeAmericanoDrink(BigDecimal price){
		this.price = price;
	}
	
	public CaffeAmericanoDrink(int unitsOfCoffee, int unitsOfSugar, int unitsOfCream, BigDecimal price){
		this.price=price;
		buildDrink(unitsOfCoffee, unitsOfSugar, unitsOfCream);
	}

	public String getName(){
		return name;
	}

	public BigDecimal getPrice(){
		return price;
	}

	private void buildDrink( int unitsOfCoffee, int unitsOfSugar, int unitsOfCream ){
		for ( int i = 0 ;i<unitsOfCoffee;i++ ){
			coffee.add( new CoffeeIngredient() );
		}

		for ( int i = 0 ;i<unitsOfSugar;i++ ){
			sugar.add( new SugarIngredient() );
		}

		for ( int i = 0 ;i<unitsOfCream;i++ ){
			cream.add( new CreamIngredient() );
		}
	}

	public boolean equals(Object obj){
		return obj instanceof CaffeAmericanoDrink && ((CaffeAmericanoDrink)obj).getName().equalsIgnoreCase(name);
	}
	
	public int hashCode(){
		int result = 31;
		try {
			int abc = Integer.valueOf(this.name);
			result = result*abc;
		}catch (NumberFormatException nfe){
			System.out.println("Exception thrown : " + nfe);
		}
		return result;
	}	

	public String toString(){
		String result = new String();
		StringBuilder sb = new StringBuilder();
		
		sb.append(name);
		sb.append(" : ");
		sb.append(price);
		
		result = sb.toString();
		
		return result;
	}

	public int compareTo(Drink drink) {
		return this.getName().compareTo(drink.getName());
	}
	
}