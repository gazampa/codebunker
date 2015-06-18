public class HolsterThatCase{

	public static void main(String[] args){

		String test = "ExxOn123456".toLowerCase();
		System.out.println(test);

		System.out.println(test.indexOf("exx"));

		if ( test.indexOf("Exx") <= -1 ){
			System.out.println(test.indexOf("exx"));
		}

	}


}