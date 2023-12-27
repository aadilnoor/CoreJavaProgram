package com.collectionFrameWork;

import java.util.ArrayList; /*  get() method it is used to print the particular value */

public class GetMethod {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		int g = a.get(3);
		System.out.println(g);

		System.err.println("....By using for loop....");

		for (int i = 0; i < a.size(); i++)
			System.out.println(a.get(i));
		System.err.println("....By using enhance loop....");

		for (Integer i : a) {
			System.out.println(i);
		}
	}
}
