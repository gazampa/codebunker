import java.util.ArrayList;
import java.util.List;
class Test{

	public static void main(String[] args){
		Dog dog = new Dog();
		Cat cat = new Cat();

		List<Dog> animals = new ArrayList<Dog>();
		List<? extends Animal> asdf = new ArrayList<Dog>();

		Animal[] arAnimal = new Animal[]{dog,cat};
		Dog[] arDogs = new Dog[5];

		arAnimal = arDogs;

		animals.add(dog);
		//animals.add(cat);

		arAnimal[0] = dog;
		arAnimal[1] = cat;

		for (Animal animal : animals){
			System.out.println(animal.whoAmI());
		}

		for (int i = 0;i<arAnimal.length;i++){
			if(arAnimal[i]!=null) System.out.println(arAnimal[i].whoAmI());
		}

	}

}