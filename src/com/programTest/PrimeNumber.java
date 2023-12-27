package com.programTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumber {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter your number : ");
		int num1=Integer.parseInt(br.readLine());
		int temp = 0;
		for (int num = 1; num <= num1; num++) {
			for (int j = 2; j <= num - 1; j++) {
				if (num % j == 0) {
					temp = temp + 1;
				}
			}
			if (temp == 0) {
				System.out.println(num + " : is prime number");
			} else {
				temp = 0;
			}
		}
	}
}
