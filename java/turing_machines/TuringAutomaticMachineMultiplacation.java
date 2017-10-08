import java.lang.StringBuffer;
import java.lang.Double;
import java.math.BigDecimal;
import java.util.*;
//To Do : Package into seperate parts, Tape, Mconfigs as enumerations ?

public class TuringAutomaticMachineMultiplacation{

	enum MCONF { begin, new_digit, mark_digits,find_x, first_r, last_r, find_digits,find_1st_digit,found_1st_digit, find_2nd_digit, found_2nd_digit,
					add_zero, add_one, carry, add_finished,erase_old_x,print_new_x,erase_old_y, print_new_y, reset_new_x, flag_result_digits,unflag_result_digits,
					new_digit_is_zero,print_zero_digit,new_digit_is_one,print_one_digit,cleanup}

	public static void main(String[] args){
		//To Do : Use array of bytes for tape instead of String

		MCONF mconfig = MCONF.begin;
		int scannedSquare=0;
		char symbol;
		StringBuffer tape = new StringBuffer("                                                       ");
		/**
		* "A number is computable if its decimal can be written down by a machine."
		*		- Alan Turing, "On Computable Numbers, With An Application To The Entscheidungsproblem" - 1936
		*
		*
		* The following is an example of performing multiplication using a turing machine. Its taken from a book im reading about Alan Turings 1936 paper.
		*
		*
		*/

		int halt=0;
		while ( halt < 10000 ){
			halt++;
			System.out.println(mconfig+"  "+scannedSquare);

			switch (mconfig){
				case begin :
						 tape.insert(0,"@");scannedSquare++;tape.insert(1,"1");mconfig=MCONF.new_digit;
						 break;
				case new_digit :
						 symbol = readSymbol(tape,scannedSquare);
						 if( symbol=='@'  ){ scannedSquare++;mconfig=MCONF.mark_digits;}
						 else { scannedSquare--;mconfig=MCONF.new_digit;}
						 break;
				case mark_digits :
						 symbol = readSymbol(tape,scannedSquare);
						 if ( symbol=='0'){	scannedSquare++;insertX(tape,scannedSquare);scannedSquare++;mconfig=MCONF.mark_digits;	}
						 else if (symbol=='1'){	scannedSquare++;insertX(tape,scannedSquare);scannedSquare++;mconfig=MCONF.mark_digits;	}
						 else if (symbol==' '){scannedSquare++;insertZ(tape,scannedSquare);scannedSquare++;scannedSquare++;insertR(tape,scannedSquare);mconfig=MCONF.find_x; }
						 break;
				case find_x :
						 symbol = readSymbol(tape,scannedSquare);
						 if ( symbol=='x'){	eraseX(tape,scannedSquare);mconfig=MCONF.first_r;	}
						 else if (symbol=='@'){	;mconfig=MCONF.find_digits;	}
						 else {scannedSquare--;scannedSquare--;mconfig=MCONF.find_x; }
						 break;
				case first_r :
						 symbol = readSymbol(tape,scannedSquare);
						 if ( symbol=='r'){	scannedSquare++;scannedSquare++;mconfig=MCONF.last_r;	}
						 else {scannedSquare++;scannedSquare++;mconfig=MCONF.first_r; }
						 break;
				case last_r :
						 symbol = readSymbol(tape,scannedSquare);
						 if ( symbol=='r'){	scannedSquare++;scannedSquare++;mconfig=MCONF.last_r;	}
						 else if (symbol==' '){	insertR(tape,scannedSquare);scannedSquare++;scannedSquare++;insertR(tape,scannedSquare);mconfig=MCONF.find_x;	}
						 break;
				case find_digits :
						 symbol = readSymbol(tape,scannedSquare);
						 if ( symbol=='@'){	scannedSquare++;scannedSquare++;mconfig=MCONF.find_1st_digit;	}
						 else {scannedSquare--;scannedSquare--;mconfig=MCONF.find_digits; }
						 break;
				case find_1st_digit :
						 symbol = readSymbol(tape,scannedSquare);
						 if ( symbol=='x'){	scannedSquare--;mconfig=MCONF.found_1st_digit;	}
						 else if (symbol=='y'){scannedSquare--;mconfig=MCONF.found_1st_digit;	}
						 else if (symbol=='z'){scannedSquare--;mconfig=MCONF.found_2nd_digit;	}
						 else if (symbol==' '){scannedSquare++;scannedSquare++;mconfig=MCONF.find_1st_digit; }
						 break;
				case found_1st_digit :
						 symbol = readSymbol(tape,scannedSquare);
						 if ( symbol=='0'){	scannedSquare++;mconfig=MCONF.add_zero;	}
						 else if ( symbol=='1'){scannedSquare++;scannedSquare++;scannedSquare++;mconfig=MCONF.find_2nd_digit; }
						 break;
				case find_2nd_digit :
						 symbol = readSymbol(tape,scannedSquare);
						 if ( symbol=='x'){	scannedSquare--;mconfig=MCONF.found_2nd_digit;	}
						 else if (symbol=='y'){scannedSquare--;mconfig=MCONF.found_2nd_digit;	}
						 else if (symbol==' '){scannedSquare++;scannedSquare++;mconfig=MCONF.find_2nd_digit; }
						 break;
				case found_2nd_digit :
						 symbol = readSymbol(tape,scannedSquare);
						 if ( symbol=='0'){	scannedSquare++;mconfig=MCONF.add_zero;	}
						 else if (symbol=='1'){scannedSquare++;mconfig=MCONF.add_one;	}
						 else if (symbol==' '){scannedSquare++;mconfig=MCONF.add_one; }
						 break;
				case add_zero :
						 symbol = readSymbol(tape,scannedSquare);
						 if ( symbol=='r'){	insertS(tape,scannedSquare);mconfig=MCONF.add_finished;	}
						 else if (symbol=='u'){insertV(tape,scannedSquare);mconfig=MCONF.add_finished;	}
						 else {scannedSquare++;scannedSquare++;mconfig=MCONF.add_zero; }
						 break;
				case add_one :
						 symbol = readSymbol(tape,scannedSquare);
						 if ( symbol=='r'){	insertV(tape,scannedSquare);mconfig=MCONF.add_finished;	}
						 else if (symbol=='u'){insertS(tape,scannedSquare);scannedSquare++;scannedSquare++;mconfig=MCONF.carry;	}
						 else {scannedSquare++;scannedSquare++;mconfig=MCONF.add_one; }
						 break;
				case carry :
						 symbol = readSymbol(tape,scannedSquare);
						 if ( symbol=='r'){	insertU(tape,scannedSquare);mconfig=MCONF.add_finished;	}
						 else if (symbol==' '){insertU(tape,scannedSquare);mconfig=MCONF.new_digit_is_zero;	}
						 else if (symbol=='u'){insertR(tape,scannedSquare);scannedSquare++;scannedSquare++;mconfig=MCONF.carry; }
						 break;
				case add_finished :
						 symbol = readSymbol(tape,scannedSquare);
						 if ( symbol=='@'){	scannedSquare++;scannedSquare++;mconfig=MCONF.erase_old_x;	}
						 else {scannedSquare--;scannedSquare--;mconfig=MCONF.add_finished; }
						 break;
				case erase_old_x :
						 symbol = readSymbol(tape,scannedSquare);
						 if ( symbol=='x'){	eraseX(tape,scannedSquare);scannedSquare--;scannedSquare--;mconfig=MCONF.print_new_x;	}
						 else if (symbol=='z'){insertY(tape,scannedSquare);scannedSquare--;scannedSquare--;mconfig=MCONF.print_new_x;	}
						 else {scannedSquare++;scannedSquare++;mconfig=MCONF.erase_old_x; }
						 break;
				case print_new_x :
						 symbol = readSymbol(tape,scannedSquare);
						 if ( symbol=='@'){	scannedSquare++;scannedSquare++;mconfig=MCONF.erase_old_y;	}
						 else if (symbol=='y'){insertZ(tape,scannedSquare);mconfig=MCONF.find_digits;	}
						 else if (symbol==' '){insertX(tape,scannedSquare);mconfig=MCONF.find_digits; }
						 break;
				case erase_old_y :
						 symbol = readSymbol(tape,scannedSquare);
						 if ( symbol=='y'){	eraseY(tape,scannedSquare);scannedSquare--;scannedSquare--;mconfig=MCONF.print_new_y;	}
						 else {scannedSquare++;scannedSquare++;mconfig=MCONF.erase_old_y; }
						 break;
				case print_new_y :
						 symbol = readSymbol(tape,scannedSquare);
						 if (symbol=='@'){scannedSquare++;mconfig=MCONF.new_digit_is_one;	}
						 else {insertY(tape,scannedSquare);scannedSquare++;mconfig=MCONF.reset_new_x; }
						 break;
				case reset_new_x :
						 symbol = readSymbol(tape,scannedSquare);
						 if (symbol==' '){scannedSquare++;insertX(tape,scannedSquare);mconfig=MCONF.flag_result_digits;	}
						 else {scannedSquare++;scannedSquare++;mconfig=MCONF.reset_new_x; }
						 break;
				case flag_result_digits :
						 symbol = readSymbol(tape,scannedSquare);
						 if ( symbol=='s'){	insertT(tape,scannedSquare);scannedSquare++;scannedSquare++;mconfig=MCONF.unflag_result_digits;	}
						 else if (symbol=='v'){insertW(tape,scannedSquare);scannedSquare++;scannedSquare++;mconfig=MCONF.unflag_result_digits;	}
						 else {scannedSquare++;scannedSquare++;mconfig=MCONF.flag_result_digits; }
						 break;
				case unflag_result_digits :
						 symbol = readSymbol(tape,scannedSquare);
						 if ( symbol=='s'){	insertR(tape,scannedSquare);scannedSquare++;scannedSquare++;mconfig=MCONF.unflag_result_digits;	}
						 else if (symbol=='v'){insertU(tape,scannedSquare);scannedSquare++;scannedSquare++;mconfig=MCONF.unflag_result_digits;;	}
						 else {mconfig=MCONF.find_digits; }
						 break;
				case new_digit_is_zero :
						 symbol = readSymbol(tape,scannedSquare);
						 if ( symbol=='@'){	scannedSquare++;mconfig=MCONF.print_zero_digit;	}
						 else {scannedSquare--;mconfig=MCONF.new_digit_is_zero; }
						 break;
				case print_zero_digit :
						 symbol = readSymbol(tape,scannedSquare);
						 if ( symbol=='0'){	scannedSquare++;erase(tape,scannedSquare);scannedSquare++;mconfig=MCONF.print_zero_digit;	}
						 else if ( symbol=='1'){scannedSquare++;erase(tape,scannedSquare);scannedSquare++;mconfig=MCONF.print_zero_digit; }
						 else if (symbol==' '){insert0(tape,scannedSquare);scannedSquare++;scannedSquare++;scannedSquare++;mconfig=MCONF.cleanup;}
						 break;
				case new_digit_is_one :
						 symbol = readSymbol(tape,scannedSquare);
						 if ( symbol=='@'){	scannedSquare++;mconfig=MCONF.print_one_digit;	}
						 else {scannedSquare--;mconfig=MCONF.new_digit_is_one; }
						 break;
				case print_one_digit :
						 symbol = readSymbol(tape,scannedSquare);
						 if ( symbol=='0'){	scannedSquare++;erase(tape,scannedSquare);scannedSquare++;mconfig=MCONF.print_one_digit;	}
						 else if (symbol=='1'){scannedSquare++;erase(tape,scannedSquare);scannedSquare++;mconfig=MCONF.print_one_digit;	}
						 else if (symbol==' '){insert1(tape,scannedSquare);scannedSquare++;scannedSquare++;scannedSquare++;mconfig=MCONF.cleanup; }
						 break;
				case cleanup :
						 symbol = readSymbol(tape,scannedSquare);
						 if ( symbol==' '){	mconfig=MCONF.new_digit;	}
						 else {erase(tape,scannedSquare);scannedSquare++;scannedSquare++;mconfig=MCONF.cleanup; }
						 break;

				default: break;
			}

			System.out.println(tape.toString());

		}


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
	static void insertY(StringBuffer tape,int scannedSquare){
		tape.replace(scannedSquare-1,scannedSquare,"y");
	}
	static void eraseY(StringBuffer tape,int scannedSquare){
		tape.replace(scannedSquare-1,scannedSquare," ");
	}
	static void insertZ(StringBuffer tape,int scannedSquare){
		tape.replace(scannedSquare-1,scannedSquare,"z");
	}
	static void eraseZ(StringBuffer tape,int scannedSquare){
		tape.replace(scannedSquare-1,scannedSquare," ");
	}
	static void insertR(StringBuffer tape,int scannedSquare){
		tape.replace(scannedSquare-1,scannedSquare,"r");
	}
	static void eraseR(StringBuffer tape,int scannedSquare){
		tape.replace(scannedSquare-1,scannedSquare," ");
	}
	static void insertS(StringBuffer tape,int scannedSquare){
		tape.replace(scannedSquare-1,scannedSquare,"s");
	}
	static void eraseS(StringBuffer tape,int scannedSquare){
		tape.replace(scannedSquare-1,scannedSquare," ");
	}
	static void insertT(StringBuffer tape,int scannedSquare){
		tape.replace(scannedSquare-1,scannedSquare,"t");
	}
	static void eraseT(StringBuffer tape,int scannedSquare){
		tape.replace(scannedSquare-1,scannedSquare," ");
	}
	static void insertU(StringBuffer tape,int scannedSquare){
		tape.replace(scannedSquare-1,scannedSquare,"u");
	}
	static void eraseU(StringBuffer tape,int scannedSquare){
		tape.replace(scannedSquare-1,scannedSquare," ");
	}
	static void insertV(StringBuffer tape,int scannedSquare){
		tape.replace(scannedSquare-1,scannedSquare,"v");
	}
	static void eraseV(StringBuffer tape,int scannedSquare){
		tape.replace(scannedSquare-1,scannedSquare," ");
	}
	static void insertW(StringBuffer tape,int scannedSquare){
		tape.replace(scannedSquare-1,scannedSquare,"w");
	}
	static void eraseW(StringBuffer tape,int scannedSquare){
		tape.replace(scannedSquare-1,scannedSquare," ");
	}
	static void insert0(StringBuffer tape,int scannedSquare){
		tape.replace(scannedSquare-1,scannedSquare,"0");
	}
	static void insert1(StringBuffer tape,int scannedSquare){
		tape.replace(scannedSquare-1,scannedSquare,"1");
	}
	static void erase(StringBuffer tape,int scannedSquare){
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