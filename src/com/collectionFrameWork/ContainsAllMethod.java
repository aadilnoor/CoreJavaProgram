package com.collectionFrameWork;

import java.util.ArrayList;
import java.util.List;

public class ContainsAllMethod {
	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("sam");
		l.add("faiz");
		l.add("aadil");
		l.add("khan");

		List<String> l1 = new ArrayList<>();
		l1.add("sam");
		l1.add("faiz");
		l1.add("aadil");

		System.out.println(l1.containsAll(l));
	}

}
