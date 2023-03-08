package com.robert.interfacedemo;

public class Cat extends Pet implements HousePet {

	public Cat() {
		super("random cat name", "cat");
	}
	
	public Cat(String name) {
		super(name, "cat");
	}



}
