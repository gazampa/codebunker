package com.devmurph.demo;
public class BuyStockCommand implements Command{

	private final String name = "BUY";

	public void execute(){
		System.out.println("BUY STOCK");
	}

	public String getName(){
		return name;
	}
}
