package trustwave.barista.factory;

import trustwave.barista.constants.BaristaConstants;
import trustwave.barista.drink.*;
public class DrinkFactoryImplementation implements DrinkFactory{

	public Drink factoryMethod(String name){
		
		String arg = new String(name);
		
		if  (BaristaConstants.getDrinkNameCoffee().equalsIgnoreCase(arg)){
			return new CoffeeDrink(BaristaConstants.getPriceCoffee());
		}else if (BaristaConstants.getDrinkNameDecafCoffee().equalsIgnoreCase(arg)){
			return new DecafCoffeeDrink(BaristaConstants.getPriceDecafCoffee());
		}else if (BaristaConstants.getDrinkNameCappuccino().equalsIgnoreCase(arg)){
			return new CappuccinoDrink(BaristaConstants.getPriceCappuccino());
		}else if (BaristaConstants.getDrinkNameCaffeLatte().equalsIgnoreCase(arg)){
			return new CaffeLatteDrink(BaristaConstants.getPriceLatte());
		}else if (BaristaConstants.getDrinkNameCaffeMocha().equalsIgnoreCase(arg)){
			return new CaffeMochaDrink(BaristaConstants.getPriceMocha());
		}else if (BaristaConstants.getDrinkNameCaffeAmericano().equalsIgnoreCase(arg)){
			return new CaffeAmericanoDrink(BaristaConstants.getPriceAmericano());
		}
			
		return null;

	}

}