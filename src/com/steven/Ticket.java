package com.steven;

import java.util.Scanner;

public class Ticket {

	public static void main(String[] args) {
		for (int a = 1; a > 0; a++) {
			System.out.print("輸入購票金額：");
			Scanner scanner = new Scanner(System.in);
			String line = scanner.nextLine();
			int n = Integer.parseInt(line);

			System.out.print("輸入付出金額：");
			String line1 = scanner.nextLine();
			int n1 = Integer.parseInt(line1);

			if (n1 > n) {
				int money = n1 - n;
				a = (money / 50);
				System.out.println("50元" + a + "個");

				int money1 = money - (50 * a);
				int b = (money1 / 10);
				System.out.println("10元" + b + "個");

				int money2 = money1 - (10 * b);
				int c = (money2 / 5);
				System.out.println("5元" + c + "個");

				int money3 = money2 - (5 * c);
				System.out.println("1元" + money3 + "個");
				break;
			}
		}
	}
}
