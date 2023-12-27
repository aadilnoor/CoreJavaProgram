package com.oops;

class First {
	void show(int i)
	{
		System.out.println("1");
		
	}
}
public class Overriding extends First{
	void show(int i)
	{
		System.out.println("2");
		super.show(i);
		
	}
	public static void main(String[] args) {
	First ob = new First();
		//ob.show();
		
		Overriding ob1 = new Overriding();
		ob1.show(10);
	}

}
