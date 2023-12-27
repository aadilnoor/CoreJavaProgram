package com.opps;


public class Overriding2 {
public void name() {
	System.out.println("h");
	
}
}
class Test4 extends Overriding2
{
	public void name() {
		System.out.println("b");
	}
	public static void main(String[] args) {
		Test4 ob=  (Test4) new Overriding2();
		ob.name();
		
	}
}
