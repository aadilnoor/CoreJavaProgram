package com.stringbuffer;

public class AppendMethod {
public static void main(String[] args) {
	StringBuffer sb = new StringBuffer("KHAN ");
	sb.append("AADIL ");   //sb.append(CharSequence)
	sb.append('M');        //sb.append(char)
	System.out.println(sb);
	}
}
