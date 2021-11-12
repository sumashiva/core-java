package com.xworkz.array;

public class Kalla {
	private String name;
	private int age;
	private int experience;
	private int totalNoOfCases;
	private String area;

	public Kalla() {

	}

	public Kalla(String name, int age, int experience, int totalNoOfCases, String area) {
		super();
		this.name = name;
		this.age = age;
		this.experience = experience;
		this.totalNoOfCases = totalNoOfCases;
		this.area = area;
	}

	public String stolenItem(String item) {
		System.out.println("invoking stolen item method from kalla");
		return "laptop";
	}

	public void robbery() {
		System.out.println("invoking robbery from kala");
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getExperience() {
		return experience;
	}

	public int getTotalNoOfCases() {
		return totalNoOfCases;
	}

	public String getArea() {
		return area;
	}

}
