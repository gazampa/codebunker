public class MainMethod{

	public static void main(String[] args){
		Manufacturer manufacturer = new Manufacturer(createComponentFactory("B"));
	}

	public static ComponentFactory createComponentFactory(String arg){
		if ("A".equals(arg))
			 return new AComponentFactory();
		else if ("B".equals(arg))
			 return new BComponentFactory();
		else
			return new AComponentFactory();
	}

}