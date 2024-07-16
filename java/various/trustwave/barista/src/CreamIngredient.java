import java.math.BigDecimal;
public class CreamIngredient implements Ingredient{

	private final String name="cream";
	private BigDecimal cost = new BigDecimal("0.00");

	public CreamIngredient(){}
	public CreamIngredient(BigDecimal param){cost=param;}


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