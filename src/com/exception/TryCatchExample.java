package com.exception;

public class TryCatchExample {
	public static void main(String[] args) {
		System.out.println("1");
		try {
			System.out.println("2");  // If there is an exception in the try block . 
			int a = 100, b = 2;      //  then the catch block will be executed 
			int c = a / b;
			System.out.println("3");
			System.out.println(c);
			System.out.println("4");

		} catch (Exception e) {
			System.out.println("5");   // If the try block exception does not come .
			System.out.println(e);    // then the catch block block will not execute.

		}
		System.out.println("program executed...");
	}

}
