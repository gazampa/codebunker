class TestReplace{

	public static void main (String[] args){
		String test = "8273010dummy";
		String pattern = "82730";

		if ( test.startsWith(pattern) ){
			test = test.replace(pattern,"");
		}
		System.out.println(test);

	}


}