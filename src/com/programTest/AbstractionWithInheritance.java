package com.programTest;

abstract class Animal {
	abstract String makeSound();

	abstract String color();
}

class Dog extends Animal {
	public String makeSound() {
		return "Dog is barking";
	}

	public String color() {
		return "Black";
	}
}

public class AbstractionWithInheritance {
	public static void main(String[] args) {
		Dog d = new Dog();
		String color = d.color();
		String sound = d.makeSound();
		System.out.println("Dog color : " + color + "\nDog make sound : " + sound);
	}
}
