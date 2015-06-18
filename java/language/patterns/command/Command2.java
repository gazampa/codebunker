public class Command2 implements Command{

	private MenuItem receiver;

	public Command2(MenuItem receiver){
		this.receiver = receiver;
	}

	public void execute(){
		receiver.doAction2();
	}
}