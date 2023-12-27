package com.array;

import java.util.Scanner;

class Arrays {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class ArrayObjectType {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Arrays[] s = new Arrays[3];
		for (int i = 0; i < s.length; i++) {
			s[i] = new Arrays();
			s[i].setId(sc.nextInt());
			s[i].setName(sc.next());

		}
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i].getId() + " " + s[i].getName());
		}
	}
}
