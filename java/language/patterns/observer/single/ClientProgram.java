package org.gazampa.patterns.observer.fatbridge;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;
public class ClientProgram{

	public static void main( String[] args ){

		List<Notification> listeners = new ArrayList<Notification>();

		// set up some objects that listen for messages
		for ( int i = 0, j = 1; i < j; i++ ){

			listeners.add ( new Listener() );

		}

		// set up some objects that generate messages
		List<Subject> talkers = new ArrayList<Subject>();

		for ( int i = 0, j = 2; i < j; i++ ){

			talkers.add(new Subject());

		}

		// generate some messages, listeners will get the message
		for (Subject talker : talkers ){

			talker.generateMessage();

		}

		for ( Notification element : listeners ) {

			System.out.println ( System.nanoTime() + " : " + ( (Listener) element ).consumeHistory().toString() );

		}

	}


}