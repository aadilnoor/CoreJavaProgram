package com.oops;

/*Ques: We can overload java main() method ?
		
Ans: yes we can have any number of main methods in a class by method overloading.
*/
public class Overloading2 {
	public static void main(String[] args) {
		System.out.println("1");
		Overloading2 ob = new Overloading2();
		ob.main(10);
	}

	public static void main(int a) {
		System.out.println("2");
	}
}
