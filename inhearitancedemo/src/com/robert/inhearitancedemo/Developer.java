package com.robert.inhearitancedemo;

import java.util.ArrayList;

public class Developer {

	// ------------------ attributes (private/protected) ----------------------
	private static int devCount = 0;
	private static int totalSalary = 0;
	private ArrayList<String> languages;
	private String name;
	private double sleep;
	private int salary;

	// ------------------ constructors ----------------------
	public Developer() {
		this.name = "no name";
		this.languages = new ArrayList<String>();
		Developer.devCount++;
	};

	public Developer(String name) {
		this.name = name;
		this.languages = new ArrayList<String>();
		Developer.devCount++;
	}

	public Developer(String name, double sleep, int salary) {
		this.name = name;
		this.sleep = sleep;
		this.salary = salary;
		this.languages = new ArrayList<String>();
		Developer.devCount++;
		Developer.totalSalary += salary;
	}

	// ------------------ other class methods ----------------------
	public void displayStatus() {
		System.out.println("name: " + this.name + "\n" + "sleep: " + this.sleep + "\n" + "salary: " + this.salary + "\n"
				+ "languages: " + this.languages + "\n");
	}

	public void addLanguage(String language) {
		this.languages.add(language);
	}
	// ------------------ getters / setters ----------------------

	public ArrayList<String> getLanguages() {
		return languages;
	}

	public void setLanguages(ArrayList<String> languages) {
		this.languages = languages;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSleep() {
		return sleep;
	}

	public void setSleep(double sleep) {
		this.sleep = sleep;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public static int getDevCount() {
		return devCount;
	}

	public static int getTotalSalary() {
		return totalSalary;
	}

}
