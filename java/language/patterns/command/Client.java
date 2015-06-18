public class Client {

	public static void main(String[] args){

		MenuItem receiver = new MenuItem();
		Command command1 = new Command1(receiver);
		Command command2 = new Command2(receiver);
		String decision = "command2";

		Menu menu = new Menu();

		if ("COMMAND1".equalsIgnoreCase(decision)){
			menu.storeAndExecute(command1);
			System.exit(0);
		}

		if ("COMMAND2".equalsIgnoreCase(decision)){
			menu.storeAndExecute(command2);
			System.exit(0);
		}

		System.out.println(decision);

	}

}