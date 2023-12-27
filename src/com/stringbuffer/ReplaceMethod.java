package com.stringbuffer;

public class ReplaceMethod {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("KHAN");
		sb.replace(0, 4, "AADIL");
		System.out.println(sb);     // Replace from start to end-1
		

	}

}
