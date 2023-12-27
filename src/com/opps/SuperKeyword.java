package com.opps;

class Demo1 {
	int a = 10;

	public Demo1() {
		System.out.println("hello");
	}
}

public class SuperKeyword extends Demo1 {
	int a = 20;

	public SuperKeyword() {
		super();
		System.out.println("hii");
	}

	public void show(int a) {

		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}

	public static void main(String[] args) {
		SuperKeyword ob = new SuperKeyword();
		ob.show(30);

	}
}
