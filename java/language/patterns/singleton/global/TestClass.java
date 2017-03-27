class TestClass{

	public static void main(String[] args){
		/** Globality of Singletons*/
		Inventory inventory = Inventory.INSTANCE;
		Inventory inventory2 = Inventory.INSTANCE;
		InventoryNotSingleton inventory3 = new InventoryNotSingleton();
		InventoryNotSingleton inventory4 = new InventoryNotSingleton();


		for ( int i = 0;i<10;i++ ){
			inventory2.decrement(5);
			inventory.refresh(10);
			inventory3.decrement(7);
			Inventory.INSTANCE.decrement(2);
			new TaskThread(Inventory.INSTANCE).start();
			new Thread(new TaskThread2(inventory2)).start();
			new Thread(new TaskThread2(inventory3)).start();
			new TaskThread(inventory3).start();
		}
		inventory3.refresh(10);
		System.out.println(inventory);
		System.out.println(inventory2);
		System.out.println(inventory3);
		System.out.println(inventory4);

	}

}
