package com.constructor;

class Person {
	public Person() {
		System.out.println("person class 1st constructor...");
	}

	public Person(String name) {
		System.out.println("person class 2nd constructor...");
	}
}

public class ConstructorChaining extends Person {
	public ConstructorChaining() {
		this("aadil");
		System.out.println("sub class 1st constructor...");
	}

	public ConstructorChaining(String name) {
		super();
		System.out.println("sub class 2nd constructor...");
	}

	public static void main(String[] args) {
		new ConstructorChaining();
	}

}
