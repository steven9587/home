package com.steven;

import java.util.Scanner;

public class Taxi {

	public static void main(String[] args) {
		System.out.print("�f���ɶ�" + "           " + "�鶡(1),�]��(2)" + "  " + "�п�ܡG");
		Scanner scanner = new Scanner(System.in);
		String line1 = scanner.nextLine();
		int day = Integer.parseInt(line1);

		System.out.print("�п�J���{(����)[�p���I�i��T�ܤ���]�G");
		String line2 = scanner.nextLine();
		int s = Integer.parseInt(line2);

		if (day == 1) {
			if (s < 1.5) {
				int money = 70;
				System.out.println(money);
			} else {
				double n=(s - 1.5) / 0.3;
				int money = 70+5*((int)n);
				System.out.println(money);
			}
		} else {
			if (s < 1.25) {
				int money = 70;
				System.out.println(money);
			} else {
				double n=(s - 1.25) / 0.25;
				int money = 70+5*((int)n);
				System.out.println(money);
			}
		}

	}

}
