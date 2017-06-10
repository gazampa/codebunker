package org.gazampa.patterns.observer.fatbridge;

import java.util.List;
import java.util.ArrayList;

public enum ConcreteObserver implements Observer {

	INSTANCE;

	private ConcreteObserver(){	}

	// reference to list is final, elements that it contains are not.
	private final List<Notification> registry = new ArrayList<Notification>();

	// client objects sign up to be observe another object
	public void register(Notification element){

		registry.add(element);

	}

	public void unregister(Notification element){

		if (registry.contains(element)){

			registry.remove(element);

		}

	}

	// an object capable of generating messages, does so, notifying this observer, that relays the message to its listeners
	// this observer then sets state in the listening objects - its not really just an observer - more of an observer and a bridge
	// it observes the message generator and notifies the listener
	public void message(MessageGenerator caller){

		for (Notification element : registry){

			element.setMessageData(this + " : " + System.nanoTime() + " : " + caller.getData());

			element.message();

		}

	}

	public String toString(){
		return new String("INSTANCE");
	}

}