package com.devmurph.demo;
import java.util.LinkedList;
public class Agent{

	public static void main(String[] args){
		// aggregating class of commands
		StockCommands commands = new StockCommands();
		// input
		LinkedList<String> orders = new LinkedList<String>();

		orders.add("BUY");orders.add("SELL");orders.add("LIMIT");
		orders.add("LIMIT");orders.add("BUY");orders.add("SELL");
		orders.add("SELL");orders.add("LIMIT");orders.add("BUY");
		
		// execute the commands without a conditional
		while( !orders.isEmpty() ){ 
			commands.getCommands().get(orders.poll()).execute();
		}

	}

}
