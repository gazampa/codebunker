class FourColumnDIV{

	public static void main(String[] args){

		int col = 0;

		System.out.println("<div style=margin: 0>");

		for(int i=0; i<4; i++) {
			System.out.println("<a href=> anchor </a>" + "col = "+col);
			if( ((col+1)%4) == 0 ) {
				System.out.println("</div><div style=margin: 0>");
			}
		col++;
		}

		System.out.println("<a href=> anchor </a>");

		System.out.println("</div>");

	}

}