public class TaskThread extends Thread{

	private Inventory inventory;
	private InventoryNotSingleton inventoryNS;

	public TaskThread(Inventory inventory){ this.inventory=inventory;}
	public TaskThread(InventoryNotSingleton inventory){ this.inventoryNS=inventory;}

	public void run(){
		if (inventory!=null && (inventory instanceof Inventory) )
			inventory.decrement(2);
		if (inventoryNS!=null && (inventoryNS instanceof InventoryNotSingleton) )
			inventoryNS.decrement(2);
	}
}