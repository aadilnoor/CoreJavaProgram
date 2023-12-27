package com.oops;

class A {
	void show1() {
		System.out.println("is method show1");
	}
}

public class SingleLevel extends A {
	void show2() {
		System.out.println("is method show2");
	}

	public static void main(String[] args) {
		A obj = new A();
		obj.show1();
		// obj.show2();

		SingleLevel obj1 = new SingleLevel();
		obj1.show1();
		obj1.show2();
	}
}