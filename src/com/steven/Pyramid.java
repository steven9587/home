package com.steven;

import java.util.Scanner;

public class Pyramid {
	public static void main(String[] args) {
		System.out.println("�п�J�@�ӼƦr�G");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int number = Integer.parseInt(line);
		
		for(int a=0;a<number;a++) {
			for(int b=-1;b<a;b++) {
				System.out.print("*");
			}
			for(int c=0;c<number-a-1;c++) {
				System.out.print("%");
			}
			System.out.println();
		}
	}
}
