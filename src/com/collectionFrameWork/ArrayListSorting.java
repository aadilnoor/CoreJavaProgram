package com.collectionFrameWork;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {
	public static void main(String[] args) {
		ArrayList<Integer> aList = new ArrayList<Integer>();
		aList.add(10);
		aList.add(40);
		aList.add(20);
		aList.add(5);
		System.out.println("Before sorting list.. ");
		System.out.println(aList);

		Collections.sort(aList);
		System.out.println("After sorting list..");
		System.out.println(aList);
	}
}
