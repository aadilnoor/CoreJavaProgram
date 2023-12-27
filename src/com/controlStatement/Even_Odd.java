package com.controlStatement;

import java.util.Scanner;

public class Even_Odd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number....");
		int a = sc.nextInt();
		if (a % 2 == 0) {
			System.out.println("the given number" + a + " is Even....");
		} else {
			System.out.println("the given number" + a + " is odd....");
		}
	}

}
