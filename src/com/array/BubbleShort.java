package com.array;

public class BubbleShort {
	public static void main(String[] args) {
		int[] a = { 36, 19, 29, 12, 5 };
		int temp;
		for (int i = 0; i < a.length; i++) {
			int check = 0;
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					check = 1;
				}
			}
			if (check == 0) {
				break;
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
