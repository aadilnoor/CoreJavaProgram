package com.array;

import java.util.Scanner;

public class ArrayScannerClass {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of Array.....");
		int size = s.nextInt();
		int a[] = new int[size];

		for (int i = 0; i < size; i++) {
			a[i] = s.nextInt();

		}
		System.out.println("printed all elements..");
		for (int i = 0; i < size; i++) {
			System.out.println(a[i]);

		}
	}
}
