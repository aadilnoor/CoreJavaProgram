package com.programTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

class ArrayListConcurrentModificationException {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();	
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		CopyOnWriteArrayList<Integer> list2 = new CopyOnWriteArrayList<>(list);
		Iterator<Integer> it = list2.iterator();
		while (it.hasNext()) {
			
			if(it.equals(3)) {
				it.remove();
			}
			
			System.out.println(it.next());
			
		}
		
		
	}
	
}
