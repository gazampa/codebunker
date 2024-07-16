import java.lang.StringBuffer;
import java.lang.Double;
import java.math.BigDecimal;
//To Do : Package into seperate parts, Tape, Mconfigs as enumerations ?
public class TuringAutomaticMachineTrivial{

	public static void main(String[] args){
		//To Do : Use array of bytes for tape instead of String
		final int b = 0;
		final int d = 1;
		final int q = 2;
		final int p = 3;
		final int f = 4;

		int mconfig;
		int scannedSquare=0;
		StringBuffer tape = new StringBuffer();

		/**
		* "A number is computable if its decimal can be written down by a machine."
		*		- Alan Turing, "On Computable Numbers, With An Application To The Entscheidungsproblem" - 1936
		*
		*
		* The following is a simple turing machine as described at the opening of section three of his paper from which
		* the above quote is taken.
		*
		*
		* It computes a number, 010101010101..., i place an operational limit of 100. This makes the machine circular.
		*
		*/

		mconfig=b; //Begining m-config

		while ( tape.length()<100 ){

			switch (mconfig){
				case b : tape.append("0");scannedSquare++;mconfig=c;break;
				case d : tape.append(" ");scannedSquare++;mconfig=e;break;
				case q : tape.append(" ");scannedSquare++;mconfig=e;break;
				case p : tape.append("1");scannedSquare++;mconfig=k;break;
				case f : tape.append(" ");scannedSquare++;mconfig=b;break;
				default: break;
			}

		}

		System.out.println(tape);


		System.out.println(getDecimalFraction(removeSymbolsOfTheSecondKind(tape)));
	}

	/**
	*
	* Generates a Decimal Fraction Representation of a Binary Sequence
	*
	*/
	static BigDecimal getDecimalFraction(StringBuffer tape){
		BigDecimal result = BigDecimal.ZERO;
		for (int i=0;i<tape.length();i++){
			String squareValue = tape.substring(i,i+1);
			int dubv = new Integer(squareValue);
			result = result.add( new BigDecimal( dubv*Math.pow(2,-(i+1)) ) );
		}
		return result;
	}

	static StringBuffer removeSymbolsOfTheSecondKind(StringBuffer tape){
		while( tape.indexOf(" ")!=-1 ){
			tape.deleteCharAt(tape.indexOf(" "));
		}
		return tape;
	}

}

/*
		//This machine computes the value of .010101010.....( .333... )
				case b : tape.append("0");scannedSquare++;mconfig=c;break;
				case c : tape.append(" ");scannedSquare++;mconfig=e;break;
				case e : tape.append("1");scannedSquare++;mconfig=k;break;
				case k : tape.append(" ");scannedSquare++;mconfig=b;break;
				default: break;

		//This machine computes the value of .100000000.....( .250... )
				case b : tape.append("0");scannedSquare++;mconfig=c;break;
				case c : tape.append(" ");scannedSquare++;mconfig=d;break;
				case d : tape.append("1");scannedSquare++;mconfig=e;break;
				case e : tape.append(" ");scannedSquare++;mconfig=f;break;
				case f : tape.append("0");scannedSquare++;mconfig=e;break;
				default : break;

*/