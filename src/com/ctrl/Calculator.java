package com.ctrl;

import java.util.Scanner;

class Calculator {
	public static void main(String[] args) {
		int sum;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number..");
		int no1 = s.nextInt();
		System.out.println("Enter the second number..");
		int no2 = s.nextInt();
		System.out.println("Enter the symbol..");
		String sym = s.next();

		switch (sym) {     
		case "+":
			sum = no1 + no2;
			System.out.println(sum);
			break;
		case "-":
			sum = no1 - no2;
			System.out.println(sum);
			break;
		case "*":
			sum = no1 * no2;
			System.out.println(sum);
			break;
		case "/":
			sum = no1 / no2;
			System.out.println(sum);
			break;
		case "%":
			sum = no1 % no2;
			System.out.println(sum);
			break;
		default:
			System.out.println("invalid");
		}
	}

}
