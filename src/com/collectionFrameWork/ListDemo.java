package com.collectionFrameWork;

import java.util.*;

public class ListDemo {
	public static void main(String[] args) {
		
		List<String> l = new ArrayList<>();
		l.add("AADIL");
		l.add("SAMEER");
		l.add("FAIZ");
		l.add("SAM");
		System.out.println(l);
		System.err.println("--------------------------");
		System.out.println("...Forward Direction...");

		ListIterator<String> itr1 = l.listIterator();
		while (itr1.hasNext()) {

			System.out.println(itr1.next());

		}
		System.err.println("-------------------------");
		System.out.println("...Backward Direction...");
		while (itr1.hasPrevious()) {

			System.out.println(itr1.previous());

		}
	}
}
