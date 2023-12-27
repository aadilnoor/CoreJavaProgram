package com.controlStatement;

public class Febonocci {
public static void main(String[] args) {
	int a=1,b=0;
	int c;
	for (int i = 0; i <=10; i++) {
		c=a+b;
		System.out.println(c);
		b=a;
		a=c;
	}
}
}
