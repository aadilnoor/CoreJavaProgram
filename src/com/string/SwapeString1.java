package com.string;

public class SwapeString1 {
	public static void main(String[] args) {
		String a = "Hello"; String b = "World";
		
		  a = a + b;//helloworld //0123456789
		  b = a.substring(0, a.length() -b.length());
		  a = a.substring(b.length());
		  System.out.println(a);
		  System.out.println(b); 
		 // System.out.println(b.substring(2));
	}
	
	 

}
