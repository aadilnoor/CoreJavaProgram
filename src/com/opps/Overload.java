package com.opps;

public class Overload {
	void show(int ...a) {
		for (int i : a) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Overload ob = new Overload();
		ob.show(4);
		ob.show(4,5,3);
		ob.show(5,3,2,1);
		
			
			
	}

}
