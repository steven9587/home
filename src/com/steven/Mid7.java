package com.steven;

import java.util.Random;

public class Mid7 {

	public static void main(String[] args) {
		for (int b = 1; b > 0; b++) {
				Random r = new Random();
				int n1 = r.nextInt(6) + 1;
				int n2 = r.nextInt(6) + 1;
				int n3 = r.nextInt(6) + 1;
				System.out.print(n1);
				System.out.print(n2);
				System.out.print(n3);
			if (n1 == n2||n1==n3||n2==n3) {
				break;
			}
			System.out.println();
		}
	}
}
