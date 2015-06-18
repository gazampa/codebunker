package trustwave.barista.drink;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;

import trustwave.barista.constants.BaristaConstants;
import trustwave.barista.ingredient.*;

public class CaffeMochaDrink implements Drink{
//	1 units of Espresso, 1 unit of cocoa,  1 unit of steamed milk, 1 unit of whipped cream
	private final String name = BaristaConstants.getDrinkNameCaffeMocha();
	private BigDecimal price;
	Collection<Ingredient> espresso = new ArrayList<Ingredient>();
	Collection<Ingredient> cocoa = new ArrayList<Ingredient>();
	Collection<Ingredient> steamedMilk = new ArrayList<Ingredient>();
	Collection<Ingredient> whippedCream = new ArrayList<Ingredient>();
	
	public CaffeMochaDrink(){ }

	public CaffeMochaDrink(BigDecimal price){
		this.price=price;		
	}
	
	public CaffeMochaDrink(int unitsOfEspresso, int unitsOfCocoa, int unitsOfSteamedMilk, int unitsOfWhippedCream, BigDecimal price){
		this.price=price;
		buildDrink(unitsOfEspresso, unitsOfCocoa, unitsOfSteamedMilk, unitsOfWhippedCream);
	}

	public String getName(){
		return name;
	}

	public BigDecimal getPrice(){
		return price;
	}

	public int getUnits(Collection<Ingredient> ingredients){
		int result = 0;
		if ( null!=ingredients )
			result = ingredients.size();
		return result;
	}

	private void buildDrink(int unitsOfEspresso, int unitsOfCocoa, int unitsOfSteamedMilk, int unitsOfWhippedCream ){
		for ( int i = 0 ;i<unitsOfEspresso;i++ ){
			espresso.add( new EspressoIngredient() );
		}

		for ( int i = 0 ;i<unitsOfCocoa;i++ ){
			cocoa.add( new CocoaIngredient() );
		}

		for ( int i = 0 ;i<unitsOfSteamedMilk;i++ ){
			steamedMilk.add( new SteamedMilkIngredient() );
		}
		
		for ( int i = 0 ;i<unitsOfWhippedCream;i++ ){
			steamedMilk.add( new WhippedCreamIngredient() );
		}

	}

	public boolean equals(Object obj){
		return obj instanceof CaffeMochaDrink && ((CaffeMochaDrink)obj).getName().equalsIgnoreCase(name);
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