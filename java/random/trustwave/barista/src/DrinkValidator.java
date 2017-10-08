public class DrinkValidator{

	Inventory inventory;

	public DrinkValidator(Inventory param){
		 inventory = param;
	}

	public boolean validate(String param){
		boolean result = false;
		String input = new String(param);

		if ( "1".equalsIgnoreCase(input) ){
			//Caffe Americano 	3 units of espresso
			if ( Inventory.getCollectionSize(inventory.getEspressoIngredient()) >= 3 )
				return true;
		}else if( "2".equalsIgnoreCase(input) ){
			//Caffe Latte 	2 units of espresso, 1 unit of steamed milk
			if ( Inventory.getCollectionSize(inventory.getEspressoIngredient()) >= 2);
			if ( Inventory.getCollectionSize(inventory.getEspressoIngredient()) >=1);
		}else if( "3".equalsIgnoreCase(input) ){
			//Caffe Mocha 	1 units of Espresso, 1 unit of cocoa,  1 unit of steamed milk, 1 unit of whipped cream
			Inventory.getCollectionSize(inventory.getEspressoIngredient());
			Inventory.getCollectionSize(inventory.getEspressoIngredient());
			Inventory.getCollectionSize(inventory.getEspressoIngredient());
			Inventory.getCollectionSize(inventory.getEspressoIngredient());
		}else if( "4".equalsIgnoreCase(input) ){
			//Cappuccino 	2 units of Espresso, 1 unit of steamed milk, 1 unit of  foamed milk
			Inventory.getCollectionSize(inventory.getEspressoIngredient());
			Inventory.getCollectionSize(inventory.getEspressoIngredient());
			Inventory.getCollectionSize(inventory.getEspressoIngredient());
			Inventory.getCollectionSize(inventory.getEspressoIngredient());
		}else if( "5".equalsIgnoreCase(input) ){
			//Coffee 	3 units of coffee, 1 unit of sugar, 1 unit of cream
			Inventory.getCollectionSize(inventory.getEspressoIngredient());
			Inventory.getCollectionSize(inventory.getEspressoIngredient());
			Inventory.getCollectionSize(inventory.getEspressoIngredient());
		}else if( "6".equalsIgnoreCase(input) ){
			//Decaf Coffee 	3 units of Decaf Coffee, 1 unit of sugar, 1 unit of cream
			Inventory.getCollectionSize(inventory.getEspressoIngredient());
		}else{
			// whats a good value here
		}
		return result;
	}

}