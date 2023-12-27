package com.string;

import java.util.Arrays;

public class StringConstructor {
	public static void main(String[] args) {
		String obj1 = new String("101");
		String obj3 = new String(obj1);
		System.out.println(obj3);
		

		StringBuilder s2 = new StringBuilder("sameer");
		String obString = new String(s2);
		System.out.println(obString);
		

		byte[] b = { 101, 102 };
		String ob = new String(b);
		System.out.println(ob);

		
		char[] c = { 's', 'a', 'm', 'e', 'e', 'r' };
		String o = new String(c);
		System.out.println(o);
		byte v[] = o.getBytes();
		System.out.println(Arrays.toString(v));
		
		
		char[] c1= {'a','a','d','i','l'};
		String o1=new String(c1);
		System.out.println(o1);
		byte v1[] = o1.getBytes();
		System.out.println(Arrays.toString(v1));
		

		StringBuffer sc = new StringBuffer("Aadil");
		String obj = new String(sc);
		System.out.println(obj);

	}

}
