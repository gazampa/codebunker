import org.gazampa.logic.LogicGates;

public class Example{

	public static void main(String[] args){

		LogicGates lg = new LogicGates();

		//  AND
		//	p	q	p ? q
		//	T	T	T
		//	T	F	F
		//	F	T	F
		//	F	F	F
		System.out.println("AND");
		log( lg.AND(true, true) );
		log( lg.AND(true, false) );
		log( lg.AND(false, true) );
		log( lg.AND(false, false) );

		//OR
		// p 	q	p ? q
		// T 	T	T
		// T 	F	T
		// F 	T	T
		// F 	F	F
		System.out.println("OR");
		log( lg.OR(true, true) );
		log( lg.OR(true, false) );
		log( lg.OR(false, true) );
		log( lg.OR(false, false) );

		//NAND
		// p	q	p ? q
		// T	T	F
		// T	F	T
		// F	T	T
		// F	F	T
		System.out.println("NAND");
		log( lg.NAND(true, true) );
		log( lg.NAND(true, false) );
		log( lg.NAND(false, true) );
		log( lg.NAND(false, false) );

		//NOR
		// p	q	p ? q
		// T	T	F
		// T	F	F
		// F	T	F
		// F	F	T
		System.out.println("NOR");
		log( lg.NOR(true, true) );
		log( lg.NOR(true, false) );
		log( lg.NOR(false, true) );
		log( lg.NOR(false, false) );

		//XOR
		// p	q	p ? q
		// T	T	F
		// T	F	T
		// F	T	T
		// F	F	F
		System.out.println("XOR");
		log( lg.XOR(true, true) );
		log( lg.XOR(true, false) );
		log( lg.XOR(false, true) );
		log( lg.XOR(false, false) );

	}

	static void log(boolean val){
		System.out.println(val);
	}
}