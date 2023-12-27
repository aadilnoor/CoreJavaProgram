package com.array;

public class New {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int b[]= {3,4,5,6,7,8};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i]==b[j]) {
					System.out.println(a[i]);
					
				}
			}
			
		}
		System.out.println("------------");
		int c[]= {2,3,4,4,5};
		for (int i = 0; i < c.length; i++) {
			for (int j = i+1; j <c.length; j++) {
				if (c[i]==c[j]) {
					System.out.println(c[i]);
					
				}
				
			}
		}
		
	}

}
