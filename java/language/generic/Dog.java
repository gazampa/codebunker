package generics;
public class Dog extends Animal{

	public String whoAmI(){
		return "I'm " + this;
	}

	public String howAmI(){
		return this + " is having a dogs life";
	}

}