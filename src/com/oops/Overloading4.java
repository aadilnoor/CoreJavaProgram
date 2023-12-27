package com.oops;

public class Overloading4 {
	void show(StringBuffer a)
	{
		System.out.println("StringBuffer method");
	}
	void show(String a)
	{
		System.out.println("String method");
	}
	public static void main(String[] args) {
		Overloading4 ob=new Overloading4();
		ob.show("Aadil");
		ob.show(new StringBuffer("noor"));
	}  // ob.show(null); ambiguity problem

}
