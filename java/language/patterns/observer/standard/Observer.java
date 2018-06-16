package org.gazampa.patterns.observer;

public abstract class Observer{

	protected Subject subject; // in an interface, the variables are public or private

	public abstract void update();

	public void detach(){

		subject = null;

	}

}