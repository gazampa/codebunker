import java.math.BigDecimal;
public class SteamedMilkIngredient implements Ingredient{

	private final String name="steamedmilk";
	private BigDecimal cost = new BigDecimal("0.00");

	public SteamedMilkIngredient(){}
	public SteamedMilkIngredient(BigDecimal param){cost=param;}


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