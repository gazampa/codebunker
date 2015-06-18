package trustwave.barista.factory;

import trustwave.barista.ingredient.Ingredient;
public interface IngredientFactory{

	public Ingredient factoryMethod(String name);

}