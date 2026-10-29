package com.devmurph.demo;
public class LimitStockCommand implements Command{

	private final String name = "LIMIT";

	public void action(){
		System.out.println("LIMIT STOCK");
	}

	public String getName(){
		return name;
	}

}
