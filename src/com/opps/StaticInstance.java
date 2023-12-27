package com.opps;

public class StaticInstance {
	int a = 10;
	static int b = 20;

	{
		System.out.println(a + " " + b);
	}

	static {
		System.out.println("this is only access static variable.." + b);
	}

	public static void main(String[] args) {
		StaticInstance ob = new StaticInstance();
	}

}
