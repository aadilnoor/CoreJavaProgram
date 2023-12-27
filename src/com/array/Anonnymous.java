package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class Anonnymous {
	private static Scanner sc = new Scanner(System.in);

	public static void anonnymousArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println("...Enter the number...");
			a[i] = sc.nextInt();

		}
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		anonnymousArray(new int[10]);
		System.out.println(Arrays.toString(new int[] { 1, 3, 5, 5, 5 }));
	}

}
