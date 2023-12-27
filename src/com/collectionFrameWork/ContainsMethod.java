package com.collectionFrameWork;

							/* contains() method it is used to check the particular value or object */
import java.util.*;

public class ContainsMethod {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();

		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		System.out.println(l.contains(50));
		System.out.println(l.contains(40));

	}
}
