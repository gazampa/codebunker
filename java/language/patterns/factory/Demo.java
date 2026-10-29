package com.devmurph.demo;

class Demo{

	public static void main(String[] args){

		ComponentFactory factory = new ComponentFactory();

		Component component = factory.create("COMPONENT_1");
		
		component.operation();

		component = factory.create("COMPONENT_2");

		component.operation();

	}
}