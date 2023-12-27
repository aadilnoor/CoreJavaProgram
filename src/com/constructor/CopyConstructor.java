package com.constructor;

class Copy {
	int a;
	String b;

	Copy() {
		a = 101;
		b = "Aadil";
		System.out.println(a + " " + b);
	}
	Copy(Copy ref) {
		a = ref.a;
		b = ref.b;
		System.out.println(a + " " + b);
	}
}
public class CopyConstructor {
	public static void main(String[] args) {
		Copy c = new Copy();
		Copy c1 = new Copy(c);
	}
}
