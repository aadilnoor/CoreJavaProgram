package com.array;

import java.util.Scanner;

public class TwoDArray 
{
	public static void main(String[] args)
	 {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the rows..");
		int rows=scanner.nextInt();
		System.out.println("Enter the columns..");
		int coloumns=scanner.nextInt();
		int [][]numbers = new int[rows][coloumns];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<coloumns;j++)
			{
				numbers[i][j]=scanner.nextInt();
			}
		}
		System.out.println("Enter x value..");
		int x = scanner.nextInt();
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<coloumns;j++)
			{
				if(numbers[i][j]==x)
				{
					System.out.println(i+" "+j);
				}
			}
	 }
	 }
}
