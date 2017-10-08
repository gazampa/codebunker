import java.math.BigDecimal;
public class CocoaIngredient implements Ingredient{

	private final String name="cocoa";
	private BigDecimal cost = new BigDecimal("0.00");

	public CocoaIngredient(){}
	public CocoaIngredient(BigDecimal param){cost=param;}

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