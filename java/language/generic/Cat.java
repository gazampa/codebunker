package generics;
public class Cat extends Animal{

	public String whoAmI(){
		return "I'm "+this;
	}

	public String howAmI(){
		return this + " is the Cats Pajamas";
	}

}