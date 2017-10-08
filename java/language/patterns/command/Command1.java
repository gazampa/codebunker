public class Command1 implements Command{

	private MenuItem receiver;

	public Command1(MenuItem receiver){
		this.receiver = receiver;
	}

	public void execute(){
		receiver.doAction1();
	}
}