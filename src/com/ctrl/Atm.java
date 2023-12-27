package com.ctrl;

import java.util.Scanner;

public class Atm {
	public static void main(String[] args) {

		final int Amount = 2000;
		final int Pincode = 2002;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount..");
		int Amount1 = sc.nextInt();
		System.out.println("Enter Pincode..");
		int Pincode1 = sc.nextInt();
		if (Amount1 >= 2000) {
			if (Pincode1 == 2002) {
				System.out.println("Your Withdrawal is successful...");
				System.out.println("Thank You..");
			} else
				System.out.println("Wrong Pin..");

		} else {
			System.out.println("Is low Amount..");
		}
	}
}