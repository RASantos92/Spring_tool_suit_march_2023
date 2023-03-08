package com.robert.interfacedemo;

public class Test {

	public static void main(String[] args) {
		Cat cat1 = new Cat("emilio");
		cat1.showAffection();
		cat1.askForFood();
		cat1.play();
		
		System.out.println("\n");
		Dog dog1 = new Dog("Chester");
		
		dog1.showAffection();
		dog1.askForFood();
		dog1.play();

	}

}
