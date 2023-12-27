package com.array;

public class ThreeDArray 
{ 
	public static void main(String[] args)
	{
		int [][][] a={{{10,20},{30,40,50,60},{70,80,90}}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				for(int k=0 ; k < a[i][j].length;k++)
				{
					System.out.println(a[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println(a[0][0][0]);
			System.out.println(a[0][0][1]);
			System.out.println(a[0][1][0]);
			System.out.println(a[0][1][1]);
			System.out.println(a[0][1][2]);
			System.out.println(a[0][1][3]);
			System.out.println(a[0][2][0]);
			System.out.println(a[0][2][1]);
			System.out.println(a[0][2][2]);
		}
	}

}
