public class ConcretePrototypeFactory extends PrototypeFactory{
	int x;

	public ConcretePrototypeFactory( int x){
		this.x = x;
	}

	public void prototypeFactory(int x){
		this.x = x;
	}

	public void printValue(){
		System.out.println("Value : " + x);
	}

}