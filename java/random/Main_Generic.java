import java.util.ArrayList;
import generic.State;

public class Main_Generic{

	public static void main( String args[] ){
		//The Old
		int[][] array = new int[100][];
		int outerCapacity = array.length;int innerCapacity = 10;

		for ( int index=0;index<array.length;index++ ){
			array[index]=new int[]{0,1,2,3,4,5,6,7,8,9};
		}

		for ( int outer=0;outer<outerCapacity;outer++ ){
			System.out.print(outer+" : ");
			for( int inner=0;inner<innerCapacity;inner++ ){
				int reverse = (innerCapacity-1)-inner;
				System.out.print(" ` "+array[outer][inner]);
				System.out.print(" ~ "+array[outer][reverse]);
			}
			System.out.println();
		}

		//The New
		State delaware = new State("delaware","Peach Blossom");
		State pennsylvania = new State("Pennsylvania","Mountain Laurel");
		State hawaii = new State("Hawaii","Hibiscus");

		ArrayList<State> union= new ArrayList<State>();

		union.add(delaware);
		union.add(pennsylvania);
		union.add(hawaii);
		union.add( new State("Illinois","Viola" ) );

		for ( State  s : union ){
			System.out.println("State Name : "+s.getName());
			System.out.println("State Flower : "+s.getFlower());
			System.out.println();
		}

	}

}