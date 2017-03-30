
public class ParseArrayList{

	public static void main(String args []){

		String[] listOProduct = {"field11::field12::field13::field14","field21::field22::field23::field24","field31::field32::field33::field34","field41::field42::field43::field44"};

		for ( int i=0; i<listOProduct.length; i++ ){

			System.out.println(getFieldValue( listOProduct[i], 3 ));
		}

	}

	private static String getFieldValue( String param, int index){
		String result = new String();
		String[] split = param.split("::");
		if (  index < split.length && index > -1 )
			result = split[index];
		return result;
	}


}