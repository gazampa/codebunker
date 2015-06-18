package trustwave.barista.ingredient;
import java.math.BigDecimal;

public class CreamIngredient implements Ingredient{

	private final String name="CREAM";
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

	public boolean equals(Object obj){
		return obj instanceof CreamIngredient && ((CreamIngredient)obj).getName().equalsIgnoreCase(name);
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
		sb.append(cost);
		
		result = sb.toString();
		
		return result;
	}

	public int compareTo(Ingredient ingredient) {
		return this.getName().compareTo(ingredient.getName());
	}
	
}