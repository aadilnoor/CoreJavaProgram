package com.string;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SwapeString {
	public static void main(String[] args) throws IOException {
		
		/*
		 * String a = "Hello"; String b = "World";
		 * 
		 * a = a + b;//helloworld //0123456789 b = a.substring(0, a.length() -
		 * b.length()); a = a.substring(b.length()); System.out.println(a);
		 * System.out.println(b); System.out.println(b.substring(2));
		 */
		
		
		
		  
		    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		    
		      System.out.print("Enter the first number: ");
		      String no = reader.readLine();
		      int num1 = Integer.parseInt(no);

		      System.out.print("Enter the second number: ");
		      String no2 = reader.readLine();
		      int num2 = Integer.parseInt(no2);

		      int sum = num1 + num2;
		      System.out.println("The sum is: " + sum);
		    } 
		  
		
	

}
