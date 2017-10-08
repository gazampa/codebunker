public class Manufacturer{

	public static void main(String[] args){
		Manufacturer manufacturer = new Manufacturer(createComponentFactory("B"));
	}

	public Manufacturer(ComponentFactory factory){
		Component component = factory.createComponent();
		component.operation();
	}

}