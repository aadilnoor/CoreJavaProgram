package com.opps;

public class MethodChaining {
	public static void main(String[] args) {
		MethodChaining ob = new MethodChaining();
		ob.calculator(10, 10);
	}

	private void calculator(int first, int second) {
		sum(first, second);
		subtract(first, second);
		multiply(first, second);
	}

	private void sum(int first, int second) {
		System.out.println("Sum : " + (first + second));
	}

	private void subtract(int first, int second) {
		System.out.println("Substrct : " + (first - second));
	}

	private void multiply(int first, int second) {
		System.out.println("Multiply : " + (first * second));
	}

}
