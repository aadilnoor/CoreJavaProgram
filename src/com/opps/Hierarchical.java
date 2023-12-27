package com.opps;

class Super {
	void input() {
		System.out.println("...Enter your name...");
	}
}

class Sub1 extends Super {
	void show() {
		System.out.println("My name is sameer");
	}
}

class Sub2 extends Super {
	void disp() {
		System.out.println("My name is Aadil");
	}
}

public class Hierarchical {
	public static void main(String[] args) {
		Sub1 ob = new Sub1();
		Sub2 ob2 = new Sub2();
		ob.input();
		ob.show();
		ob2.input();
		ob2.disp();
	}

}
