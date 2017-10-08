package patterns.strategy;
public class IStrategyConcreteB implements IStrategy{

	private String name = "Concrete A";

	public void behaviour(){
		System.out.println("Ohhh Behaviour B");
	}

	public String getString(){
		return name;
	}

	public void setString(String str){
		name = str;
	}


}