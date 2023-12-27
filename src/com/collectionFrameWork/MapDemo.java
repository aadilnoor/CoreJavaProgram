package com.collectionFrameWork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		Map m = new HashMap();
		m.put(1, "Aadil");
		m.put(2, "Faiz");
		m.put(3, "Sam");
		m.put(4, "Zaid");
		//m.clear();
		System.out.println(m.containsKey(3)); // true 
		System.out.println(m.containsValue("kaif")); // false
		System.out.println(m.get(3));  // sam 
		System.out.println(m.equals(m));  // true
		System.out.println(m.hashCode());  // 68060662
		System.out.println(m.isEmpty()); // false
		System.out.println(m.keySet()); // [1 2 3 4] return key set
		m.replace(3, "SAMEER");       // replace Sam 
		m.put(4, "Saif");              // add object Saif
		System.out.println(m.size());  // return size
		m.remove(4, "Zaid"); // remove Zaid 
		System.out.println(m);

	}
}
