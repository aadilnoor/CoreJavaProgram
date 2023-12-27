package com.oops;

public class ByMethod 
{
	String color;
	int age;
    void Byobj(String c,int a)  
    {
    	color=c;   // Instance variable initialize by local variable
    	age=a;
    }
    void display()
    {
    	System.out.println(color+" \n "+age);
    }
    public static void main(String[] args) {
		
    	ByMethod crow=new ByMethod();
    	crow.Byobj("black",2);
    	crow.display();
	}
}
