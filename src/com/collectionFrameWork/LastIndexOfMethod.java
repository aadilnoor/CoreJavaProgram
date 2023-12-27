package com.collectionFrameWork;

                      /*lastIndexOf is a Method It is used to print the position from the last */
import java.util.ArrayList;
import java.util.List;

public class LastIndexOfMethod {
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		al.add(12);
		al.add(34);
		al.add(45);
		al.add(78);
		al.add(12);
		al.add(12);
		al.add(34);
		al.add(45);
		al.add(78);
		int a = al.lastIndexOf(12);
		System.out.println(a);
	}

}
