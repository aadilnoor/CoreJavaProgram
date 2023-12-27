package com.collectionFrameWork;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		LinkedList ls = new LinkedList(); /* Collection c */
		ls.add(100);
		ls.add(200);
		ls.add(300);
		ls.add(400);
		ls.add(500);

		System.out.println(ls);
		ls.addFirst("Aadil");
		ls.addLast("sam");
		System.out.println(ls);

		System.out.println(ls.getFirst());
		System.out.println(ls.getLast());

		ls.removeFirst();
		ls.removeLast();
		System.out.println(ls);
	}

}
