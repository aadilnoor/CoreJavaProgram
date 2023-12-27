package com.programTest;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num=sc.nextInt();

		int revNum = reverseNumber(num);
		System.out.println(revNum);
      
	}

	public static int reverseNumber(int num) {
		int revNum = 0;
		while (num != 0) {
			int number = num % 10;
			revNum = revNum * 10 + number;
			num/=10;

		}
		return revNum;
	}
}
