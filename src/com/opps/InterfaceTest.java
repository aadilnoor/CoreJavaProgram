package com.opps;

interface IF1 {

	public static final int roll = 10;
	public static final String name = "AADIL";

	public abstract int disp();
}

interface IF2 {

	public static final int age = 18;

	public abstract void show();
}

class Implement implements IF1, IF2 {
	@Override
	public int disp() {
		System.out.println("ROLL NO : " + roll + "\nNAME : " + name);
		return 0;

	}

	@Override
	public void show() {
		System.out.println("AGE : " + age);

	}
}

public class InterfaceTest {
	public static void main(String[] args) {
		Implement ob = new Implement();
		ob.disp();
		ob.show();
	}
}
