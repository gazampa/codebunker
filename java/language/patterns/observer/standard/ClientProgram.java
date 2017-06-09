package org.gazampa.patterns.observer;

public class ClientProgram{

	public static void main(String[] args){

		Subject obj = new Subject();

		Observer observer1 = new ConcreteObserver(obj);

		Observer observer2 = new ConcreteObserver2(obj);

		// set state that is the centre of attention
		obj.setData(" Friends, Romans, Countrymen ");

	}


}