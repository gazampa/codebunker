import java.math.BigDecimal;
public class FoamedMilkIngredient implements Ingredient{

	private final String name="milk";
	private BigDecimal cost = new BigDecimal("0.00");

	public FoamedMilkIngredient(){}
	public FoamedMilkIngredient(BigDecimal param){cost=param;}


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