package com.programTest;

import java.util.Scanner;

class BankAccount {
	private String AcNumber;
	private double balance;

	public BankAccount(String AcNumber, double balance) {
		this.AcNumber = AcNumber;
		this.balance = balance;
	}

	public void setAcNumber(String AcNumber) {
		this.AcNumber = AcNumber;
	}

	public String getAcnumber() {
		return AcNumber;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public double withdraw(double amount) throws InsufficientBalanceException {
		if (amount > balance) {
			throw new InsufficientBalanceException("InsufficientBalance");
		}
		return balance -= amount;
	}
}

class InsufficientBalanceException extends RuntimeException {
	private String massage;

	public InsufficientBalanceException(String massage) {
		this.massage = massage;
	}

	public String getMassage(String massage) {
		return massage;
	}

	public void printStackTrace() {
		System.out.println("InsufficientBalance" + massage);
		super.printStackTrace();
	}

}

public class EncapsulationWithException {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		BankAccount b = new BankAccount("12345678982", 1000.0);
		try {
			System.out.println("Enter withdraw amount...");
			b.withdraw(sc.nextInt());
			System.out.println(b.getAcnumber() + " " + b.getBalance());
		} catch (InsufficientBalanceException e) {
			e.printStackTrace();
		}
	}
}
