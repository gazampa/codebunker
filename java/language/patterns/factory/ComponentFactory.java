package com.devmurph.demo;
public class ComponentFactory{

	public Component create(String name){

		if  ( "COMPONENT_1".equalsIgnoreCase(name) ){
			return new ComponentImplementation1();
		} else if ("COMPONENT_2".equalsIgnoreCase(name)){
			return new ComponentImplementation2();
		} else{
			return null;
		}
	}

}