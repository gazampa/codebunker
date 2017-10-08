package org.gazampa.patterns.observer.fatbridge;

import java.util.List;
import java.util.ArrayList;

/** These observers are not very extensible and dependant on the Subject to implement some calling code **/

public enum ConcreteObserver2 implements Observer {

	INSTANCE;

	private ConcreteObserver2(){	}

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

	public void message(MessageGenerator caller){

		for (Notification element : registry){

			element.setMessageData(this + " : " + System.nanoTime() + " : " + caller.getData());

			element.message();

		}

	}

	public String toString(){
		return new String("INSTANCE2");
	}

}