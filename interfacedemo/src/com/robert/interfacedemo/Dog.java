package com.robert.interfacedemo;

public class Dog extends Pet implements HousePet{

	public Dog() {
		super("random dog name", "dog");
	}
	
	public Dog(String name) {
		super(name, "dog");
	}

	
	public void askForFood() {
		super.askForFood();
		System.out.println("Barks, whines, howls , drools");
		
	}
	
	public void showAffection() {
		System.out.println("It does not");
	}

}
