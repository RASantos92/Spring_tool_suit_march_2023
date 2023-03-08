package com.robert.inhearitancedemo;

public class BackendDev extends Developer{
	private boolean isLogical;
	
	
	public BackendDev() {
		super("backend dev no name");
		this.setSalary(200000);
		this.setSleep(7);
		this.isLogical = true;
	}
	
	
	public void displayStatus() {
		super.displayStatus();
		System.out.println("is Logical? :" + this.isLogical);
		
	}
	
	public void giveRaise(int amount) {
		this.setSalary(this.getSalary() + amount);;
	}
	
	public boolean isLogical() {
		return isLogical;
	}
	public void setLogical(boolean isLogical) {
		this.isLogical = isLogical;
	}
	
	

}
