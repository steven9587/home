package com.steven;

import java.util.Scanner;

public class AgeTester {

	public static void main(String[] args) {
		System.out.println("�п�J�z���~��");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int age = Integer.parseInt(line);
		
		if(age<12) {
			System.out.println(age+"���p�Ƕ�?");
		}else {
			if(age<15) {
				System.out.println(age+"�� �ꤤ��?");
			}else {
				if(age<18) {
					System.out.println(age+"�� ������?");
				}else{
					if(age<22) {
						System.out.println(age+"�� �j�Ƕ�?");
					}else {
						System.out.println(age+"��");
						for(int a = 1;a<4;a++) {
							System.out.println("������");
						}
						System.out.println("��ѤH!");
					}
				}
			}
		}
	}

}
