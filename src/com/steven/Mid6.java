package com.steven;

import java.util.Random;
import java.util.Scanner;

public class Mid6 {

	public static void main(String[] args) {
		System.out.println("請輸入一個1~10的數字:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int number = Integer.parseInt(line);

			Random r = new Random();
			int n1 = r.nextInt(10)+1;
			int n2 = r.nextInt(10)+1;
			int n3 = r.nextInt(10)+1;
			int n4 = r.nextInt(10)+1;
			int n5 = r.nextInt(10)+1;
			int n6 = r.nextInt(10)+1;
			System.out.print(n1);
			System.out.print(" "+n2);
			System.out.print(" "+n3);
			System.out.print(" "+n4);
			System.out.print(" "+n5);
			System.out.print(" "+n6);
			
			System.out.println();
			
			if(number == n1 ||number == n2 ||number == n3 ||number == n4 ||number == n5 ||number == n6 ) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}

