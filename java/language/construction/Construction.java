public class Construction{

	/**
		Object<--Living<--Animal<--Bear<--BrownBear

		Rules:
		1. ) A constructor can use any access modifier.
		2. ) The constructor name must match that of the Class
		3. ) The constructor must not have a return type.
		4. ) The compiler will generate a no arg default constructor if no other constructor is provided.
		5. ) Every constructor calls the overloaded this() or the superclass constructor super().
		6. ) Super can be a no arg constructor or contain parameters passed to the super.
		7. ) you cannot make calls to an instance variable or method until after the super() runs,
		8. ) only static variables can be accessed by this() and super().
		9. ) Abstract classes have constructors that are always called upon the concrete instantiation.
		10.) Interfaces do not have constructors. Interfaces are not part of class hierarchy.
		11.) constructors can only be called by other constructors.
		12.) constructors are never inherited. They are not methods
	**/


	public static void main(String[] args){
		BrownBear bear = new BrownBear("brown","big");
	}

}