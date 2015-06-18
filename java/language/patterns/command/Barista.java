/**
 * 
 * idea : Make Drinks Lightweight ( enums ) then use validators for construction of drinks
 * maintan stock levels use validator as state machine.
 * 
 * TODO : make menu object oriented, pain in the backside. i like the way mine is configurable
 * 			but it couples the Object into the menu item. sounds bad, is it ?
 */
import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.Scanner;

import trustwave.barista.constants.BaristaConstants;
import trustwave.barista.drink.Drink;
import trustwave.barista.drink.collection.DrinksForSale;
import trustwave.barista.factory.DrinkFactory;
import trustwave.barista.factory.DrinkFactoryImplementation;
import trustwave.barista.inventory.Inventory;
import trustwave.barista.menu.Menu;
import trustwave.barista.menu.MenuItem;
import trustwave.barista.utility.BaristaUtility;
import trustwave.barista.validator.RegularExpressionValidator;
import trustwave.barista.validator.Validator;

public class Barista {
	
	public static void main(String[] args){

		/** Get Inventory Data**/
		Inventory inventory = Inventory.getInventory();

		/** Get Available Drink**/
		DrinksForSale drinks = DrinksForSale.getAvailableDrinks();
		
		/**Its possible to order the menu by Drink Name and Price
		 * Collections.sort( ( (ArrayList<Drink> )drinksForSale ), DrinkComparators.ORDER_BY_PRICE);
		 * Collections.sort( ( (ArrayList<Drink> )drinksForSale ), DrinkComparators.ORDER_BY_NAME);
		 */
		
		/** Build Menu **/
		Menu menu = Menu.getMenu();
		Collection<Drink> drinksForSale = drinks.getDrinksForSale();
		for (int i=0; i<6; i++ ){
			MenuItem menuItem = new MenuItem("menuItem_" + (i+1));
			menuItem.setMenuItemIndex(i+1);
			menu.addMenuItem(menuItem);
		}		
		
		/**Load Scanner To Read Input**/
		Scanner scanner = new Scanner(System.in);
		String input = new String();
		
		/** Load a Validator for the User Input
		** "^[RrQq1-6]$" Load Input Validator.
		**/
		Validator validator = new RegularExpressionValidator("^[RrQq1-6]$");

		System.out.println("### Barista Application ###");
		System.out.println(	BaristaUtility.PrintInventory(inventory) );
		System.out.println(	BaristaUtility.PrintMenu(menu, inventory) );
		/**
			Application Loop
		**/
		while ( !"Q".equalsIgnoreCase(input)){
			
			input = scanner.next();

			if ( null!=input ){
				char[] request = input.toCharArray();
				StringBuilder sbSuccess = new StringBuilder();
				StringBuilder sbFailed = new StringBuilder();
				if ( null!=request ){
					for ( int i = 0;i<request.length;i++){		
						char command = request[i];
						if ( validator.validate(String.valueOf(command)) ) {
							sbSuccess.append(command);
						}else{
							sbFailed.append(command);
						}
					}
					
					sbSuccess.trimToSize();
					for (int i=0;i<sbSuccess.length();i++){					
						EXECUTE_COMMAND(String.valueOf(sbSuccess.charAt(i)), inventory, menu);
					}
				}
			}				
		}	
	}

	public static void EXECUTE_COMMAND(String decision, Inventory inventory, Menu menu){
		if ("NUMBER".equalsIgnoreCase(decision)){
			menu.storeAndExecute(buildDrink);
		}
		
		if ("R".equalsIgnoreCase(decision)){
			menu.storeAndExecute(refresh);
		}

		if ("Q".equalsIgnoreCase(decision)){
			menu.storeAndExecute(quit);
		}
		
		System.out.println(decision);
	
	}
	
	public static void _EXECUTE_COMMAND(String input, Inventory inventory, Menu menu){
		if("Q".equalsIgnoreCase(input) ){
			System.out.println( "quitting application : " + input );
			System.exit(1);
		}else if ("R".equalsIgnoreCase(input)){
			inventory.refresh(BaristaConstants.getStockLevel());
			System.out.println(BaristaUtility.PrintInventory(inventory));
			System.out.println(BaristaUtility.PrintMenu(menu, inventory));
		}else if("1".equalsIgnoreCase(input)){
			//Get Menu Index
			int menuIndex = BaristaUtility.GetMenuIndex(input);
			//GetMenuItem
			MenuItem itemOrdered = BaristaUtility.GetMenuItem(menuIndex, menu);
			//Get Drink
			Drink drink = itemOrdered.getMenuItem();
			//validate
			if ( BaristaUtility.validateDrink(drink.getName(),inventory) ){
				BUILD_DRINK(drink.getName(), inventory);
				System.out.println("Dispensing Drink : " + drink.getName());
			}else{
				System.out.println("Out Of Stock");
			}
			System.out.println(BaristaUtility.PrintInventory(inventory));
			System.out.println(BaristaUtility.PrintMenu(menu, inventory));
		}else if("2".equalsIgnoreCase(input)){
			//Get Menu Index
			int menuIndex = BaristaUtility.GetMenuIndex(input);
			//GetMenuItem
			MenuItem itemOrdered = BaristaUtility.GetMenuItem(menuIndex, menu);
			//Get Drink
			Drink drink = itemOrdered.getMenuItem();
			//validate
			if ( BaristaUtility.validateDrink(drink.getName(),inventory) ){
				BUILD_DRINK(drink.getName(), inventory);
				System.out.println("Dispensing Drink : " + BaristaUtility.formatName(drink.getName()));
			}else{
				System.out.println("Out Of Stock");
			}
			System.out.println(BaristaUtility.PrintInventory(inventory));
			System.out.println(BaristaUtility.PrintMenu(menu, inventory));
		}else if("3".equalsIgnoreCase(input)){
			//Get Menu Index
			int menuIndex = BaristaUtility.GetMenuIndex(input);
			//GetMenuItem
			MenuItem itemOrdered = BaristaUtility.GetMenuItem(menuIndex, menu);
			//Get Drink
			Drink drink = itemOrdered.getMenuItem();
			//validate
			if ( BaristaUtility.validateDrink(drink.getName(),inventory) ){
				BUILD_DRINK(drink.getName(), inventory);
				System.out.println("Dispensing Drink : " + BaristaUtility.formatName(drink.getName()));
			}else{
				System.out.println("Out Of Stock");
			}
			System.out.println(BaristaUtility.PrintInventory(inventory));
			System.out.println(BaristaUtility.PrintMenu(menu, inventory));
		}else if("4".equalsIgnoreCase(input)){
			int menuIndex = BaristaUtility.GetMenuIndex(input);
			//GetMenuItem
			MenuItem itemOrdered = BaristaUtility.GetMenuItem(menuIndex, menu);
			//Get Drink
			Drink drink = itemOrdered.getMenuItem();
			//validate
			if ( BaristaUtility.validateDrink(drink.getName(),inventory) ){
				BUILD_DRINK(drink.getName(), inventory);
				System.out.println("Dispensing Drink : " + BaristaUtility.formatName(drink.getName()));
			}else{
				System.out.println("Out Of Stock");
			}
			System.out.println(BaristaUtility.PrintInventory(inventory));
			System.out.println(BaristaUtility.PrintMenu(menu, inventory));
		}else if("5".equalsIgnoreCase(input)){
			//Get Menu Index
			int menuIndex = BaristaUtility.GetMenuIndex(input);
			//GetMenuItem
			MenuItem itemOrdered = BaristaUtility.GetMenuItem(menuIndex, menu);
			//Get Drink
			Drink drink = itemOrdered.getMenuItem();
			//validate
			if ( BaristaUtility.validateDrink(drink.getName(),inventory) ){
				BUILD_DRINK(drink.getName(), inventory);
				System.out.println("Dispensing Drink : " + BaristaUtility.formatName(drink.getName()));
			}else{
				System.out.println("Out Of Stock");
			}
			System.out.println(BaristaUtility.PrintInventory(inventory));
			System.out.println(BaristaUtility.PrintMenu(menu, inventory));
		}else if("6".equalsIgnoreCase(input)){
			//Get Menu Index
			int menuIndex = BaristaUtility.GetMenuIndex(input);
			//GetMenuItem
			MenuItem itemOrdered = BaristaUtility.GetMenuItem(menuIndex, menu);
			//Get Drink
			Drink drink = itemOrdered.getMenuItem();
			//validate
			if ( BaristaUtility.validateDrink(drink.getName(),inventory) ){
				BUILD_DRINK(drink.getName(), inventory);
				System.out.println("Dispensing Drink : " + BaristaUtility.formatName(drink.getName()));
			}else{
				System.out.println("Out Of Stock");
			}
			System.out.println(BaristaUtility.PrintInventory(inventory));
			System.out.println(BaristaUtility.PrintMenu(menu, inventory));
		}else{
			System.out.println( "Invalid selection : invalid validation:  " + input );
		}	
	}
	

	public static String GET_DRINK(String input, DrinksForSale drinks, Inventory inventory){
		String result = new String();

		if ( BaristaConstants.getDrinkNameCaffeAmericano().equalsIgnoreCase(input) ){
			if ( BaristaUtility.validateDrink( input, inventory ) ){
				BUILD_DRINK(input, inventory);
				result = "Dispensing: " + "Caffe Americano";
				
			}else{
				result = "Out of Stock: " + "Americano";
			}
		}else if( BaristaConstants.getDrinkNameCaffeLatte().equalsIgnoreCase(input) ){
			if ( BaristaUtility.validateDrink( input, inventory ) ){
				BUILD_DRINK(input, inventory);
				result = "Dispensing: " + "Caffe Latte";
			}else{
				result = "Out of Stock: " + "Caffe Latte";
			}				
		}else if( BaristaConstants.getDrinkNameCaffeMocha().equalsIgnoreCase(input) ){
			if ( BaristaUtility.validateDrink( input, inventory ) ){
				BUILD_DRINK(input, inventory);
				result="Dispensing: " + "Caffe Mocha";
		}else{
			result = "Out of Stock: " + "Caffe Mocha";
		}
		}else if( BaristaConstants.getDrinkNameCappuccino().equalsIgnoreCase(input) ){
			if ( BaristaUtility.validateDrink( input, inventory ) ){
				BUILD_DRINK(input, inventory);
				result="Dispensing: " + "Cappuccino";
			}else{
				result = "Out of Stock: " + "Cappuccino";
			}			
		}else if( BaristaConstants.getDrinkNameCoffee().equalsIgnoreCase(input) ){
			if ( BaristaUtility.validateDrink( input, inventory ) ){
				BUILD_DRINK(input, inventory);
				result="Dispensing:" + "Coffee";
			}else{
				result = "Out of Stock:" + "Coffee";
			}				
		}else if( BaristaConstants.getDrinkNameDecafCoffee().equalsIgnoreCase(input) ){
			if ( BaristaUtility.validateDrink( input, inventory ) ){
				BUILD_DRINK(input, inventory);
				result="Dispensing: " + "Decaf Coffee";
			}else{
				result = "Out of Stock:" + "Decaf Coffee";
			}
		}else{
			result ="Unable to Dispense";
		}

		return result;
	}

	public static Drink BUILD_DRINK(String input, Inventory inventory){
		Drink result = null;
		
		DrinkFactory factory = new DrinkFactoryImplementation();

		if ( BaristaConstants.getDrinkNameCaffeAmericano().equalsIgnoreCase(input) ){
			try{	
				inventory.getEspressoIngredient().decrementBy(3);
				result = factory.factoryMethod(input);
			}catch(NoSuchElementException e){
				System.out.println("An Exception occured during operation " + e);
			}
		}else if( BaristaConstants.getDrinkNameCaffeLatte().equalsIgnoreCase(input) ){
			try{
				inventory.getEspressoIngredient().decrementBy(2);
				inventory.getSteamedMilkIngredient().decrementBy(1);
				result = factory.factoryMethod(input);
			}catch(NoSuchElementException e){
				System.out.println("An Exception occured during operation " + e);
			}
		}else if( BaristaConstants.getDrinkNameCaffeMocha().equalsIgnoreCase(input) ){
			try{
				inventory.getEspressoIngredient().decrementBy(1);
				inventory.getCocoaIngredient().decrementBy(1);
				inventory.getSteamedMilkIngredient().decrementBy(1);
				inventory.getWhippedCreamIngredient().decrementBy(1);
				result = factory.factoryMethod(input);
			}catch(NoSuchElementException e){
				System.out.println("An Exception occured during operation " + e);
			}
		}else if( BaristaConstants.getDrinkNameCappuccino().equalsIgnoreCase(input) ){
			try{
				inventory.getEspressoIngredient().decrementBy(2);
				inventory.getSteamedMilkIngredient().decrementBy(1);
				inventory.getFoamedMilkIngredient().decrementBy(1);
				result = factory.factoryMethod(input);
			}catch(NoSuchElementException e){
				System.out.println("An Exception occured during operation " + e);
			}	
		}else if( BaristaConstants.getDrinkNameCoffee().equalsIgnoreCase(input) ){
			try{
				inventory.getCoffeeIngredient().decrementBy(3);
				inventory.getSugarIngredient().decrementBy(1);
				inventory.getCreamIngredient().decrementBy(1);
				result = factory.factoryMethod(input);
			}catch(NoSuchElementException e){
				System.out.println("An Exception occured during operation " + e);
			}
		}else if( BaristaConstants.getDrinkNameDecafCoffee().equalsIgnoreCase(input) ){
			try{
				inventory.getDecafCoffeeIngredient().decrementBy(3);
				inventory.getSugarIngredient().decrementBy(1);
				inventory.getCreamIngredient().decrementBy(1);
				result = factory.factoryMethod(input);
			}catch(NoSuchElementException e){
				System.out.println("An Exception occured during operation " + e);
			}		
		}else{
			result=null;
		}
		return result;

	}

}

//if ( validator.validate(input) ) {
//EXECUTE_COMMAND(input, inventory, menu);			
//}else{
//System.out.println( "Invalid selection: " + input );
//}
