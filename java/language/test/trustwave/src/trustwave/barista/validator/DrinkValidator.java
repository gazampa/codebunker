package trustwave.barista.validator;

import trustwave.barista.constants.BaristaConstants;
import trustwave.barista.drink.Drink;
import trustwave.barista.inventory.Inventory;

public class DrinkValidator implements Validator{

	Inventory inventory;

	public DrinkValidator(){}
	
	public DrinkValidator(Inventory param){
		 inventory = param;
	}

	public boolean validate(String param){
		boolean result = false;
		String input = new String(param);

		 if ( BaristaConstants.getDrinkNameCaffeAmericano().equalsIgnoreCase(input) ){
			//Caffe Americano 	3 units of espresso
			if ( inventory.getEspressoIngredient().getCollectionSize() >= 3 )
				return true;
		}else if( BaristaConstants.getDrinkNameCaffeLatte().equalsIgnoreCase(input) ){
			//Caffe Latte 	2 units of espresso, 1 unit of steamed milk
			if ( ( inventory.getEspressoIngredient().getCollectionSize()  >= 2 ) &&
					 ( inventory.getSteamedMilkIngredient().getCollectionSize() >=1 ) )
						return true;
		}else if( BaristaConstants.getDrinkNameCaffeMocha().equalsIgnoreCase(input) ){
			//Caffe Mocha 	1 units of Espresso, 1 unit of cocoa,  1 unit of steamed milk, 1 unit of whipped cream
				if ( ( inventory.getEspressoIngredient().getCollectionSize() >= 2) &&
					( inventory.getCocoaIngredient().getCollectionSize() >=1) &&
						( inventory.getSteamedMilkIngredient().getCollectionSize() >=1 ) &&
							( inventory.getWhippedCreamIngredient().getCollectionSize() >=1 ) )
								return true;
		}else if( BaristaConstants.getDrinkNameCappuccino().equalsIgnoreCase(input) ){
			//Cappuccino 	2 units of Espresso, 1 unit of steamed milk, 1 unit of  foamed milk
			if ( ( inventory.getEspressoIngredient().getCollectionSize() >= 2) &&
					( inventory.getSteamedMilkIngredient().getCollectionSize() >=1) &&
							( inventory.getFoamedMilkIngredient().getCollectionSize() >=1 ) )
								return true;
		}else if( BaristaConstants.getDrinkNameCoffee().equalsIgnoreCase(input) ){
			//Coffee 	3 units of coffee, 1 unit of sugar, 1 unit of cream
			if ( ( inventory.getCoffeeIngredient().getCollectionSize() >= 2) &&
					( inventory.getSugarIngredient().getCollectionSize() >=1) &&
							(inventory.getCreamIngredient().getCollectionSize() >=1 ) )
								return true;
		}else if( BaristaConstants.getDrinkNameDecafCoffee().equalsIgnoreCase(input) ){
			//Decaf Coffee 	3 units of Decaf Coffee, 1 unit of sugar, 1 unit of cream
			if ( ( inventory.getDecafCoffeeIngredient().getCollectionSize() >= 2) &&
					( inventory.getSugarIngredient().getCollectionSize() >=1) &&
							( inventory.getCreamIngredient().getCollectionSize() >=1 ) )
				return true;
		}else{
			return false;
		}

		return result;
	}
}