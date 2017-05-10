package java8.interfaces;
import java.lang.StringBuilder;

public interface InterfaceWithMethodImplementations{
	/** stone the crows, now you can provide body as well as signature
	*	- you can’t override static methods
	*	- you can call static methods the same as class static
	*	- default methods are like implemented methods in an abstract class
	*
	*	- @FunctionalInterface has been introduced
	**/
	String interfaceMethod();

	static String iCantBeOverridden(){
		StringBuilder sb = new StringBuilder();
		sb.append("I was defined in the interface using the static keyword");
		return sb.toString();
	}

	default String imLikeAbstractInherited(){
		StringBuilder sb = new StringBuilder();
		sb.append("I was defined in the interface using the default keyword");
		return sb.toString();
	}


}