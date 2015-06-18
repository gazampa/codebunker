public class CreatorImplementation implements Creator{

	public Component factoryMethod(){
		int arg = 0;

		if  (arg==0)
			return new ComponentImplementation1();
		else
			return new ComponentImplementation2();

		}

	public void operation(){}

}