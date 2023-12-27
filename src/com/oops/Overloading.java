package com.oops;

public class Overloading {
	void show(int a, String b)
	{
		System.out.println("hi");
	}
	void show(String b, int a)
	{
		System.out.println("bye");
	}
	public static void main(String[] args) {
		Overloading ob =new Overloading();
		ob.show("Aadil",101);
		ob.show(101,"Aadil");
	}
	
	
	
	
	

}
