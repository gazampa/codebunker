import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
public class CoffeeDrink implements Drink{
//Coffee 	3 units of coffee, 1 unit of sugar, 1 unit of cream
	private final String NAME = "COFFEE";
	private BigDecimal price;
	private int unitsOfCoffee = 3;
	private int unitsOfSugar = 1;
	private int unitsOfCream = 1;
	Collection<Ingredient> coffee = new ArrayList<Ingredient>();
	Collection<Ingredient> sugar = new ArrayList<Ingredient>();
	Collection<Ingredient> cream = new ArrayList<Ingredient>();

	public CoffeeDrink(){

		buildDrink();

	}

	public String getName(){
		return NAME;
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

	private void buildDrink(){
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

}