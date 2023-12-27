package com.controlStatement;
import java.util.*;
public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number...");
		int no = sc.nextInt(), rem, sum = 0;
		int temp = no;
		while (no > 0) {
			rem = no % 10;
			no = no / 10;
			sum = sum * 10 + rem;
		}
		if (temp == sum) {
			System.out.println(sum+" is a palindrome number..");

		} else {
			System.out.println(sum+" is not a palindrome number..");
		}

	}

}
