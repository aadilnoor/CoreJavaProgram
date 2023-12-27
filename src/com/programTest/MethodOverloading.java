package com.programTest;

class Developer {
	String javaDeveloper(String city) {
		return "Mumbai";
	}

	int javaDeveloper(int pincode) {
		return 400072;
	}
}

public class MethodOverloading {
	public static void main(String[] args) {
		Developer d = new Developer();
		String str = d.javaDeveloper("Mumbai");
		int pin = d.javaDeveloper(400072);
		System.out.println(str + " " + pin);
	}
}
