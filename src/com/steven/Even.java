package com.steven;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		System.out.print("�п�J�@�ӼƦr:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int number = Integer.parseInt(line);
		
		if(number%2==0){
			System.out.println(number+"�O����");
		}else{
			System.out.println(number+"�O���");
		}
	}

}
