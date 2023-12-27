package com.controlStatement;

import java.util.Scanner;

public class Atm {
	public static void main(String[] args) {
		final int amount = 500;
		final int pincode = 2002;
		Scanner sc = new Scanner(System.in);

		System.out.println("....WELCOME....");

		System.out.println("Select Amount...");
		System.out.println(" 500 " + "\n 1000 " + "\n 2000 " + "\n 3000 " + "\n 4000 " + "\n 5000 ");

		int select_amount = sc.nextInt();
		switch (select_amount) {
		case 500:
			System.out.println("Your Withdrawal is successful...");
			System.out.println("Thank You..");
			break;
		case 1000:
			System.out.println("Your Withdrawal is successful...");
			System.out.println("Thank You..");
			break;
		case 2000:
			System.out.println("Your Withdrawal is successful...");
			System.out.println("Thank You..");
			break;
		case 3000:
			System.out.println("Your Withdrawal is successful...");
			System.out.println("Thank You..");
			break;
		case 4000:
			System.out.println("Your Withdrawal is successful...");
			System.out.println("Thank You..");
			break;
		case 5000:
			System.out.println("Your Withdrawal is successful...");
			System.out.println("Thank You..");
			break;
		default:
			System.out.println("Other Amount..");

			int select = sc.nextInt();

			break;
		}
		System.out.println("Enter Pincode..");
		int pincode1 = sc.nextInt();
		if (pincode1 == 2002) {

			System.out.println("Your Withdrawal is successful...");
			System.out.println("Thank You..");

		}

		else {
			System.out.println("Wrong Pin..");
		}
	}

}
