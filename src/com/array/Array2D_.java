package com.array;

import java.util.Arrays;

public class Array2D_ {
	public static void main(String[] args) {
		int[][] a= {{1,2,3},{2,3},{3,5,7}};
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				count++;
			}
		}
		int[]a1=new int[count];
		count=0;
		for (int i = 0; i <a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a1[count] = a[i][j];
				count++;
			}
		}
		
		System.out.println(Arrays.toString(a1));
	}

}
