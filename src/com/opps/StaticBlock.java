package com.opps;

class Block {
	int a, b;

	static void show() {
		System.out.println("Static block..."); // 1
	}

	void run() {
		System.out.println("simple method..."); // 4
	}

	Block() {
		System.out.println("Constructor..."); // 3
		a = 10;
		b = 20;
		System.out.println(a + " " + b);
	}

	{
		System.out.println("instance block..."); // 2
		a = 40;
		b = 50;
		System.out.println(a + " " + b);
	}
}

public class StaticBlock {
	public static void main(String[] args) {
		Block.show();
		Block b = new Block();
		b.run();
	}

}
