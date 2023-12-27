package com.array;

import java.util.Arrays;

public class AnonymousArray {

	static void sum(int[] number) {
		int total = 0;
		for (int i : number) {

			total = total + i;
		}
		System.out.println("sum of numbers:" + total);

	}

	public static void main(String[] args) {
		AnonymousArray.sum(new int[] { 10, 20, 30 });
	}
}
