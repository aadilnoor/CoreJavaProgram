package com.collectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveElementArraylistAtRuntime {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("AADIL");
		list.add("SOYAB");
		list.add("ABUZAR");
		list.add("ANSARUL");
		list.add("SUFIYAN");

		Iterator<String> itr = list.iterator();
		System.err.println("Before removing element.....");
		while (itr.hasNext()) {

			System.out.println(itr.next());

		}
		System.err.println("After removing element.....");

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == "SOYAB") {
				list.remove(i);
				System.out.println(list);
			}

		}

	}
}
