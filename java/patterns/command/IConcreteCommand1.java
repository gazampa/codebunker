package patterns.command;
public class IConcreteCommand1 implements ICommand{
	private ICommandReceiver receiver;
	public IConcreteCommand1(ICommandReceiver receiver){
		this.receiver=receiver;
	}
	public void invoke(){
		System.out.println(receiver);	
		receiver.command1();
	}
}
