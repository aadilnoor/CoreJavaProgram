package com.collectionFrameWork;

import java.util.ArrayList;
import java.util.List;

public class AddAllMethod {
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		List<Integer> al1 = new ArrayList<>();
		al1.add(45);
		al1.add(78);
		al1.add(12);
		al1.add(12);
		al1.add(34);
		System.out.println(al);
		System.out.println(al1);
		al.addAll(al1);
		System.out.println(al);
	}

}
