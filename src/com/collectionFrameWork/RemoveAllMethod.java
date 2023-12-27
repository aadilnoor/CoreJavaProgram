package com.collectionFrameWork;

import java.util.List;
import java.util.ArrayList;
                            // removeAll() method it is used to compare the both list and remove all the list1 values in list 2

public class RemoveAllMethod {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>();
		List<Integer> l2 = new ArrayList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		
		l2.addAll(l1);
		
		l1.add(100);
		l1.add(200);
		
		l2.add(300);
		l2.add(400);

		System.out.println(l1);
		System.out.println(l2);
		System.out.println("After printing...");
		l2.removeAll(l1);
		System.out.println(l1);
		System.out.println(l2);

	}
}
