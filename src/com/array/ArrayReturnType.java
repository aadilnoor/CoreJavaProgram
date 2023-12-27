package com.array;

import java.util.Scanner;

public class ArrayReturnType {
	private static Scanner sc = new Scanner(System.in);

	public static int[] getArray(int a) {
		int[] b = new int[a];
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();

		}
		return b;
	}

	public static void main(String[] args) {
		int[] a = getArray(10);
		for (int b : a) {
			System.out.println(b);
		}
	}

}
