package com.programTest;

class Person {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null) {
			this.name = name;
		} else {
			System.out.println("Invalid name provided...");
			this.name = "Unknown";
		}

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 18) {
			this.age = age;
		} else {
			System.out.println("Invalid age provided...");
			this.age = 0;
		}

	}

}

public class EncapsulationValidation {
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("AADIL");
		p.setAge(19);
		System.out.println("Name : " + p.getName() + "\nAge : " + p.getAge());
		System.out.println("-----------------------------");

		p.setName(null);
		p.setAge(-19);
		System.out.println("Name : " + p.getName() + "\nAge : " + p.getAge());

	}
}
