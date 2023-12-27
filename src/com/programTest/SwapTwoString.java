package com.programTest;

public class SwapTwoString {
	public static void main(String[] args) {
		String str1 = "AADIL";
		String str2 = "ASAD";
		System.err.println(".....Before Swaping.....");
		System.out.println("str1 : " + str1 + "\nstr2 : " + str2);
		str1 = str1 + str2;
		str2 = str1.replaceAll(str2, "");
		str1 = str1.replaceAll(str2, "");
		System.err.println(".....After Swaping.....");
		System.out.println("str1 : " + str1 + "\nstr2 : " + str2);

	}
}
