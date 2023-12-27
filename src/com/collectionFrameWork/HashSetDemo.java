package com.collectionFrameWork;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet hs = new HashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);

		System.out.println(hs);

		Iterator t = hs.iterator();
		while (t.hasNext()) {
			System.out.println(t.next());
		}

	}
}
