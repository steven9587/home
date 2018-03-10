package com.steven;

public class Niner {
	/*
	 * 2 x 1 =  2 
	   2 x 2 =  4 
	   2 x 3 =  6 
	   2 x 4 =  8 
	   2 x 5 = 10 
	   2 x 6 = 12 
	   2 x 7 = 14 
	   2 x 8 = 16
	   2 x 9 = 18
	 */

	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			for (int n = 1; n <= 9; n++) {
				if (i * n / 10 < 1) {
					System.out.println(i+" x " + n + " =  " + i * n);
				} else {
					System.out.println(i+" x " + n + " = " + i * n);
				}
			}
			System.out.println();
		}
	}
}
