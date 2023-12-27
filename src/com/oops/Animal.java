package com.oops;

public class Animal {
	public void eat() {

		System.out.println("he is eating");
	}

	public void run() {
		System.out.println("he is running");
	}

	public static void main(String[] args) {
		System.out.println("Aadil");
		Animal moli = new Animal();
		moli.run();
		moli.eat();
		Birds crow = new Birds();
		crow.fly();
	}

}

class Birds {
	public void fly() {
		System.out.println("birds is flying");
	}
}
