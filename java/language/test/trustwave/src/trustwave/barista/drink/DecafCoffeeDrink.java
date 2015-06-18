package trustwave.barista.drink;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;

import trustwave.barista.constants.BaristaConstants;
import trustwave.barista.ingredient.*;

public class DecafCoffeeDrink implements Drink{
//Coffee 	3 units of coffee, 1 unit of sugar, 1 unit of cream
	private final String name = BaristaConstants.getDrinkNameDecafCoffee();
	private BigDecimal price;
	Collection<Ingredient> decafCoffee = new ArrayList<Ingredient>();
	Collection<Ingredient> sugar = new ArrayList<Ingredient>();
	Collection<Ingredient> cream = new ArrayList<Ingredient>();


	public DecafCoffeeDrink(){}
	
	public DecafCoffeeDrink(BigDecimal price){
		this.price = price;
	}
	public DecafCoffeeDrink(int unitsOfDecafCoffee, int unitsOfSugar, int unitsOfCream, BigDecimal price){
		this.price=price;
		buildDrink(unitsOfDecafCoffee, unitsOfSugar, unitsOfCream);
	}

	public String getName(){
		return name;
	}

	public BigDecimal getPrice(){
		return price;
	}

	private int getUnits(Collection<Ingredient> ingredients){
		int result = 0;
		if ( null!=ingredients )
			result = ingredients.size();
		return result;
	}

	private void buildDrink( int unitsOfDecafCoffee, int unitsOfSugar, int unitsOfCream){
		for ( int i = 0 ;i<unitsOfDecafCoffee;i++ ){
			decafCoffee.add( new DecafCoffeeIngredient() );
		}

		for ( int i = 0 ;i<unitsOfSugar;i++ ){
			sugar.add( new SugarIngredient() );
		}

		for ( int i = 0 ;i<unitsOfCream;i++ ){
			cream.add( new CreamIngredient() );
		}
	}

	public boolean equals(Object obj){
		return obj instanceof DecafCoffeeDrink && ((DecafCoffeeDrink)obj).getName().equalsIgnoreCase(name);
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