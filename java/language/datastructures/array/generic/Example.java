package generic;
import java.util.ArrayList;
import java.util.List;
class Example{

	/**
	*	Arrays in java will accept subtypes of their declared type , ie, super[] ~ sub[]
	*	Generic Collections will not, they are invariant, List<Super> !~ List<Sub>
	*	Generics restrict what can be added to a collection, they dont like mixing lists of subtypes,
	*   keep lists of the same type, dont cross the streams
	*	Type Erasure ocurs at compile time, the compiler removes all the type tags
	*	The generic wildcard character, ? extends, allows read only iteration of many different types
	*	The generic wildcard character, ? super, allows modification of specified types but not iteration
	*	List<?> != List<Object>. List<? extends Object> == List<?>
	*
	*	Using parametric polymorphism, a function or a data type can be written generically so that it can
	*		handle values identically without depending on their type.[1] Such functions and data types are called
	*			generic functions and generic datatypes respectively and form the basis of generic programming.
	*
	**/


	public static void main(String[] args){
		Dog dog = new Dog();
		Cat cat = new Cat();

		/** declare some lists and arrays **/
		// Im a list of Animals
		List<Animal> listAnimal = new ArrayList<Animal>();
		listAnimal.add(dog);listAnimal.add(cat);
		// And Im an array of Animals
		Animal[] aAnimal = new Animal[]{dog,cat};
		// Im an array of Dogs
		Dog[] aDog = new Dog[5];
		//And Im a list of Dogs
		List<Dog> listDog = new ArrayList<Dog>();
		listDog.add(new Dog());listDog.add(new Dog());

		/** manipulate them **/

		// -- Polymorphims is useful

		for (int i = 0, j = aAnimal.length ; i < j; i++){
			System.out.println(aAnimal[i].whoAmI());
		}

		passAnArrayOfAnimal(aAnimal);

		for (Animal animal : listAnimal){
			System.out.println(animal.whoAmI());
		}

		passAListOfAnimal(listAnimal);

		// -- arrays are covariant though, so I can seemingly redefine my array type to that of its sub, and it does lose its original type
		aAnimal = aDog;

		try{
			aAnimal[3] = dog;
			aAnimal[4] = cat; // <------- but this is now a dog[], even though it has a cat already, compiles and will throw a runtime error which you can catch
		}catch(ArrayStoreException ase){
			System.out.println("Cats and Dogs hanging out together ...");
		}

		// -- lists however are invariant, you cant interchange different types, and you are notified when you try to compile
		// -- even though they have the same super, they are not interchangeable generic types.
		//listDog.add(dog);
		//listOfDog.add(cat); // <------ cant compile, argument mismatch thrown at compile time -- forced to address
		// listAnimal = listDog; // : List<Dog> cannot be converted to List<Animal>

		/** explore generic methods **/
		// -- arrays are ok with passing, even if in the method you add other animals, though adding mixed subtypes is no good
		try{
			passAnArrayOfAnimal(aDog);
		}catch( ArrayStoreException ase ){
			System.out.println("Who let this cat in here !");
		}

		// -- but I can not pass a list of dog as the method only takes list of animal, the above array method didnt care
		//passAListOfAnimal(listDog);

		// -- by using a wildcard in the signature, i can pass subtype lists, though only in a read only mode
		passAListOfExtendedAnimal(listDog);

		// try this out with cats
		List<Cat> listCat = new ArrayList<Cat>();listCat.add(new Cat());

		passAListOfExtendedAnimal(listCat);

		// using super in the method signature declaration will allow you to add elements
		passAListOfSuperDog(listDog);

		// -- though only of that specific subtype and higher
		passAListOfSuperDog(listAnimal);
		//passAListOfSuperDog(listCat);

		// -- in this method we effectively reduced typing, systematically, and blew away our polymorphic advantage
		passAListOfType(listAnimal);
		passAListOfType(listDog);
		passAListOfType(listCat);

		/** manipulate generic class **/
		ItTakesAllTypes<Animal> anyOfAThing = new ItTakesAllTypes<Animal>(listAnimal);
		// anyOfAThing.howAreYouAll(); <<-- wont compile, even though we want it to, the generic class is too broad

		System.out.println(" it is taking all types ");
		ItTakesAllTypesOfAnimal<Animal> anyOfAnimal = new ItTakesAllTypesOfAnimal<Animal>(listAnimal);
		System.out.println(anyOfAnimal.howAreYouAll());


	}

	/** generic method declaration **/
	// this method will accept an array of sub types
	static public void passAnArrayOfAnimal(Animal[] animals) throws ArrayStoreException{
		for (int i = 0, j = animals.length; i < j; i ++){
			if (animals[i]!=null)
				System.out.println(animals[i].howAmI());
			else
				animals[i] = new Cat(); // its ok to add a Cat, its an animal, even if you passed in a list of Dogs !
		}
	}
	// this method will only accept list of animals, it wont accept a list of subtype
	static public void passAListOfAnimal(List<Animal> animals){
		for (Animal animal : animals){
			System.out.println(animal.howAmI());
		}
	}
	// this method will accept lists of subtype, but you cant add anything to them
	static public void passAListOfExtendedAnimal(List<? extends Animal> animals){
		for (Animal animal : animals){
			System.out.println(animal.howAmI());
			//animals.add(new Dog());
		}
	}
	// this method will accept lists of specific subtypes, you can add that type but you cant iterate over it
	static public void passAListOfSuperDog(List<? super Dog> animals){
		//for (Animal animal : animals){
		//	System.out.println(animal.howAmI());
			animals.add(new Dog());
			//animals.add(((Animal)new Cat())); <<-- will not allow Cat as Animal
		//}
	}
	// Here we try to genericise the generic, take that, Object methods are ok, but you get a compiler error on user defined methods
	// generics also were brought in to improve type safety and reduce casting, here we are casting again
	static public <T> void passAListOfType(T animals){
		List<T> list = (List<T>) animals; //warning: [unchecked] unchecked cast
		for (T animal : list){
			//System.out.println(animal.howAmI()); // wont compile
			System.out.println(animal.toString()); // will
		}
	}

}


//List<? super Dog> listOfDogsAndAnimal = new ArrayList<Dog>(); // Producer Extends, Consumers Super