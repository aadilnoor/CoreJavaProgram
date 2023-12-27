package com.collectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class CollectionDemo {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add("khan");
		al.add('a');
		ListIterator i = al.listIterator();
		{
			while (i.hasNext()) {
				System.out.println(i.next());
				System.out.println("-------------");
			}
			while (i.hasPrevious()) {
				System.out.println(i.previous());

			}
		}
		;

		System.out.println(al);
		System.out.println(al.contains(100)); // true
		System.out.println(al.isEmpty()); // false
		System.out.println(al.add("aadil")); // true System.out.println(al);

		ArrayList al2 = new ArrayList();
		al2.add("abc");
		al2.add("aaa");
		al2.add("abc");
		System.out.println(al2);

		al.addAll(al2);
		System.out.println(al);
		al2.remove(1);
		System.out.println(al2);
		System.out.println(al2.containsAll(al));

	}

}
