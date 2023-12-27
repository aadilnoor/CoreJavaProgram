package com.programTest;

interface Calculator {
	int add(int a, int b);

	int sub(int a, int b);

	int multiply(int a, int b);

	int div(int a, int b);
}

class Calculator1 implements Calculator {

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int sub(int a, int b) {
		return a - b;
	}

	@Override
	public int multiply(int a, int b) {
		return a * b;
	}

	@Override
	public int div(int a, int b) {

		return a / b;
	}
	
}
public class AdditionByInterface {
	public static void main(String[] args) {
		Calculator1 c = new Calculator1();
		int sum = c.add(10, 20);
		int sub = c.sub(100, 50);
		int multi = c.multiply(10, 10);
		int div = c.div(10, 2);

		System.out
				.println("Sum : " + sum + "\nMultiply : " + sub + "\nDivision : " + multi + "\nSubstraction : " + div);

	}
}
