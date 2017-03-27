public class TaskThread2 implements Runnable{

	private Inventory inventory;
	private InventoryNotSingleton inventoryNS;

	public TaskThread2(Inventory inventory){ this.inventory=inventory;}
	public TaskThread2(InventoryNotSingleton inventory){ this.inventoryNS=inventory;}


	public void run(){
		if (inventory!=null && (inventory instanceof Inventory) )
			inventory.decrement(2);

		if (inventoryNS!=null && (inventoryNS instanceof InventoryNotSingleton) )
			inventoryNS.decrement(2);

		Inventory.INSTANCE.decrement(2);
	}
}