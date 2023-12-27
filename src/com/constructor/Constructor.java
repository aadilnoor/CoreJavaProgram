package com.constructor;

class Test {
	int a;
	String b;
	boolean c;

	public Test() {
		a = 100;
		b = "Aadil";
		c = true;
	}

	void show() {
		System.out.println(a + "\n" + b + "\n" + c);
	}
}

class Constructor {
	public static void main(String[] args) {
		Test t = new Test();
		t.show();
	}

}
