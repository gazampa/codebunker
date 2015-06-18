package trustwave.barista.drink;

import java.util.Comparator;

public class DrinkComparators{
	
	public static final Comparator<Drink> ORDER_BY_NAME =
		 new Comparator<Drink>() {
			public int compare(Drink drink1, Drink drink2) {
				return drink1.getName().compareTo(drink2.getName());
			}
	};

	public static final Comparator<Drink> ORDER_BY_PRICE =
		 new Comparator<Drink>() {
			public int compare(Drink drink1, Drink drink2) {
				return drink1.getPrice().compareTo(drink2.getPrice());
			}
	};	
	
}