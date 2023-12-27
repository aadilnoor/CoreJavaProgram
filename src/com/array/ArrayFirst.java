package com.array;

import java.util.Scanner;
public class ArrayFirst
{
	public static void main(String[] args) {
		int size,i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		size=s.nextInt();
		int a[]=new int[size];
		for ( i= 0; i < size; i++) 
		{
			a[i]=s.nextInt();	
		}
		System.out.println("Printed Array elements");
		for ( i = 0; i < size; i++)
		{
			System.out.println(a[i]+" ");
		}
	}
}
