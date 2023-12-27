package com.stringbuffer;

public class EnsureCapacity {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(); // default capacity is 16
		sb.ensureCapacity(100);               // ensure capacity is 100 
		sb.append("KHAN");
		sb.trimToSize();                     // this method is trim to wastage capacity and provide exact capacity 
		System.out.println(sb.capacity());   // output is 4
		
	}

}
