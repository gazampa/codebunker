package dynamicproxy;
public class Car implements IVehicle{

	private String name;

	public Car(String name){
		this.name=name;
	}

	public void start(){
		System.out.println(name + " Car Starting");
	}

	public void move(){
		System.out.println(name + " Car Moving");
	}

	public void stop(){
		System.out.println(name + " Car Stoping");
	}

}
