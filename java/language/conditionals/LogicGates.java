package org.gazampa.logic;

public class LogicGates{

//  AND
//	p	q	p ? q
//	T	T	T
//	T	F	F
//	F	T	F
//	F	F	F
	public boolean AND(boolean p, boolean q){
		return p && q;
	}

//OR
// p 	q	p ? q
// T 	T	T
// T 	F	T
// F 	T	T
// F 	F	F
	public boolean OR(boolean p, boolean q){
		return p || q;
	}

//NOT
// p	¬p
// T	F
// F	T
	public boolean NOT (boolean p){
		return ! p;
	}

//NAND
// p	q	p ? q
// T	T	F
// T	F	T
// F	T	T
// F	F	T
	public boolean NAND( boolean p, boolean q){
		return ! ( p && q);
	}


//NOR
// p	q	p ? q
// T	T	F
// T	F	F
// F	T	F
// F	F	T
	public boolean NOR( boolean p, boolean q){
		return ! ( p || q);
	}

//XOR
// p	q	p ? q
// T	T	F
// T	F	T
// F	T	T
// F	F	F
	public boolean XOR(boolean p, boolean q){
		return p^q;
	}

}