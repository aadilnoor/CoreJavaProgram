package com.oops;

class Test {
	void show() {
		int a = 10, b = 20, c;
		c = a + b;
		System.out.println(c);
	}

	void show(int x, int y) {
		int c;
		c = x + y;
		System.out.println(c);

	}

	void show(int x, float y) {

		float c = x + y;
		System.out.println(c);

	}

	public static void main(String[] args) {
		Test t = new Test();
		t.show(50,50);
		t.show(20, 30.00F);
	}
}