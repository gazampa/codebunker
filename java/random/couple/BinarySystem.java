package org.gazampa.random;

public class BinarySystem{

	/** Two Objects bound to each other, sending each other messages...til the end of time **/

	public static void main(String[] args){

		A a = new A();

		B b = new B();

		a.setB(b);

		b.setA(a);

		for ( int i = 0, j = 25; i < j; i++ ) {

			a.send();

			b.send();

		}

		for ( int i = 0, j = 25; i < j; i++ ) {

			System.out.println( b.poll() );

			System.out.println( a.poll() );

		}

	}


}