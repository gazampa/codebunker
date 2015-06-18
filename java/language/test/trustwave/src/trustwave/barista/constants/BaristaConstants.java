package trustwave.barista.constants;

import java.math.BigDecimal;

public class BaristaConstants {
/**
 * Class to hold Application Constants
 */
	static{
		UNIT_PRICE_COFFEE = new BigDecimal("2.75");
		UNIT_PRICE_DECAF_COFFEE= new BigDecimal("2.75");
		UNIT_PRICE_COCOA= new BigDecimal("2.90");
		UNIT_PRICE_CREAM= new BigDecimal("2.55");
		UNIT_PRICE_ESPRESSO= new BigDecimal("3.35");
		UNIT_PRICE_FOAMED_MILK= new BigDecimal("3.30");
		UNIT_PRICE_STEAMED_MILK= new BigDecimal("3.30");
		UNIT_PRICE_SUGAR= new BigDecimal("3.30");
		UNIT_PRICE_WHIPPED_CREAM= new BigDecimal("3.30");

		PRICE_COFFEE= new BigDecimal("2.75");
		PRICE_DECAF_COFFEE= new BigDecimal("2.75");
		PRICE_CAPPUCCINO= new BigDecimal("2.90");
		PRICE_LATTE= new BigDecimal("2.55");
		PRICE_MOCHA= new BigDecimal("3.35");
		PRICE_AMERICANO= new BigDecimal("3.30");
		
		STOCK_LEVEL = 10;

		INGREDIENT_NAME_COFFEE = "Coffee";
		INGREDIENT_NAME_DECAF_COFFEE = "Decaf_Coffee";
		INGREDIENT_NAME_SUGAR = "Sugar";
		INGREDIENT_NAME_CREAM = "Cream";
		INGREDIENT_NAME_STEAMED_MILK = "Steamed_Milk";
		INGREDIENT_NAME_FOAMED_MILK = "Foamed_Milk";
		INGREDIENT_NAME_ESPRESSO = "Espresso";
		INGREDIENT_NAME_COCCOA = "Cocoa";
		INGREDIENT_NAME_WHIPPED_CREAM = "Whipped_Cream";

		DRINK_NAME_COFFEE = "Coffee";
		DRINK_NAME_DECAF_COFFEE = "Decaf_Coffee";
		DRINK_NAME_CAFFE_AMERICANO = "Caffe_Americano";
		DRINK_NAME_CAPPUCCINO = "Cappuccino";
		DRINK_NAME_CAFFE_LATTE = "Caffe_Latte";
		DRINK_NAME_CAFFE_MOCHA = "Caffe_Mocha";
	
	}
	
	private static final BigDecimal UNIT_PRICE_COFFEE;
	private static final BigDecimal UNIT_PRICE_DECAF_COFFEE;
	private static final BigDecimal UNIT_PRICE_COCOA;
	private static final BigDecimal UNIT_PRICE_CREAM;
	private static final BigDecimal UNIT_PRICE_ESPRESSO;
	private static final BigDecimal UNIT_PRICE_FOAMED_MILK;
	private static final BigDecimal UNIT_PRICE_STEAMED_MILK;
	private static final BigDecimal UNIT_PRICE_SUGAR;
	private static final BigDecimal UNIT_PRICE_WHIPPED_CREAM;

	private static final BigDecimal PRICE_COFFEE;
	private static final BigDecimal PRICE_DECAF_COFFEE;
	private static final BigDecimal PRICE_CAPPUCCINO;
	private static final BigDecimal PRICE_LATTE;
	private static final BigDecimal PRICE_MOCHA;
	private static final BigDecimal PRICE_AMERICANO;

	private static final int STOCK_LEVEL;

	private static final String INGREDIENT_NAME_COFFEE;
	private static final String INGREDIENT_NAME_DECAF_COFFEE;
	private static final String INGREDIENT_NAME_SUGAR;
	private static final String INGREDIENT_NAME_CREAM;
	private static final String INGREDIENT_NAME_STEAMED_MILK;
	private static final String INGREDIENT_NAME_FOAMED_MILK;
	private static final String INGREDIENT_NAME_ESPRESSO;
	private static final String INGREDIENT_NAME_COCCOA;
	private static final String INGREDIENT_NAME_WHIPPED_CREAM;

	private static final String DRINK_NAME_COFFEE;
	private static final String DRINK_NAME_DECAF_COFFEE;
	private static final String DRINK_NAME_CAFFE_AMERICANO;
	private static final String DRINK_NAME_CAPPUCCINO;
	private static final String DRINK_NAME_CAFFE_LATTE;
	private static final String DRINK_NAME_CAFFE_MOCHA;
	
	public static BigDecimal getUnitPriceCoffee() {
		return UNIT_PRICE_COFFEE;
	}

	public static BigDecimal getUnitPriceDecafCoffee() {
		return UNIT_PRICE_DECAF_COFFEE;
	}

	public static BigDecimal getUnitPriceCocoa() {
		return UNIT_PRICE_COCOA;
	}

	public static BigDecimal getUnitPriceCream() {
		return UNIT_PRICE_CREAM;
	}

	public static BigDecimal getUnitPriceEspresso() {
		return UNIT_PRICE_ESPRESSO;
	}

	public static BigDecimal getUnitPriceFoamedMilk() {
		return UNIT_PRICE_FOAMED_MILK;
	}

	public static BigDecimal getUnitPriceSteamedMilk() {
		return UNIT_PRICE_STEAMED_MILK;
	}

	public static BigDecimal getUnitPriceSugar() {
		return UNIT_PRICE_SUGAR;
	}

	public static BigDecimal getUnitPriceWhippedCream() {
		return UNIT_PRICE_WHIPPED_CREAM;
	}

	public static BigDecimal getPriceCoffee() {
		return PRICE_COFFEE;
	}

	public static BigDecimal getPriceDecafCoffee() {
		return PRICE_DECAF_COFFEE;
	}

	public static BigDecimal getPriceCappuccino() {
		return PRICE_CAPPUCCINO;
	}

	public static BigDecimal getPriceLatte() {
		return PRICE_LATTE;
	}

	public static BigDecimal getPriceMocha() {
		return PRICE_MOCHA;
	}

	public static BigDecimal getPriceAmericano() {
		return PRICE_AMERICANO;
	}

	public static int getStockLevel() {
		return STOCK_LEVEL;
	}

	public static String getIngredientNameCoffee() {
		return INGREDIENT_NAME_COFFEE;
	}

	public static String getIngredientNameDecafCoffee() {
		return INGREDIENT_NAME_DECAF_COFFEE;
	}

	public static String getIngredientNameSugar() {
		return INGREDIENT_NAME_SUGAR;
	}

	public static String getIngredientNameCream() {
		return INGREDIENT_NAME_CREAM;
	}

	public static String getIngredientNameSteamedMilk() {
		return INGREDIENT_NAME_STEAMED_MILK;
	}

	public static String getIngredientNameFoamedMilk() {
		return INGREDIENT_NAME_FOAMED_MILK;
	}

	public static String getIngredientNameEspresso() {
		return INGREDIENT_NAME_ESPRESSO;
	}

	public static String getIngredientNameCocoa() {
		return INGREDIENT_NAME_COCCOA;
	}

	public static String getIngredientNameWhippedCream() {
		return INGREDIENT_NAME_WHIPPED_CREAM;
	}

	public static String getDrinkNameCoffee() {
		return DRINK_NAME_COFFEE;
	}

	public static String getDrinkNameDecafCoffee() {
		return DRINK_NAME_DECAF_COFFEE;
	}

	public static String getDrinkNameCaffeAmericano() {
		return DRINK_NAME_CAFFE_AMERICANO;
	}

	public static String getDrinkNameCappuccino() {
		return DRINK_NAME_CAPPUCCINO;
	}

	public static String getDrinkNameCaffeLatte() {
		return DRINK_NAME_CAFFE_LATTE;
	}

	public static String getDrinkNameCaffeMocha() {
		return DRINK_NAME_CAFFE_MOCHA;
	}
	
}
