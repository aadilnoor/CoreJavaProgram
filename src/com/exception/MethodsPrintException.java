package com.exception;

public class MethodsPrintException {
	public static void main(String[] args) {
		try {
			int a = 100, b=0;
			int c = a/b;
			System.out.println(c);
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e); System.out.println(e.toString());
			System.out.println(e.getMessage());
			
		}
	}
}
