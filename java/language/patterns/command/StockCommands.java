package com.devmurph.demo;
import java.util.HashMap;
public class StockCommands{

	HashMap<String, Command> commands = new HashMap<String, Command>();
	public StockCommands(){

		commands.put("BUY", new BuyStockCommand());
		commands.put("SELL", new SellStockCommand());
		commands.put("LIMIT", new LimitStockCommand());
	
	}

	public HashMap<String, Command> getCommands(){
		return commands;
	}

}
