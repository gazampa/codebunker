package patterns.command;
public class ICommandClient{

	public static void main(String[] args){
		ICommandReceiver receiver = new ICommandReceiver();
		ICommand command1 = new IConcreteCommand1(receiver);
		ICommand command2 = new IConcreteCommand2(receiver);

		ICommandInvoker invoker = new ICommandInvoker();
		invoker.invokeCommand(command1);
		invoker.invokeCommand(command2);
	}
}
