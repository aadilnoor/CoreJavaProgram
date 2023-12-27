package com.collectionFrameWork;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("AADIL");
		set.add("FAIZ");
		set.add("ZAID");
		set.add("SAMEER");
		set.add("FAIZ");
		set.add(null);
		set.add(null);
		System.out.println(set);
		System.err.println("----------------------");
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

	}
}
