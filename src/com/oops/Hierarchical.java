package com.oops;

class Cat {
	void eat() {
		System.out.println("eating...");
	}
}

class Dog extends Cat {
	void sleep() {
		System.out.println("sleeping...");
	}
}

class C extends Cat {
	void bark() {
		System.out.println("barking...");
	}
}

public class Hierarchical {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.sleep();
		d.eat();
	//	d.bark();          can't call
		C obj = new C();
		obj.eat();
		// obj.sleep(); can't call
		obj.bark();
	}

}
