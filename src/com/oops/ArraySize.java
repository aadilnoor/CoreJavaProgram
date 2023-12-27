package com.oops;

import java.util.Scanner;

public class ArraySize {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Size of an Array::");
		int[] arr = new int[scanner.nextInt()];
		for (int i = 0; i < arr.length; i++) {

			System.out.println("Enter Value for Index " + i);
			arr[i] = scanner.nextInt();
		}
		for (int i : arr) {
			System.out.println(i);
		}
		scanner.close();
	}

}
