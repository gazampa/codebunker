package trustwave.barista.drink;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;

import trustwave.barista.constants.BaristaConstants;
import trustwave.barista.ingredient.*;

public class CaffeLatteDrink implements Drink{
//Caffe Latte 	2 units of espresso, 1 unit of steamed milk
	private final String name = BaristaConstants.getDrinkNameCaffeLatte();
	private BigDecimal price;
	Collection<Ingredient> espresso = new ArrayList<Ingredient>();
	Collection<Ingredient> steamedMilk = new ArrayList<Ingredient>();

	public CaffeLatteDrink(){ }

	public CaffeLatteDrink(BigDecimal price){
		this.price=price;
	}
	public CaffeLatteDrink(int unitsOfEspresso, int unitsOfSteamedMilk, BigDecimal price){
		this.price=price;
		buildDrink(unitsOfEspresso, unitsOfSteamedMilk);
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

	private void buildDrink( int unitsOfEspresso, int unitsOfSteamedMilk){
		for ( int i = 0 ;i<unitsOfEspresso;i++ ){
			espresso.add( new EspressoIngredient() );
		}

		for ( int i = 0 ;i<unitsOfSteamedMilk;i++ ){
			steamedMilk.add( new SteamedMilkIngredient() );
		}
	}

	public boolean equals(Object obj){
		return obj instanceof CaffeLatteDrink && ((CaffeLatteDrink)obj).getName().equalsIgnoreCase(name);
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