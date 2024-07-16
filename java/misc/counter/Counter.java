package org.gazampa.stopwatch;

import java.util.UUID;
public class Counter implements Comparable<Counter> {

	private final String name;
    private final int maxCount;
    private int count;

    public Counter() {
        name = UUID.randomUUID().toString();
    	maxCount = Integer.MAX_VALUE;
    	count = 0;
    }

    public Counter(String id) {
        name = id;
    	maxCount = Integer.MAX_VALUE;
        count = 0;
    }

    public Counter(int max) {
        name = UUID.randomUUID().toString();
    	maxCount = max;
        count = 0;
    }

    public Counter(String id, int max) {
        name = id;
        maxCount = max;
    	count = 0;
    }

    public void increment() {
        if (count < maxCount) count++;
    }

	public void add(Integer i){
		count = count + i;
	}

    // return the current count
    public int value() {
        return count;
    }

    public String toString() {
        return name + ": " + count;
    }

    public int compareTo(Counter that) {
        if      (this.count < that.count) return -1;
        else if (this.count > that.count) return +1;
        else                              return  0;
    }

}