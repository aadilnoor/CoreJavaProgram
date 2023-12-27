package com.array;

import java.util.Scanner;

public class ArrayReverse {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Array size : ");
		int size = s.nextInt();
		int a[] = new int[size];

		System.out.println("Enter elements : ");
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		
		System.out.println("\nPrint array elements..");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");

		}
		System.out.println("\nRverse array elements..");
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.println(a[i]);
		}
	}
}
