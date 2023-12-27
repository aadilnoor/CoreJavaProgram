package com.array;

public class Array {

	public static void main(String[] args) {
		int a[] = { 11, 2, 4, 5, 13 , 18};
		System.out.println("given Array");

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length - 1 - i; j++) {

				if (a[j] > a[j + 1]) {
					int add = a[j];
					a[j] = a[j + 1];
					a[j + 1] = add;
				}
			}
			System.out.println(a[i]);
		}

	}

}
