import java.math.BigDecimal;
public class SugarIngredient implements Ingredient{

	private final String name="sugar";
	private BigDecimal cost = new BigDecimal("0.00");

	public SugarIngredient(){}
	public SugarIngredient(BigDecimal param){cost=param;}


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