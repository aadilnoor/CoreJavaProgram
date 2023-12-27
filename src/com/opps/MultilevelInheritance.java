package com.opps;

class A {
	int a, b, c;

	void add() {
		a = 10;
		b = 20;
		c = a + b;
		System.out.println("Addision of two numbers : " + c);
	}

	void sub() {
		a = 200;
		b = 100;
		c = a - b;
		System.out.println("substraction of two numbers : " + c);
	}

}

class B extends A {
	void multi() {
		a = 10;
		b = 20;
		c = a * b;
		System.out.println("multiplication of two numbers : " + c);
	}

	void div() {
		a = 20;
		b = 30;
		c = a / b;
		System.out.println("division of two nmbers : " + c);
	}
}

class C extends B {
	void rem() {
		a = 20;
		b = 3;
		c = -a % b;
		System.out.println("remainder of two numbers : " + c);
	}
}

public class MultilevelInheritance {
	public static void main(String[] args) {
		C ob = new C();
		ob.add();
		ob.sub();
		ob.multi();
		ob.div();
		ob.rem();
	}
}
