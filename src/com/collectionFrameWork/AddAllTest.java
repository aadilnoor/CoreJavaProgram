package com.collectionFrameWork;

import java.util.ArrayList;

public class AddAllTest {
public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<Integer>();
	al.add(10);
	al.add(20);
	al.add(30);
	ArrayList<Integer> al1 = new ArrayList<Integer>(al);
	al1.add(40);
	al1.add(50);
	ArrayList<Integer> al3 = new ArrayList<Integer>(al1);
	
	System.out.println(al3);
}
}
