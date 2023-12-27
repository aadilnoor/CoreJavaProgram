package com.programTest;

public class SwapTwoVariable {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		System.err.println(".....Before swapping.....");
		System.out.println("num1 value is : " + num1 + "\nnum2 value is : " + num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.err.println(".....After swapping.....");
		System.out.println("num1 value is : " + num1 + "\nnum2 value is : " + num2);
		
	}
}
