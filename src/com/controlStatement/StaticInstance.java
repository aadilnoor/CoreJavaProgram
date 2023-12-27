package com.controlStatement;

public class StaticInstance {
public int id =1;
public static int id1=1;
public static void main(String[] args) {
	StaticInstance r = new StaticInstance();
	for (int i = 0; i < 2; i++) {
		r.id +=i;
		r.id1+=i;
		
	}
	System.out.println(r.id+" "+r.id1);
	StaticInstance r1=new StaticInstance();
	for (int i = 0; i < 2; i++) {
		r1.id+=i;
		r1.id1+=i;
	}
	System.out.println(r1.id+" "+r1.id1);
}
}
