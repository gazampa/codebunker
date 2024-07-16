package org.gazampa.random;

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.List;
import java.util.ArrayList;

public class B{

	private A a;
	private String in;
	private final Deque<String> history;

	public B(){

		 history = new ArrayDeque<String>();

	}

	public B(A a){

		this.a = a;

	 	history = new ArrayDeque<String>();

	}

	public void send(){

		a.receive(" If Livin Is Without You");

	}

	public void receive(String message){

		in = message;

		history.addFirst(message);

	}

	public void setA(A a){

		this.a = a;

	}

	public A getA(){
		return a;
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