package com.constructor;

class Thiskeyword {
	Thiskeyword() {
		this(123);
		System.out.println("default constructor");
	}

	public Thiskeyword(int i) {
		this("Sameer");
		System.out.println("premetrized constructor");
		System.out.println("called to Default constructor");
	}

	public Thiskeyword(String a) {
		System.out.println("premetrized constructor2");
	}
}

public class ConsChainingUsingThisKeyword {
	public static void main(String[] args) {
		Thiskeyword ob = new Thiskeyword();
	}
}
