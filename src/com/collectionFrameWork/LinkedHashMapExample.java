package com.collectionFrameWork;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

		linkedHashMap.put(1, "Apple");
		linkedHashMap.put(2, "Banana");
		linkedHashMap.put(3, "Orange");
		linkedHashMap.put(4, "Grapes");
		linkedHashMap.put(5, "Mango");
		System.out.println(linkedHashMap);

		for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key + " --> " + val);
		}
		System.out.println("-------------------------------------");
		int keyToFind = 6;
		if (linkedHashMap.containsKey(keyToFind)) {
			System.out.println(keyToFind + " " + linkedHashMap.get(keyToFind));
		} else {
			System.out.println(keyToFind + " key not found...");
		}
	}

}
