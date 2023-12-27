package com.programTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class User {
	private static final String fname = "Aadil";
	private static final String lname = "Noor";
 
	public static void main(String[] args) throws Exception {
		User us = new User();
		us.show();
	}

	public void show() throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your fname1 : ");
		String fname1 = br.readLine();
		System.out.println("Enter your lname1 : ");
		String lname1 = br.readLine();

		if (fname.equals(fname1) && lname.equals(lname1)) {
			System.out.println("...User login successfully...");
		} else
			System.out.println("Name Mismatch : " + fname1.concat(lname1));

	}
}
