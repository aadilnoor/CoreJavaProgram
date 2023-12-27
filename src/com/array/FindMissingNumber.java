package com.array;

public class FindMissingNumber {
	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 6 };
		int exp_no = a.length + 1;
		int total_sum = exp_no * (exp_no + 1) / 2;
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("Missing number is : " + (total_sum - sum));

	}
}
