class MainMethod{

	public static void main(String[] args){

		Creator factory = new CreatorImplementation();

		Component component = factory.factoryMethod();
		component.operation();

	}
}