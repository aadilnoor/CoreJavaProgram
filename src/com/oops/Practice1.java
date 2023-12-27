package com.oops;

interface P1 {
	public abstract void m1();

	public abstract void m2();

	public abstract void m3();
}

abstract class P2 implements P1 {

	public void m1() {
		System.out.println("1");

	}

	public void m2() {
		System.out.println("2");

	}
}

class P3 extends P2 {
	public void m3() {
		System.out.println("3");
	}
}

public class Practice1 {
	public static void main(String[] args) {
		P3 i = new P3();
		i.m1();
		i.m2();
	}

}