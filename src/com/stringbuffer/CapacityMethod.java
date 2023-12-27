package com.stringbuffer;

public class CapacityMethod {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity()); // Default capacity is 16
		sb.append("AADIL");
		System.out.println(sb.capacity()); // 16
		sb.append("KHAN AADIL ");
	    sb.append("K");
	    System.out.println(sb.capacity());  // old capacity * 2 + 2 = 34 & old capacity + 1 *2

	    
	}
}
