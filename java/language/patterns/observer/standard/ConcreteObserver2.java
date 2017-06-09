package org.gazampa.patterns.observer;

public class ConcreteObserver2 extends Observer{

	public ConcreteObserver2(Subject client){

		subject = client;

		subject.attach(this);

	}

	public void update(){

		System.out.println(this + " is also observing : " + subject.getData());

	}


}