import java.math.BigDecimal;
public class DecafCoffeeIngredient implements Ingredient{

	private final String name="coffee";
	private BigDecimal cost = new BigDecimal("0.00");

	public DecafCoffeeIngredient(){}
	public DecafCoffeeIngredient(BigDecimal param){cost=param;}

	public String getName(){
		return name;
	}

	public BigDecimal getCost(){
		return cost;
	}

	public void setCost(BigDecimal param){
		cost=param;
	}

}