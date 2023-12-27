package com.collectionFrameWork;

import java.util.Stack;

public class StackDemo {
public static void main(String[] args) {
	Stack s = new Stack<>();
	s.push("AADIL");
	s.push("SAM");
	s.push(100);
	s.push(10.0);
	
	System.out.println(s);      
	s.pop();                    // remove 10.0
	System.out.println(s);        
	
	System.out.println(s.peek()); // 100
	
	System.out.println(s.empty());
	System.out.println(s.search("SAM"));  //return 2 counting start 1
}
}
