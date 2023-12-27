package com.array;

public class Array2D {
	public static void main(String[] args) {
		int[][] a = { { 10, 20, 30, 40, }, { 50, 60, }, { 70, 80, 90 } };

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println(" ");
		}
		System.out.println(a.length);
		System.out.println(a[0].length);
		//System.out.println(a[0][0].length); error
		System.out.println(a[0][0]);
	    System.out.println(a[0][1]);
		System.out.println(a[0][2]);
		System.out.println(a[0][3]);
		System.out.println(a[1][0]);
		System.out.println(a[1][1]);
		System.out.println(a[2][0]);
		System.out.println(a[2][1]);
		System.out.println(a[2][2]);


	}

}
