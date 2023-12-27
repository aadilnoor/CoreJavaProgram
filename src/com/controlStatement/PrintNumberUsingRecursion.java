package com.controlStatement;

public class PrintNumberUsingRecursion {
	public static void main(String[] args) {
		
	
		PrintNumberUsingRecursion(1);
	}
	public static void PrintNumberUsingRecursion(int number) {
		
		if (number > 10) {
			return;
		}

		System.out.print(number+"	");
		PrintNumberUsingRecursion(number + 1);
	}

}
