package com.string;
import java.lang.*;

public class StringMethod {
public static void main(String[] args) {
	String name="   hjhvdkjhk";
	String email="aadil@gmail.com";
	String pass="aadil123";
	String str1= "AADIL";
	String str = "aadil";
	String str3 = "aadil";                             
	String str4 = new String("aadil");
	String str5 = new String("AADIL");
	
	System.out.println(name.isEmpty());
	System.out.println(name.trim().length());
	System.out.println(email.charAt(2));
	System.out.println(pass.indexOf("d"));
	System.out.println(str.concat(str1));
	System.out.println(str1.toLowerCase());
	System.out.println(str.toUpperCase());
	System.out.println(str.equals(str3));
	System.out.println(str==str3);
	System.out.println(str1.equals(str5));
	System.out.println(str1.equalsIgnoreCase(str3));
	System.out.println("--------------------------------------------");
	String s2="a";
	String s1="D";
	System.out.println(s1.compareTo(s2));
    
}
}
