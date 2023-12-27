package com.collectionFrameWork;

import java.util.Iterator;
import java.util.Stack;

public class IterateStackList {
	public static void main(String[] args) {
		Stack<String> list = new Stack<>();
		list.push("AADIL");
		list.push("SAM");
		list.push("NOOR");
		list.push("SAIF");
		list.push("ZAID");
		
		list.pop();
		System.out.println(list);
System.out.println("--------------------");
		Iterator it = list.iterator();
		while (it.hasNext()) {
			String name = (String) it.next();
			System.out.println(name);

		}
	}
}
