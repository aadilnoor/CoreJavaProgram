package com.collectionFrameWork;

import java.util.ArrayList;
import java.util.List;

public class RetainAll {
public static void main(String[] args) {
	List<Integer>ls=new ArrayList<>();
	List<Integer>ls2=new ArrayList<>();
	ls.add(10);
	ls.add(20);
	ls.add(30);
	System.out.println(ls);
	System.out.println(ls2);
	ls.retainAll(ls2);
	System.out.println(ls);
	System.out.println(ls2);
	
	
}
}
