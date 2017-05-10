package java8.interfaces;

public class Interface implements InterfaceWithMethodImplementations{

	public String interfaceMethod(){
		return "I am the standard interface method";
	}

	public String staticsMethod(){
		return InterfaceWithMethodImplementations.iCantBeOverridden();
	}


}
