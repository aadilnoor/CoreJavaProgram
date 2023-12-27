package com.constructor;
public class ConstOverloading {
	String name;
	int rollno;
	String className;
	ConstOverloading(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}
	ConstOverloading(String name, int rollno, String className) {
		this.name = name;
		this.rollno = rollno;
		this.className = className;
	}
	public void show() {
		System.out.println("Student name = " + name);
		System.out.println("Roll No = " + rollno);
		System.out.println("Class Name = " + className);
	}
	public static void main(String[] args) {
		ConstOverloading c = new ConstOverloading("Aadil", 10);
		c.show();
		ConstOverloading c1 = new ConstOverloading("Aamir", 11, "BCA");
		c1.show();
	}
}
