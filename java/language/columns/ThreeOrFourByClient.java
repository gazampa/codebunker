package columns;

public class ThreeOrFourByClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final String CLIENT="B";
		int numberOfColumns = 0;
		boolean oneRow = false;
		System.out.println("<div margin=0>");

		if (CLIENT.equalsIgnoreCase("A"))
			numberOfColumns=4;
		else
			numberOfColumns=3;

		int colindex = 0;
		for ( int i = 0;i<4;i++){
			System.out.println("<a href=there>inner</a> col= "+colindex);

			if ( (colindex!=0||oneRow)&&((colindex+1)%numberOfColumns==0))
				System.out.println("</div><div margin=0>");
			colindex++;
		}


		if (CLIENT.equalsIgnoreCase("A")) {
			System.out.println("<a href=there>extra</a>");
		}

		System.out.println("</div>");

	}

}
