package com.steven;

public class Niner2 {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int n = 2; n < 6; n++) {
				if (n * i / 10 < 1) {
					System.out.print(n + " x " + i + "= " + (n * i) + "\t");
				} else {
					System.out.print(n + " x " + i + "=" + (n * i) + "\t");
				}
			}
			System.out.println();
		}
	}
}
