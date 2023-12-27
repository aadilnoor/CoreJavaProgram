package com.ctrl;

public class InstanceVariable {
	int a = 10;
	String name = "abrar";

	public static void main(String[] args) {
		InstanceVariable s = new InstanceVariable();
		System.out.println(s.a+"\t"+s.name);

	}
}
