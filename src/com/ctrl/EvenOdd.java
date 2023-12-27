package com.ctrl;

import java.util.Scanner;

public class EvenOdd {
	void show(int num) {
		if (num % 2 == 0) {
			System.out.println(num + " even number ");
		} else {
			System.out.println(num + " odd number ");
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number..");
		int num = s.nextInt();

		EvenOdd ob = new EvenOdd();
		ob.show(num);
	}
}
