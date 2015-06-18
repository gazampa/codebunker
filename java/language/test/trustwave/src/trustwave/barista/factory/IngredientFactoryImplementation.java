package trustwave.barista.factory;

import java.math.BigDecimal;

import trustwave.barista.ingredient.*;
public class IngredientFactoryImplementation implements IngredientFactory{

	public Ingredient factoryMethod(String name){
		
		String arg = new String(name);
		
		if  ("COFFEE".equalsIgnoreCase(arg)){
			return new CoffeeIngredient();
		}else if ("DECAF_COFFEE".equalsIgnoreCase(arg)){
			return new DecafCoffeeIngredient();
		}else if ("COCOA".equalsIgnoreCase(arg)){
			return new CocoaIngredient();
		}else if ("CREAM".equalsIgnoreCase(arg)){
			return new CreamIngredient();
		}else if ("ESPRESSO".equalsIgnoreCase(arg)){
			return new EspressoIngredient();
		}else if ("FOAMEDMILK".equalsIgnoreCase(arg)){
			return new FoamedMilkIngredient();
		}else if ("STEAMEDMILK".equalsIgnoreCase(arg)){
			return new SteamedMilkIngredient();
		}else if ("SUGAR".equalsIgnoreCase(arg)){
			return new SugarIngredient();
		}else if ("WHIPPED_CREAM".equalsIgnoreCase(arg)){
			return new WhippedCreamIngredient();
		}

			
		return null;

	}

}