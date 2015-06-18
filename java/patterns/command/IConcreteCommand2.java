package patterns.command;
class IConcreteCommand2 implements ICommand{

	private ICommandReceiver receiver;

	public IConcreteCommand2(ICommandReceiver receiver){
		this.receiver=receiver;
	}

	public void invoke(){
		receiver.command2();
	} 
}
