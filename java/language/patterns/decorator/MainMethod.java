class MainMethod{

	public static void main(String[] args){
		int[] array = new int[10];

		Decorator decorator = new Decorator();
		array = decorator.swap();

		decorator.showElements();

		for (int element:array){

			System.out.println(element);

		}

		decorator.showElements();

	}

}