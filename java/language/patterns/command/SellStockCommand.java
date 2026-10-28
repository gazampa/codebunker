package com.devmurph.demo;
public class SellStockCommand implements Command{
	private final String name = "SELL";

	public void execute(){
		System.out.println("SELL STOCK");
	}

	public String getName(){
		return name;
	}
}
