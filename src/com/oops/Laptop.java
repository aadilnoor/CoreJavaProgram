package com.oops;

public class Laptop {
	String name="hp";
	String color="silver";
	String  ram ="8gb";
	void hp()
	{
		System.out.println(name+"\n"+color+"\n"+ram);
	}
	public static void main(String[] args) {
		Laptop l=new Laptop();
		l.hp();
	}
}