package com.collectionFrameWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.CopyOnWriteArraySet;

public class ArrayListConstructors {
	public static void main(String[] args) {
		int n = 5;
		ArrayList<Integer> al = new ArrayList<>(n);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(80);
		al.add(90);
		al.add(100);
		al.add(110);
		System.out.println(al);

		ArrayList<Integer> al2 = new ArrayList<>(al); /* Collection c : Copy all Object to other object */
		System.out.println(al2);
	}
}
