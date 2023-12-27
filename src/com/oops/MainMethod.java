package com.oops;

public class MainMethod {
	public static void main(String[] args) {
		System.out.println("hi");
		MainMethod ob = new MainMethod();
		ob.main(2, 3, 4);
		ob.main(10, 20);
		
		
	}
public static String main(int a,int b) {
	
	System.out.println(a+b);
	return "a"+"b";
}
public static int main(int a,int b,int c) {
	System.out.println(a*b*c);
	return a+b+c;
	
}
}
