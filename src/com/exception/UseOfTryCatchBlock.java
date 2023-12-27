package com.exception;

public class UseOfTryCatchBlock {

	public static void main(String args[]) {
		try {
			System.out.println("This code is inside in the try block");
			int a = 2;
			int b = 0;
			int c = a / b;
			System.out.println("result of calculation = " + c);
		} finally {
			// rest code of the program
			System.out.println("This code is outside from the try block");
		}

	}

}
