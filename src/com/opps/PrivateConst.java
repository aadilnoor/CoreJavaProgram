package com.opps;

public class PrivateConst {
	int a;
	double b;
	String c;

	private PrivateConst() {
		a = 10;
		b = 23.52;
		c = "Aadil";
		System.out.println(a + "\n" + b + "\n" + c);
	}

	static void show() {
		System.out.println("hi");
	}

	 public static void main(String[] args) {
		PrivateConst c = new PrivateConst();
		}

}
