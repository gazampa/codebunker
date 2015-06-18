package trustwave.barista.ingredient;

import java.util.Comparator;

public class IngredientComparators{
	
	public static final Comparator<Ingredient> ORDER_BY_NAME =
		 new Comparator<Ingredient>() {
			public int compare(Ingredient ingredient1, Ingredient ingredient2) {
				return ingredient1.getName().compareTo(ingredient2.getName());
			}
	};

	public static final Comparator<Ingredient> ORDER_BY_COST =
		 new Comparator<Ingredient>() {
			public int compare(Ingredient ingredient1, Ingredient ingredient2) {
				return ingredient1.getCost().compareTo(ingredient2.getCost());
			}
	};	
	
	
}