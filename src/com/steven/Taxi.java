package com.steven;

import java.util.Scanner;

public class Taxi {

	public static void main(String[] args) {
		System.out.print("搭乘時間" + "           " + "日間(1),夜間(2)" + "  " + "請選擇：");
		Scanner scanner = new Scanner(System.in);
		String line1 = scanner.nextLine();
		int day = Integer.parseInt(line1);

		System.out.print("請輸入里程(公里)[小數點可精確至公尺]：");
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
