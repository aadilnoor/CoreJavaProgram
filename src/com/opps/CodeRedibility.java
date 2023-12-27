package com.opps;
class Animal {
	 String name;
	 int age;
      Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void detail() {
		System.out.println("Name: " + name+"\nAge: " + age);
	}
}
class Dog extends Animal {
	Dog(String name, int age) {
		super(name, age);
	}
	public void detail1() {
		super.detail(); 
	}
}
public class CodeRedibility {
	public static void main(String[] args) {
		Dog ob = new Dog("Dog",2);
		ob.detail();
	}
}
