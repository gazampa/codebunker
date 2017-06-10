package org.gazampa.random;

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.List;
import java.util.ArrayList;

public class A{

	private B b;
	private String in;
	private final Deque<String> history;

	public A(){

		 history = new ArrayDeque<String>();

	}

	public A(B b){

		this.b = b;
	 	history = new ArrayDeque<String>();
	}

	public void send(){

		b.receive("Cant Live");

	}

	public void receive(String message){

		in = message;

		history.addFirst(message);

	}

	public void setB(B b){

		this.b = b;

	}

	public B getB(){

		return b;

	}

	public String poll(){

		if ( !history.isEmpty() ){

			return history.poll();

		}

		return null;

	}

	public List<String> flush(){

		List<String> result = new ArrayList<String>();

		while ( !history.isEmpty() ) {

			result.add( history.poll() );

		}

		return result;

	}


}