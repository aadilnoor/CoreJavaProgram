package com.opps;

interface I {
	public static final int id = 101;

	void show();
}

interface Name {
	void show1();
}

class Main implements I, Name {
	public void show() {

		System.out.println(id);
	}

	public void show1() {
		System.out.println(id);
	}
}

public class MultipleInheritanceTest {
	public static void main(String[] args) {
		Main ob = new Main();
		ob.show();
		ob.show1();
	}

}
