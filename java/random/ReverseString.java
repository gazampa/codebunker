class ReverseString{


	public static void main(String[] args){

	String testString = "abcdefg";

//	char[] charArray = testString.toCharArray();

//	char[] newCharArray = new char[3];

//	for ( int i = 0, j=charArray.length - 1; i< charArray.length; i ++, j-- ){

//		if ( j>=0 && i<charArray.length )
//			newCharArray[i] = charArray[j];

//	}

	String result = reverseByHalf(testString);

	System.out.println(testString);
	System.out.println(result);

	}


	private static String reverseNoTemp(String input){

		String result = new String();
		String string = new String(input);

		if ( string!=null ){
			char[] beginChars = string.toCharArray();
			int length = beginChars.length;
			char[] reverseChars = new char[length+1];
			for ( int i = 0, j=length - 1; i< length; i ++, j-- ){
				if ( j>=0 && i < length )
					reverseChars[i] = beginChars[j];
			}
			result = new String (reverseChars);
		}

		return result;

	}

	private static String reverseWithTemp(String input){

		String result = new String();
		String string = new String(input);

		if ( string!=null ){
			char[] original = string.toCharArray();
			int length = original.length;
			char[] reverseChars = new char[length+1];
			for ( int i = 0, j=length - 1; i < length; i ++, j-- ){
				if ( j>=0 && i < length ){
					char tmp = original[j];
					reverseChars[i] = tmp;
				}
			}
			result = new String (reverseChars);
		}

		return result;

	}

	private static String reverseRecurse(String input){
		String result = new String();

		if ((null!=input) && (input.length() >= 1)){
			result =  reverseRecurse(input.substring(1)) + input.charAt(0);
			System.out.println(result);
		}

		return result;
	}

	private static String reverseByHalf(String input){

		String result = new String();

		if ( null!=input ){
			char[] original = input.toCharArray();
			int size = original.length;

			for(int lower = 0, upper=size-1; lower<(size/2); lower++, upper--){
				char tmp = original[lower];
				original[lower] = original[upper];
				original[upper] = tmp;
			}
			result = String.valueOf(original);

		}
		return result;
	}
}