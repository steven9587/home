package com.steven;

import java.util.Scanner;

public class GameTester {

	public static void main(String[] args) {
		int hp = 100;
		int pos = 0;
		int row = 3;
		int clo = 5;

		while (true) {
			System.out.println("�п�J��V:");
			Scanner scanner = new Scanner(System.in);
			String line = scanner.nextLine();
			int direction = Integer.parseInt(line);
			
			switch (direction) {
			case 2:
				if (pos / clo < row - 1) {
					System.out.println("�V�U");
					hp = hp -5;
					System.out.println("�Ѿl��q:"+hp);
					pos = pos+5;
				} else {
					System.out.println("����");
					hp = hp -30;
					System.out.println("�Ѿl��q:"+hp);
				}
				break;
			case 8:
				if (pos / clo >= row - 2) {
					System.out.println("�V�W");
					hp = hp -5;
					System.out.println("�Ѿl��q:"+hp);
					pos = pos-5;
				} else {
					System.out.println("����");
					hp = hp -30;
					System.out.println("�Ѿl��q:"+hp);
				}
				break;
			case 4:
				if (pos % clo == 0) {
					System.out.println("����");
					hp = hp -30;
					System.out.println("�Ѿl��q:"+hp);
				} else {
					System.out.println("�V��");
					hp = hp -5;
					System.out.println("�Ѿl��q:"+hp);
					pos = pos-1;
				}
				break;
			case 6:
				if (pos % clo == 4) {
					System.out.println("����");
					hp = hp -30;
					System.out.println("�Ѿl��q:"+hp);
				} else {
					System.out.println("�V�k");
					hp = hp -5;
					System.out.println("�Ѿl��q:"+hp);
					pos = pos+1;
				}
				break;
			case 0:
				break;
			}
			if(hp<0) {
				System.out.println("Game Over!");
				break;
			}
		}
	}
}
