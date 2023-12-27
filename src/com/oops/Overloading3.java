package com.oops;

public class Overloading3 {
	void show(Object a)
	{
		System.out.println("Object method ");
	}
	void show (String a)
	{
		System.out.println("String method");
	}
	public static void main(String[] args) {
		Overloading3 ob =new Overloading3();
		ob.show("Aadil");
			
	}

}
