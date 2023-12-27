package com.oops;

/*Ques: We can achieve method overloading by changing the return type of method only?
 
Ans:  method overloading is not possible by changing the return type of the method only
		because of ambiguity.
*/
public class Overloading1 {
	void show(int a) 
	{

		System.out.println("hi");
	}

	 void show(int a ,String b) {
		System.out.println("by");
		
	}

	public static void main(String[] args) {
		Overloading1 ob = new Overloading1();
		ob.show(10);
	}

}


