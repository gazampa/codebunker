class LessThanOrEqualTo{

	public static void main(String args[]){

		int max = 5;
		int numberRetreived = 0;

		while ( limitCheck(max,numberRetreived) ){
			numberRetreived++;
			System.out.println(numberRetreived);
		}

	}

	private static boolean limitCheck(int max, int numrecords) {
		boolean result = true;

		if ( max == 0 )
			result = false;
		else if (numrecords > 0 && numrecords == max)
			result = false;

		return result;
	}


}