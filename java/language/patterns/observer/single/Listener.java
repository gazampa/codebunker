package org.gazampa.patterns.observer.fatbridge;

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Listener implements Notification{

	private int notificationCounter;

	private String messageData;

	Deque<String> history;

	// this object registers itself to receive messages
	public Listener(){

		history = new ArrayDeque<String>();

		register(ConcreteObserver.INSTANCE);

		register(ConcreteObserver2.INSTANCE);

	}

	// when another objects generates a message, this method is invoked by the observer
	public void message(){

		notificationCounter = notificationCounter + 1;

	}

	// as above except this method passes through the data
	// adds it to front of lifo q
	public void setMessageData(String message){

		messageData = message;

		history.addFirst(message);

	}

	public void register(Observer observer){

		observer.register(this);

	}

	public void unregister(Observer observer){

		observer.unregister(this);

	}

	public List<String> consumeHistory(){

		ArrayList<String> result = new ArrayList<String>();

		Iterator<String> iterator = history.iterator();

		//forcing use of an iterator, compilers can optimize them
		while ( !history.isEmpty() ) {

			result.add( history.poll() );

		}

		return result;

	}


}