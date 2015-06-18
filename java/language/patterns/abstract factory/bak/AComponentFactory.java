public class AComponentFactory implements ComponentFactory{

	public Component createComponent(){
		return new ComponentImplementation1();
	}

}