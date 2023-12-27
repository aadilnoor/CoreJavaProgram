package com.collectionFrameWork;

/* remove is a method, it is used to remove the particular index value
-If we remove the particur index value, index order will not change
 -After that the index value move to forward*/

import java.util.*;

public class RemoveMethod {
	public static void main(String[] args) {
		List<Integer> ex = new ArrayList<>();
		ex.add(10);
		ex.add(20);
		ex.add(30);
		ex.add(40);
		ex.add(50);
		ex.remove(2);
		System.out.println(ex);
		ex.add(2, 30);
		System.out.println(ex);

	}
}
