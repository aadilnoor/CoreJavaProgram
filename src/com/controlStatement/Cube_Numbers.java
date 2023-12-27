package com.controlStatement;

import java.util.Scanner;

public class Cube_Numbers {
	public static void main(String[] args)
	{
		
		System.out.print("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int j = sc.nextInt();
		for (int i = 1; i <= j; i++) {
			System.out.println("the cube of "+i+ " = " + (i * i * i));
		}

		
	}
}
