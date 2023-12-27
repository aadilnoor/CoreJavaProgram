package com.oops;

class Practice {
	int a = 10; // super
}

public class SuperKey extends Practice {

	int a = 20; // this

	void show(int a) {
		System.out.println(a);
		System.out.println(this.a);// this refers to the current class instance variable
		System.out.println(super.a);// super refers to the parent class instance variable
	}

	public static void main(String[] args) {
		SuperKey ob = new SuperKey();
		ob.show(30);
	}

}
