package patterns.strategy;
public class IStrategyConcreteA implements IStrategy{

	private String name = "Concrete A";

	public void behaviour(){
		System.out.println("Ohhh Behaviour A");
	}

	public String getString(){
		return name;
	}

	public void setString(String str){
		name = str;
	}


}