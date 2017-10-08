public class BComponentFactory implements ComponentFactory{

	public Component createComponent(){
		return new ComponentImplementation2();
	}

}