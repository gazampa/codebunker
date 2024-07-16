package org.gazampa.random.uncouple;

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.List;
import java.util.ArrayList;

public class AQueueOf <T> {

	private final Deque<String> q;

	public AQueueOf(){

		q = new ArrayDeque<String>();

	}

	public void add(String s) {

		q.add(s);

	}


	public List<String> flushToList( ) {

		List<String> result = new ArrayList<String>();

		while ( !q.isEmpty() ) {

			result.add( q.poll() );

		}

		return result;

	}

	public String getNextElement() {

		if ( ! q.isEmpty() ) {

			return q.poll();

		}

		return null;

	}

	public boolean isEmpty( ) {

		return q.isEmpty( );

	}


}