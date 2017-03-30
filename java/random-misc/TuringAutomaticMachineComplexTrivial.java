import java.lang.StringBuffer;
import java.lang.Double;
import java.math.BigDecimal;
//To Do : Package into seperate parts, Tape, Mconfigs as enumerations ?
public class TuringAutomaticMachineComplexTrivial{

	public static void main(String[] args){
		//To Do : Use array of bytes for tape instead of String
		final int b = 0;
		final int d = 1;
		final int q = 2;
		final int p = 3;
		final int f = 4;

		int mconfig;
		int scannedSquare=1;
		char symbol;
		StringBuffer tape = new StringBuffer();

		/**
		* "A number is computable if its decimal can be written down by a machine."
		*		- Alan Turing, "On Computable Numbers, With An Application To The Entscheidungsproblem" - 1936
		*
		*
		* The following is the second example of a simple turing machine as described in section three of his paper from which
		* the above quote is taken.
		*
		*
		* It computes a number, 001011011101111011..., with increasing runs of 1 after each zero, This number is irrational and also likely transcendental,
		* a real number that does not have an algebraic solution, thus it transcends algebraic numbers.
		* I place an operational limit of 506 ( 21 1's ). This makes the machine circular.
		*
		*/

		mconfig=b; //Begining m-config

		while ( tape.length()<506 ){

			switch (mconfig){
				case b :
						 tape.append("e");scannedSquare++;tape.append("e");
						 scannedSquare++;tape.append("0");scannedSquare++;tape.append(" ");scannedSquare++;tape.append("0");
						 scannedSquare--;scannedSquare--;
						 mconfig=d;
						 break;
				case d :
						 symbol = readSymbol(tape,scannedSquare);
						 if( symbol=='1'  ){	scannedSquare++;insertX(tape,scannedSquare);scannedSquare--;scannedSquare--;scannedSquare--;mconfig=d;}
						 else if (symbol=='0'){	mconfig=q;}
						 break;
				case q :
						 symbol = readSymbol(tape,scannedSquare);
						 if ( symbol=='1' || symbol=='0' ){	scannedSquare++;scannedSquare++;mconfig=q;	}
						 else{	tape.append(" ");tape.append("1");scannedSquare--;mconfig=p;	}
						 break;
				case p :
						 symbol = readSymbol(tape,scannedSquare);
						 if ( symbol=='x' ){	eraseX(tape,scannedSquare);scannedSquare++;mconfig=q;	}
						 else if ( symbol=='e') {	scannedSquare++;mconfig=f;	}
						 else {	scannedSquare--;scannedSquare--;mconfig=p;	}
						 break;
				case f :
						 symbol = readSymbol(tape,scannedSquare);
						 if ( symbol=='1' || symbol=='0' ){	scannedSquare++;scannedSquare++;mconfig=f;	}
						 else{	tape.append(" ");tape.append("0");scannedSquare--;scannedSquare--;mconfig=d;	}
						 break;

				default: break;
			}

		}


		System.out.println(removeSymbolsOfTheSecondKind(tape));

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

		while( tape.indexOf("e")!=-1 ){
			tape.deleteCharAt(tape.indexOf("e"));
		}

		while( tape.indexOf("x")!=-1 ){
			tape.deleteCharAt(tape.indexOf("x"));
		}

		return tape;
	}

	static int moveRight(Integer scannedSquare){
		return scannedSquare++;
	}

	static int moveLeft(Integer scannedSquare){
		return scannedSquare--;
	}

	static char readSymbol(StringBuffer tape,int scannedSquare){
		char result;
		if ( scannedSquare > 0 && scannedSquare <= tape.length() ){
			result =  tape.charAt(scannedSquare-1);}
		else if ( scannedSquare > tape.length() ){result='~';}
			else {result = '~';}
		return result;
	}

	static void insertX(StringBuffer tape,int scannedSquare){
		tape.replace(scannedSquare-1,scannedSquare,"x");
	}

	static void eraseX(StringBuffer tape,int scannedSquare){
		tape.replace(scannedSquare-1,scannedSquare," ");
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