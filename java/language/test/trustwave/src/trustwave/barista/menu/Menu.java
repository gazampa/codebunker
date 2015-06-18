package trustwave.barista.menu;

import java.util.ArrayList;
import java.util.Collection;

public class Menu {

	public static final Menu INSTANCE = new Menu();
	
	public static Menu getMenu(){ return INSTANCE; }
	
	private Menu(){}
	
	Collection<MenuItem> menuItems = new ArrayList<MenuItem>();
	
	public void addMenuItem(MenuItem menuItem){
		if (null!=menuItems && null!=menuItem){
			try{
				menuItems.add(menuItem);
			}catch(UnsupportedOperationException  e){
				System.out.println("Exception thrown adding Menu Item :" + e);
			}catch(IllegalArgumentException  e){
				System.out.println("Exception thrown adding Menu Item :" + e);
			}catch(ClassCastException  e){
				System.out.println("Exception thrown adding Menu Item :" + e);
			}catch(NullPointerException  e){
				System.out.println("Exception thrown adding Menu Item :" + e);
			}	
		}
	}
	
	public Collection<MenuItem> getMenuItems(){
		return menuItems;
	}

}
