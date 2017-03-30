import java.util.Collection;
import java.util.TreeSet;
import java.util.Scanner;

public class Barista {

	static {
		/**

			Initialization

		**/
	}

	public static void main(String[] args){

		Inventory inventory = Inventory.getInventory();

		/**Load Barista**/
		Scanner scanner = new Scanner(System.in);
		String input = new String();
		/**
		** "^[RrQq1-6]$" Reglar Expression to validate Input.
		**/
		Validator validator = new RegularExpressionValidator("^[RrQq1-6]$");
		System.out.println("### Barista Application ###");
		System.out.println(	PRINT_MENU(inventory) );
		System.out.println("\'R\' or \'r\' - restock the inventory and redisplay the menu");
		System.out.println("\'Q\' or \'q\' - quit the application");
		System.out.println("[1-6] - order the drink with the corresponding number in the menu");


		/**
			Application Loop
		**/
		while ( !"Q".equalsIgnoreCase(input)){

		input = scanner.next();

			if ( validator.validate(input) ) {
				System.out.println(input);
				//place calls to commands.

				if("Q".equalsIgnoreCase(input) ){
						System.out.println( "execute : " + input );
						System.out.println( "quitting application : " + input );
						System.exit(1);
					}else if ("R".equalsIgnoreCase(input)){
						System.out.println( "execute : " + input );
						inventory.refresh();
						System.out.println(	PRINT_MENU(inventory) );
					}else if("1".equalsIgnoreCase(input)){
						System.out.println( GET_DRINK(input) );
					}else if("2".equalsIgnoreCase(input)){
						System.out.println( GET_DRINK(input) );
					}else if("3".equalsIgnoreCase(input)){
						System.out.println( GET_DRINK(input) );
					}else if("4".equalsIgnoreCase(input)){
						System.out.println( GET_DRINK(input) );
					}else if("5".equalsIgnoreCase(input)){
						System.out.println( GET_DRINK(input) );
					}else if("6".equalsIgnoreCase(input)){
						System.out.println( GET_DRINK(input) );
					}else{
						System.out.println( "Invalid selection : invalid validation:  " + input );
				}

			}else{
				System.out.println( "Invalid selection: " + input );
			}

		}

	}

	public static String PRINT_MENU(Inventory inventory){

		return inventory.toString();

	}

	public static String GET_DRINK(String input){
		String result = new String();
		if ( "1".equalsIgnoreCase(input) ){
			result = "Dispensing Caffe Americano";
		}else if( "2".equalsIgnoreCase(input) ){
			result = "Dispensing Caffe Latte";
		}else if( "3".equalsIgnoreCase(input) ){
			result="Dispensing Caffe Mocha";
		}else if( "4".equalsIgnoreCase(input) ){
			result="Dispensing Cappuccino";
		}else if( "5".equalsIgnoreCase(input) ){
			result="Dispensing Coffee";
		}else if( "6".equalsIgnoreCase(input) ){
			result="Dispensing Decaf Coffee";
		}else{
			result ="Unable to Dispense";
		}

		return result;
	}


	public static Drink BUILD_DRINK(Inventory inventory, String input){
		Drink result = new CoffeeDrink();

		if ( "1".equalsIgnoreCase(input) ){
			//result = new CaffeAmericano();
		}else if( "2".equalsIgnoreCase(input) ){
			//result = new CaffeLatteDrink();
		}else if( "3".equalsIgnoreCase(input) ){
			//result= new CaffeeMochaDrink();
		}else if( "4".equalsIgnoreCase(input) ){
			//result= new CappuccinoDrink();
		}else if( "5".equalsIgnoreCase(input) ){
			result=new CoffeeDrink();
		}else if( "6".equalsIgnoreCase(input) ){
			//result=new DecafCoffeeDrink();
		}else{
			result = new CoffeeDrink();// whats a good value here
		}
		return result;

	}


		/**
			1 ) Replace System.out with log4j
		**/

}