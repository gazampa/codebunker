import java.lang.StringBuffer;
import java.lang.Double;
import java.math.BigDecimal;
import java.util.*;
//To Do : Package into seperate parts, Tape, Mconfigs as enumerations ?

public class TuringAutomaticMachineAddition{

	enum Mconfig { begin, increment, rewind }

	public static void main(String[] args){
		//To Do : Use array of bytes for tape instead of String
		//final int b = 0;
		//final int increment = 1;
		//final int rewind = 2;

		Mconfig mconfig = Mconfig.begin;
		int scannedSquare=50;
		char symbol;
		StringBuffer tape = new StringBuffer("                                                   ");
		HashSet<Integer> numbers = new HashSet<Integer>();
		for ( int i=0;i<2049;i++){
			numbers.add(i);
		}
		/**
		* "A number is computable if its decimal can be written down by a machine."
		*		- Alan Turing, "On Computable Numbers, With An Application To The Entscheidungsproblem" - 1936
		*
		*
		* The following is an example of performing simple incrementation using a turing machine. Its taken from a book im reading about Alan Turings 1936 paper.
		*
		*
		* Begining at zero, the machine proceeds to increment by 1. It takes a number of cycles ( after 0 and 1 - number of binary places + 2 )to complete the increment and uses the same
		* squares to work out the next number. The result is that during an increment, the original number is overwritten with the sidework of calculating the next number until all cycles complete and the result appears.
		*
		* Operationally, the Machine works from right to left.
		*/

		int halt=0;
		int stepDifference = 0;
		while ( halt < 10500 ){
			halt++;
			System.out.println(mconfig+" "+tape.length()+" "+scannedSquare);

			switch (mconfig){
				case begin :
						 tape.replace(scannedSquare-1,scannedSquare,"0");mconfig=Mconfig.increment;
						 break;
				case increment :
						 symbol = readSymbol(tape,scannedSquare);
						 if( symbol=='0'  ){ tape.replace(scannedSquare-1,scannedSquare,"1");mconfig=Mconfig.rewind;}
						 else if (symbol=='1'){	tape.replace(scannedSquare-1,scannedSquare,"0");scannedSquare--;mconfig=Mconfig.increment;}
						 else if (symbol==' '){ tape.replace(scannedSquare-1,scannedSquare,"1");mconfig=Mconfig.rewind;}
						 break;
				case rewind :
						 symbol = readSymbol(tape,scannedSquare);
						 if ( symbol==' '){	scannedSquare--;mconfig=Mconfig.increment;	}
						 else{	scannedSquare++;mconfig=Mconfig.rewind;	}
						 break;

				default: break;
			}

			System.out.println(" tape "+tape.toString());
			StringBuffer sepTape = new StringBuffer(tape);
			System.out.println("Binary - "+removeSymbolsOfTheSecondKind(sepTape).toString()+ "   :  Decimal - "+getDecimalValue(sepTape));
			if ( numbers.contains( getDecimalValue(sepTape).intValue() ) ){
				System.out.println("  New Number Calculated after "+( halt-stepDifference) +" iterations");
				numbers.remove(getDecimalValue(sepTape).intValue());
				stepDifference = halt;
			}
		}

		System.out.println("Binary - "+removeSymbolsOfTheSecondKind(tape).toString()+ "   :  Decimal - "+getDecimalValue(tape));

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
	/**
	*
	* Generates a Decimal Representation of a Binary Sequence
	*
	*/
	static BigDecimal getDecimalValue(StringBuffer tape){
		BigDecimal result = BigDecimal.ZERO;
		StringBuffer trimmed = removeSymbolsOfTheSecondKind(tape);
		int exponent = trimmed.length()-1;
		for (int i=0;i<trimmed.length();i++){
			String squareValue = tape.substring(i,i+1);
			int dubv = new Integer(squareValue);
			result = result.add( new BigDecimal( dubv*Math.pow(2,(exponent)) ) );
			exponent--;
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
		System.out.println(" symbol "+result);
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