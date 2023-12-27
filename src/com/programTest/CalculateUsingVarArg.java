package com.programTest;

class Calculate {
	int sum(int a, int b) {
		return a + b;
	}

	int sum(int a, int b, int c) {
		return a + b + c;
	}

	int sum(int... num) {
		int add = 0;
		for (int i : num) {
			add += i;
		}
		return add;

	}
}

public class CalculateUsingVarArg {
	public static void main(String[] args) {
		Calculate c = new Calculate();
		int sum1 = c.sum(10, 20);
		int sum2 = c.sum(10, 20, 30, 40);
		int sum3 = c.sum(10, 20, 30);
		int sum4 = c.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println("Simple : " + sum1 + " \nVar arg : " + sum2 + "\nSimple : " + sum3 + " \nVar arg : " + sum4);

	}
}
