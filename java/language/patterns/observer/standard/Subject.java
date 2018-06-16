package org.gazampa.patterns.observer;

import java.util.List;
import java.util.ArrayList;

public class Subject{

	private List<Observer> observers = new ArrayList<Observer>();

	private String data;

	public Subject(){

	}

	public void attach(Observer observer){

		observers.add(observer);

	}

	private void notifyAllObservers(){

		for (Observer o : observers){

			o.update();

		}

	}

	public String getData(){

		return data;

	}

	public void setData(String message){

		data = this + " has a message : " + message;

		notifyAllObservers();

	}

	public void detach(Observer observer){

		observer.detach();

		observers.remove(observer);

	}

}