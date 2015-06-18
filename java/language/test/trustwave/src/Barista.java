
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.Scanner;

import trustwave.barista.constants.BaristaConstants;
import trustwave.barista.drink.DrinkComparators;
import trustwave.barista.drink.DrinksForSale;
import trustwave.barista.drink.Drink;
import trustwave.barista.factory.DrinkFactory;
import trustwave.barista.factory.DrinkFactoryImplementation;
import trustwave.barista.ingredient.IngredientLinkedList;
import trustwave.barista.inventory.Inventory;
import trustwave.barista.menu.Menu;
import trustwave.barista.menu.MenuItem;
import trustwave.barista.utility.BaristaUtility;
import trustwave.barista.validator.DrinkValidator;
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
		for (Drink drink : drinksForSale){
			MenuItem menuItem = new MenuItem(drink);
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
		System.out.println(	PRINT_INVENTORY(inventory) );
		System.out.println(	PRINT_MENU(menu, inventory) );
		/**
			Application Loop
		**/
		while ( !"Q".equalsIgnoreCase(input)){
			
			input = scanner.next();
			if ( validator.validate(input) ) {
				EXECUTE_COMMAND(input, inventory, menu);			
			}else{
				System.out.println( "Invalid selection: " + input );
			}
		
		}
	}

	public static void EXECUTE_COMMAND(String input, Inventory inventory, Menu menu){
		if("Q".equalsIgnoreCase(input) ){
			System.out.println( "quitting application : " + input );
			System.exit(1);
		}else if ("R".equalsIgnoreCase(input)){
			inventory.refresh(BaristaConstants.getStockLevel());
			System.out.println(PRINT_INVENTORY(inventory));
			System.out.println(PRINT_MENU(menu, inventory));
		}else if("1".equalsIgnoreCase(input)){
			//Get Menu Index
			int menuIndex = GET_MENU_INDEX(input);
			//GetMenuItem
			MenuItem itemOrdered = GET_MENU_ITEM(menuIndex, menu);
			//Get Drink
			Drink drink = itemOrdered.getMenuItem();
			//validate
			if ( VALIDATE_DRINK(drink.getName(),inventory) ){
				BUILD_DRINK(drink.getName(), inventory);
				System.out.println("Dispensing Drink : " + drink.getName());
			}else{
				System.out.println("Out Of Stock");
			}
			System.out.println(PRINT_INVENTORY(inventory));
			System.out.println(PRINT_MENU(menu, inventory));
		}else if("2".equalsIgnoreCase(input)){
			//Get Menu Index
			int menuIndex = GET_MENU_INDEX(input);
			//GetMenuItem
			MenuItem itemOrdered = GET_MENU_ITEM(menuIndex, menu);
			//Get Drink
			Drink drink = itemOrdered.getMenuItem();
			//validate
			if ( VALIDATE_DRINK(drink.getName(),inventory) ){
				BUILD_DRINK(drink.getName(), inventory);
				System.out.println("Dispensing Drink : " + drink.getName());
			}else{
				System.out.println("Out Of Stock");
			}
			System.out.println(PRINT_INVENTORY(inventory));
			System.out.println(PRINT_MENU(menu, inventory));
		}else if("3".equalsIgnoreCase(input)){
			//Get Menu Index
			int menuIndex = GET_MENU_INDEX(input);
			//GetMenuItem
			MenuItem itemOrdered = GET_MENU_ITEM(menuIndex, menu);
			//Get Drink
			Drink drink = itemOrdered.getMenuItem();
			//validate
			if ( VALIDATE_DRINK(drink.getName(),inventory) ){
				BUILD_DRINK(drink.getName(), inventory);
				System.out.println("Dispensing Drink : " + drink.getName());
			}else{
				System.out.println("Out Of Stock");
			}
			System.out.println(PRINT_INVENTORY(inventory));
			System.out.println(PRINT_MENU(menu, inventory));
		}else if("4".equalsIgnoreCase(input)){
			int menuIndex = GET_MENU_INDEX(input);
			//GetMenuItem
			MenuItem itemOrdered = GET_MENU_ITEM(menuIndex, menu);
			//Get Drink
			Drink drink = itemOrdered.getMenuItem();
			//validate
			if ( VALIDATE_DRINK(drink.getName(),inventory) ){
				BUILD_DRINK(drink.getName(), inventory);
				System.out.println("Dispensing Drink : " + drink.getName());
			}else{
				System.out.println("Out Of Stock");
			}
			System.out.println(PRINT_INVENTORY(inventory));
			System.out.println(PRINT_MENU(menu, inventory));
		}else if("5".equalsIgnoreCase(input)){
			//Get Menu Index
			int menuIndex = GET_MENU_INDEX(input);
			//GetMenuItem
			MenuItem itemOrdered = GET_MENU_ITEM(menuIndex, menu);
			//Get Drink
			Drink drink = itemOrdered.getMenuItem();
			//validate
			if ( VALIDATE_DRINK(drink.getName(),inventory) ){
				BUILD_DRINK(drink.getName(), inventory);
				System.out.println("Dispensing Drink : " + drink.getName());
			}else{
				System.out.println("Out Of Stock");
			}
			System.out.println(PRINT_INVENTORY(inventory));
			System.out.println(PRINT_MENU(menu, inventory));
		}else if("6".equalsIgnoreCase(input)){
			//Get Menu Index
			int menuIndex = GET_MENU_INDEX(input);
			//GetMenuItem
			MenuItem itemOrdered = GET_MENU_ITEM(menuIndex, menu);
			//Get Drink
			Drink drink = itemOrdered.getMenuItem();
			//validate
			if ( VALIDATE_DRINK(drink.getName(),inventory) ){
				BUILD_DRINK(drink.getName(), inventory);
				System.out.println("Dispensing Drink : " + drink.getName());
			}else{
				System.out.println("Out Of Stock");
			}
			System.out.println(PRINT_INVENTORY(inventory));
			System.out.println(PRINT_MENU(menu, inventory));
		}else{
			System.out.println( "Invalid selection : invalid validation:  " + input );
		}	
	}
	
	public static String PRINT_INVENTORY(Inventory inventory){
		String result = new String();
		StringBuilder sb = new StringBuilder();
		Collection<IngredientLinkedList> ingredients = inventory.getIngredients();
		sb.append("Inventory:");
		sb.append("\n");
		for (IngredientLinkedList ingredientList : ingredients){
			sb.append(FORMAT_NAME(ingredientList.getName()));
			sb.append(",");
			sb.append(ingredientList.getCollectionSize());
			sb.append("\n");
		}
		result = sb.toString();
		return result;
	}
	
	public static String PRINT_MENU(Menu menu, Inventory inventory){
		String result = new String();
		StringBuilder sb = new StringBuilder();
		Collection<MenuItem> menuItems = menu.getMenuItems();
		Validator drinksValidator = new DrinkValidator(inventory);
		int index = 0;
		sb.append("Menu:");
		sb.append("\n");
		for (MenuItem item: menuItems){	
			Drink drink = item.getMenuItem();
			index++;
			sb.append(index);
			sb.append(",");
			sb.append(FORMAT_NAME(drink.getName()));
			sb.append(",$");
			sb.append(drink.getPrice());
			sb.append(",");
			sb.append(DrinksForSale.isAvailable(drinksValidator,drink));
			sb.append("\n");
		}
		result = sb.toString();
		return result;
	}
	
	public static String FORMAT_NAME(String string){
		if (null!=string){
			string = string.replace("_", " ");
		}
		return string;
	}
	
	public static int GET_MENU_INDEX(String input){
		int index = -1;
		index = BaristaUtility.getIntegerValue(input);	
		return index-1;
	}
			
	public static MenuItem GET_MENU_ITEM(int index, Menu menu){
		Collection<MenuItem> menuItems = menu.getMenuItems();
		MenuItem menuItem = ((ArrayList<MenuItem>) menuItems).get(index);
		return menuItem;
	} 
	
	public static boolean VALIDATE_DRINK(String input, Inventory inventory){
		boolean result = false;
		Validator validator = new DrinkValidator(inventory);
		result = validator.validate(input);
		return result;
	}

	public static String GET_DRINK(String input, DrinksForSale drinks, Inventory inventory){
		String result = new String();

		if ( BaristaConstants.getDrinkNameCaffeAmericano().equalsIgnoreCase(input) ){
			if ( VALIDATE_DRINK( input, inventory ) ){
				BUILD_DRINK(input, inventory);
				result = "Dispensing: " + "Caffe Americano";
				
			}else{
				result = "Out of Stock: " + "Americano";
			}
		}else if( BaristaConstants.getDrinkNameCaffeLatte().equalsIgnoreCase(input) ){
			if ( VALIDATE_DRINK( input, inventory ) ){
				BUILD_DRINK(input, inventory);
				result = "Dispensing: " + "Caffe Latte";
			}else{
				result = "Out of Stock: " + "Caffe Latte";
			}				
		}else if( BaristaConstants.getDrinkNameCaffeMocha().equalsIgnoreCase(input) ){
			if ( VALIDATE_DRINK( input, inventory ) ){
				BUILD_DRINK(input, inventory);
				result="Dispensing: " + "Caffe Mocha";
		}else{
			result = "Out of Stock: " + "Caffe Mocha";
		}
		}else if( BaristaConstants.getDrinkNameCappuccino().equalsIgnoreCase(input) ){
			if ( VALIDATE_DRINK( input, inventory ) ){
				BUILD_DRINK(input, inventory);
				result="Dispensing: " + "Cappuccino";
			}else{
				result = "Out of Stock: " + "Cappuccino";
			}			
		}else if( BaristaConstants.getDrinkNameCoffee().equalsIgnoreCase(input) ){
			if ( VALIDATE_DRINK( input, inventory ) ){
				BUILD_DRINK(input, inventory);
				result="Dispensing:" + "Coffee";
			}else{
				result = "Out of Stock:" + "Coffee";
			}				
		}else if( BaristaConstants.getDrinkNameDecafCoffee().equalsIgnoreCase(input) ){
			if ( VALIDATE_DRINK( input, inventory ) ){
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