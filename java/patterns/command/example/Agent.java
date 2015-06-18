package patterns.command.example;
import java.util.LinkedList;
public class Agent{

	LinkedList<Command> commands = new LinkedList<Command>();

	public	void placeOrder(Command command){
		commands.add(command);
		commands.getFirst().execute();
		commands.removeLast();
	}
}
