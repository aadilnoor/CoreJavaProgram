package com.array;

import java.util.HashSet;

public class FindDuplicateElementWithHashSetClass {
	public static void main(String[] args) {
		int arr1[] = { 7, 3, 6, 8, 3, 5 };
		int arr2[] = { 1, 4, 6, 7, 5 };

		HashSet<Integer> hs = new HashSet<>();

		for (int i = 0; i < arr1.length; i++) {

			for (int j = 0; j < arr2.length; j++) {

				if (arr1[i] == arr2[j]) {
					hs.add(arr1[i]);
					break;
				}
			}
		}
		for (int no : hs) {
			System.out.println("Duplicate elements : " + no);
		}
	}
}
