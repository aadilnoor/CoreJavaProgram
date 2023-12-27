package com.collectionFrameWork;

                         /*indexof() is a method, it is used to print the position of the list*/
import java.util.ArrayList; 
import java.util.List;

public class IndexOfMethod {
	public static void main(String[] args) {
		List al = new ArrayList();
		al.add("Sameer");
		al.add(2,30);
		al.add("3,Noor");
		al.add("Khan");
		/*
		 * int a=al.indexOf("Khan"); System.out.println(a);
		 */
		System.out.println(al);
		
	}

}
