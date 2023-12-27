package com.collectionFrameWork;

/* set method, it is used to replace the value but index and value order will not change */

import java.util.*;

public class SetMethod {
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.set(2, 100);
		System.out.println(a);

	}
}
