package com.robert.interfacedemo;

public class Pet {
	private String name;
	private String type;
	
	public Pet() {
		this.name = "random pet name";
	}
	
	

	public Pet(String name) {
		this.name = name;
	}
	

	public Pet(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	public void askForFood() {
		System.out.println("test");
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public void showAffection() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
