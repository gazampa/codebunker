package trustwave.barista.drink;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Comparator;

import trustwave.barista.ingredient.Ingredient;
//Generic Interface for Drink
public interface Drink extends Comparable<Drink>{

	public String getName();

	public BigDecimal getPrice();

}