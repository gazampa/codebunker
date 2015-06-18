public class Facade{

	private ComplexComponent1 complexComponent1;
	private ComplexComponent2 complexComponent2;
	private ComplexComponent3 complexComponent3;


	public Facade(){
		complexComponent1 = new ComplexComponent1();
		complexComponent2 = new ComplexComponent2();
		complexComponent3 = new ComplexComponent3();
	}

	public void organizeFacade(){
		System.out.println("Facade is calling on operations in the underlying components");
		complexComponent1.operation();
		complexComponent2.operation();
		complexComponent3.operation();
		System.out.println("Facade has finished calling on operations in the underlyig components");
	}


}