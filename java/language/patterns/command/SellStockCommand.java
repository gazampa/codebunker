package com.devmurph.demo;

public class SellStockCommand implements Command{

	private final String name = "SELL";

	public void action(){

		System.out.println("SELL STOCK");

	}

	public String getName(){

		return name;

	}
}
