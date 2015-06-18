class MainMethod{

	public static void main(String[] args){

		Director director = new Director();
		ConcreteBuilder concreteBuilder = new ConcreteBuilder();

		director.setComponentBuilder(concreteBuilder);
		director.constructComponent();

		Component component = director.getComponent();

		System.out.println(component.getInstanceVar1());
		System.out.println(component.getInstanceVar2());
		System.out.println(component.getInstanceVar3());

	}

}