package com.string;

class Object4
{
	public boolean equals(Object4 obj)
	{
		return(this==obj);
	}
}
class String3 extends Object4
{
	

	public boolean equals(Object sobj)
	{
		return(this.equals(sobj));
	} 
}
public class Equalsmethod1 {
	public static void main(String[] args) {
		
		String s1=new String("Sameer");
		String s2=new String("Sameer");
		String s3="Sameer";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
	}

}
