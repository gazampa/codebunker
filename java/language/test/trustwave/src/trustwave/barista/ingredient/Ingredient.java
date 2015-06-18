package trustwave.barista.ingredient;
import java.math.BigDecimal;

import trustwave.barista.drink.Drink;

public interface Ingredient extends Comparable<Ingredient>{

	public String getName();
	public BigDecimal getCost();

}