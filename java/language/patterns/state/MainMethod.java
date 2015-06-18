public class MainMethod{

	public static void main(String[] args){

		TCPConnection connection = new TCPConnection(States.LISTENING);

//		System.out.println(connection.getCurrentStateName());
		connection.open();

		connection.changeState(States.ESTABLISHED);
		System.out.println(connection.getCurrentStateName());
		connection.open();

		connection.changeState(States.CLOSED);
		System.out.println(connection.getCurrentStateName());
		connection.open();

	}

}