package com.opps;


class Test5 {
public void name() {
	System.out.println("h");
	
}
}
public class Overriding extends Test5
{
	public void name() {
		System.out.println("b");
	}
	public static void main(String[] args) {
		Overriding ob=  new Overriding();
		ob.name();
		
	}
}
