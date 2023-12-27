package com.collectionFrameWork;

import java.util.ArrayList;       // size method, it is used to find the size of the ArrayList
import java.util.List;

public class SizeMethod {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("AADIL");
		list.add("FAIZ");
		list.add("AYAZ");
		
		int size=list.size();
		System.out.println(size);
	}

}
