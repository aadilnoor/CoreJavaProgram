package com.oops;

public class Test1 {
	String color;
	int age;
	void Obj(String c, int a) {
		color=c;
		age=a;
		System.out.println(color+" \n "+age);
	}

	/*
	 * void disp() {
	 * 
	 * }
	 */
	public static void main(String[] args) {
		Test1 t=new Test1();
		t.Obj("black", 10);
		//t.disp();
	}

}
