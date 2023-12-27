package com.ctrl;

public class Palindrome {
	public static void main(String[] args) {
		int no=879;
		int rem,rev=0;
		int temp=no;
		while(temp !=0)          
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(no==rev)
		{
			System.out.println(no+ "is palindrome number");
		}
		else
		{
			System.out.println(no+"is not palindrome number");
		}
	}

}
