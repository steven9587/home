package com.steven;

import java.util.Scanner;

public class AgeTester {

	public static void main(String[] args) {
		System.out.println("請輸入您的年齡");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int age = Integer.parseInt(line);
		
		if(age<12) {
			System.out.println(age+"歲小學嗎?");
		}else {
			if(age<15) {
				System.out.println(age+"歲 國中嗎?");
			}else {
				if(age<18) {
					System.out.println(age+"歲 高中嗎?");
				}else{
					if(age<22) {
						System.out.println(age+"歲 大學嗎?");
					}else {
						System.out.println(age+"歲");
						for(int a = 1;a<4;a++) {
							System.out.println("哈哈哈");
						}
						System.out.println("臭老人!");
					}
				}
			}
		}
	}

}
