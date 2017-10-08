package org.gazampa.patterns.observer;

public class ConcreteObserver extends Observer{

	public ConcreteObserver(Subject client){

		this.subject = client;

		this.subject.attach(this);

	}

	public void update(){

		System.out.println(this + " observing : " + subject.getData());

	}


}