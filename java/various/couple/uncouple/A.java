package org.gazampa.random.uncouple;

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.List;
import java.util.ArrayList;

public class A{

	private String in;
	private final Deque<String> receiptHistory;

	public A(){

		receiptHistory = new ArrayDeque<String>();

	}

	public void send(String s, AQueueOf<String> q){

		q.add(s);

	}

	public void receive(AQueueOf<String> q){

		while ( ! q.isEmpty() ){

			in = q.getNextElement();

			receiptHistory.add( in );

		}

	}

	public String poll(){

		if ( !receiptHistory.isEmpty() ){

			return receiptHistory.poll();

		}

		return null;

	}

	public List<String> flush(){

		List<String> result = new ArrayList<String>();

		while ( !receiptHistory.isEmpty() ) {

			result.add( receiptHistory.poll() );

		}

		return result;

	}


}