package trustwave.barista.menu;

import trustwave.barista.drink.Drink;

public class MenuItem {

	private Drink menuItem;
	
	public MenuItem(){}
	
	public MenuItem(Drink drink){
		this.menuItem= drink;
	}
	public void setMenuItem(Drink menuItem) {
		this.menuItem = menuItem;
	}

	public Drink getMenuItem() {
		return menuItem;
	}
	
}
