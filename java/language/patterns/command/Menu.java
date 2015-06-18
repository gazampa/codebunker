/**
* Invoker
*/

import java.util.ArrayList;
import java.util.List;

public class Menu {

	private List<Command> history = new ArrayList<Command>();

	public Menu(){}

	public void storeAndExecute(Command cmd){
		this.history.add(cmd);
		cmd.execute();
	}

}