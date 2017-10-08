import java.util.ArrayList;

class TestParameterPassing{

	public static void main(String[] args){
		String parameter = "A";

		ArrayList<String> arrParameter = new ArrayList<String>();
		arrParameter.add("A");
		arrParameter.add("B");
		arrParameter.add("C");

		System.out.print("Before Passing Primitive Through : "+parameter+ " ");

		changeParameter(parameter);

		System.out.println("After Pass : "+parameter+" ");

		System.out.print("Before Passing Array Through : "+arrParameter+" ");

		changeParameter(arrParameter);

		System.out.println("After Pass : "+arrParameter+" ");

	}

	private static void changeParameter(String parameter){

		parameter="Z";

	}

	private static void changeParameter(ArrayList<String> arrParameter){

		for (int i = 0 ; i < arrParameter.size(); i++ ){
			arrParameter.set(i,"Z");
		}

	}


}