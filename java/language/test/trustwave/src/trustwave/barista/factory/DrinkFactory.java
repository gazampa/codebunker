package trustwave.barista.factory;

import java.math.BigDecimal;

import trustwave.barista.drink.Drink;
public interface DrinkFactory{

	public Drink factoryMethod(String name);

}