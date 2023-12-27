package com.oops;

public class ByRefrence {
	String name;
	String color;
	int age;

	public static void main(String[] args) {
		ByRefrence crow = new ByRefrence();
		crow.name = "cauwa";
		crow.color = "black";
		crow.age = 2;
		System.out.println(crow.name + "\n" + crow.color + "\n" + crow.age);

	}

}
