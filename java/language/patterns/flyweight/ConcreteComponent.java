public class ConcreteComponent implements Component{

	private String intrinsicState;

	public ConcreteComponent(){
		intrinsicState = States.BLANK.getState();
	}

	public ConcreteComponent(String val){
		intrinsicState = val;
	}

	public String getIntrinsicState(){
		return intrinsicState;
	}

	public void method(){
		System.out.println("Concrete Component : method()" + " State : " + getIntrinsicState());
	}

}