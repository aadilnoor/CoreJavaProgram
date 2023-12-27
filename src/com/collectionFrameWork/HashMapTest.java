package com.collectionFrameWork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(101, "AADIL");
		hm.put(102, 786);
		hm.put(103, "KHAN");
		hm.put(104, "SAIF");
		hm.put(105, 'A');
		hm.put(106, 10.10);
		System.out.println(hm);

		/*
		 * for (Map.Entry m: hm.entrySet()) { // using generic
		 * System.out.println("Key :"+m.getKey() + " --> " +"Value :"+ m.getValue()); }
		 */

		Set set = hm.entrySet();
		System.out.println(set);
		Iterator ite = set.iterator();
		while (ite.hasNext()) {
			// System.out.println(ite.next());
			Map.Entry entry = (Map.Entry) ite.next();

		}

	}
}
