package com.string;
public class StringMethods {
	public static void main(String[] args) {
		String name="  aa  bb  ";
		String email="abc@gmail.com";
		System.out.println(name);
			System.out.println(name.isEmpty());
			String str=name.trim();
			System.out.println(email.trim().length());
			
			System.out.println(str);
		if(email.isEmpty()==false)
		{
			System.out.println("email is Empty");
		}
		
		else {
			System.err.println("email is not Empty");
		}
	}
	

}
