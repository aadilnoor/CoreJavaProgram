package com.collectionFrameWork;

                             /*clear method it is used to clear the all index value*/
import java.util.ArrayList;
import java.util.List;

public class ClearMethod {
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		al.add(12);
		al.add(34);
		al.add(45);
		al.add(78);
		System.out.println(al);
		al.clear();
		System.out.println(al);

	}

}
