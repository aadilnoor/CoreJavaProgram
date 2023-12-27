package com.oops;

public class AutoPromotion {
	void show(int a)
	{
		System.out.println("int method");
	}
	void show(double a)
	{
		System.out.println("Double method");
	}
	public static void main(String[] args) {
		AutoPromotion ob =new AutoPromotion();
		ob.show(10.0f);
	}

}
