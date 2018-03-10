package com.steven;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		System.out.println("請輸入一個數字：");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int number = Integer.parseInt(line);
		boolean prime = true;
		for(int a=2;a < number;a++) {
			if(number % a ==0) {
				prime = false;
				break;
			}
		}
		if(prime) {
			System.out.println(number+" IS A PRIME");
		}else {
			System.out.println(number+" IS NOT A PRIME");
		}
	}

}
