package org.gazampa.patterns.observer.fatbridge;

import java.util.Date;
import java.util.UUID;
public class Subject implements MessageGenerator{

	private final String data;

	public Subject(){
		data = UUID.randomUUID().toString();
	}

	// generate a message and tell observer object which holds a list of clients
	public void generateMessage(){
		System.out.println(System.nanoTime() + " : " + this + " told everyone that " + data);
		ConcreteObserver.INSTANCE.message(this);
		ConcreteObserver2.INSTANCE.message(this);
	}

	public String getData(){
		return data;
	}

}