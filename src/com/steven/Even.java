package com.steven;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		System.out.print("請輸入一個數字:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int number = Integer.parseInt(line);
		
		if(number%2==0){
			System.out.println(number+"是偶數");
		}else{
			System.out.println(number+"是基數");
		}
	}

}
