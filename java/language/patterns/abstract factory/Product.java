public class Product{

	public Product( AbstractFactory factory) {
		AbstractComponent component = factory.buildComponent();
	}



}