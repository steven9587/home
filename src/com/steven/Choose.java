package com.steven;

import java.util.Scanner;

public class Choose {

	public static void main(String[] args) {
		System.out.println("以下誰年紀最大?");
		System.out.println("(1)周杰倫");
		System.out.println("(2)華辰宇");
		System.out.println("(3)梁朝偉");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int choose = Integer.parseInt(line);
		
		if(choose == 3){
			System.out.println("你答對啦!棒棒~");
		}else {
			System.out.println("你答錯啦!死低能~");
		}
	}

}
