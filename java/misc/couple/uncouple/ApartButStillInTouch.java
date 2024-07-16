package org.gazampa.random.uncouple;

public class ApartButStillInTouch{

	public static void main(String[] args) {

		A a = new A();

		B b = new B();

		AQueueOf<String> queue = new AQueueOf<String>();

		for ( int i = 0, j = 5; i < j; i++ ) {
			a.send("I Cant Live " , queue);
			b.receive(queue);
			b.send("If Livin is Without You", queue);
			a.receive(queue);
		}

		for ( int i = 0, j = 5; i < j; i++ ) {
			System.out.print( b.poll() );
			System.out.println( a.poll() );
		}


	}


}