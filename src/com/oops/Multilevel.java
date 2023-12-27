package com.oops;

class M {

	void show1() {
		System.out.println("is method show1");
	}
}

class B extends M {

	void show2() {
		System.out.println("is method show2");
	}
}

public class Multilevel extends B {
	void show3() {
		System.out.println("is method show3");
	}

	public static void main(String[] args) {
		A obj = new A();
		obj.show1();
		// obj.show2();
		// obj.show3();
		System.out.println("---------------------------------");
		B obj1=new B();
		obj1.show1();
		obj1.show2();
		//obj1.show3();
		System.out.println("---------------------------------");

		Multilevel obj3 = new Multilevel();
		obj3.show1();
		obj3.show2();
		obj3.show3();
		
	}
}
