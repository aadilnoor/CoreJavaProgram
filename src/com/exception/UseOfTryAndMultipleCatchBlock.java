package com.exception;

public class UseOfTryAndMultipleCatchBlock {
	public static void main(String args[]) throws ArithmeticException, NumberFormatException {
		try {
			System.out.println("This code is inside in the try block");
			int a = 2;
			int b = 0;
			int c = a / b;
			System.out.println("result of calculation = " + c);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception are handled");
		}
		
		// rest code of the program
		System.out.println("This code is outside from the try block");
	}
	
}