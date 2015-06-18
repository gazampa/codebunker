package trustwave.barista.utility;

public class BaristaUtility {

	public static int getIntegerValue(String string){
		int result = -1;
		
		try {
			result = Integer.valueOf(string);
		}catch(NumberFormatException nfe){
			System.out.println("Exception thrown converting string to int : " + string +" : "+ nfe);
		}
		
		return result;
		
	}

}
