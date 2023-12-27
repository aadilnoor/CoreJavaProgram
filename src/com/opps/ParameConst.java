package com.opps;

class Demo {
	int x;
	int y;

	Demo(int a, int b) {
		x = a;
		y = b;
	}

	Demo(int a, String b) {
		System.out.println(a + " " + b);
	}

	void show() {
		System.out.println(x + " " + y);
	}
}

public class ParameConst {
	public static void main(String[] args) {
		Demo d = new Demo(10, 20);
		d.show();
		Demo d1 = new Demo(101, "Aadil");
	}
}
