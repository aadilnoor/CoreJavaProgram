package com.oops;

public class Overloading5 {
	void show(String a, float b) {
		System.out.println("int float method");
	}
	void show(float a,int b)
	{
		System.out.println("float int method");
	}
	public static void main(String[] args) {
		Overloading5 ob=new Overloading5();
		//ob.show(10,10.0f);
		ob.show(20.7f,10);
		ob.show("abc", 10.2f);
	}
}
