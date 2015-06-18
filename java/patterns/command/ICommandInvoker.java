package patterns.command;
import java.util.ArrayList; 
class ICommandInvoker{
	private ArrayList<ICommand>commands = new ArrayList<ICommand>();

	public ICommandInvoker(){}

	public void invokeCommand(ICommand command){
		commands.add(command);
		if( commands.size()>0 ){
			commands.get(0).invoke();
			commands.remove(commands.size()-1);
		}
	}
}
