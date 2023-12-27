package com.programTest;
public class SuperThisTest {
	public SuperThisTest a() {
		System.out.println("method a");
		return this;
	} 
	public SuperThisTest b() {
		System.out.println("method b");
		return this;
		
	} 
	public  void c() {
		System.out.println("method c");
		
	} 
	
	public static void main(String[] args) {
		  new SuperThisTest().a().b().c();
		 
	}
	
}
