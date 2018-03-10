package finalpractice;

import java.util.Scanner;

public class Vendingmachine {

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i > 0; i++) {
			System.out.println("販賣機餘額：" + sum);
			System.out.print("請投幣或選擇飲料(a或b或c),或輸入0結束：");
			Scanner scanner = new Scanner(System.in);
			String line = scanner.nextLine();

			if (line.equals("1")) {
				sum = sum + 1;
			} else {
				if (line.equals("5")) {
					sum = sum + 5;
				} else {
					if (line.equals("10")) {
						sum = sum + 10;
					} else {
						if (line.equals("a")) {
							if (sum >= 15) {
								sum = sum - 15;
								System.out.println("DON!");
							} else {
								System.out.println("DEEP!");
							}
						} else {
							if (line.equals("b")) {
								if (sum >= 20) {
									sum = sum - 20;
									System.out.println("DON!");
								} else {
									System.out.println("DEEP!");
								}
							} else {
								if (line.equals("c")) {
									if (sum >= 30) {
										sum = sum - 30;
										System.out.println("DON!");
									} else {
										System.out.println("DEEP!");
									}
								} else {

								}
								if (line.equals("0")) {
									break;
								}
							}
						}

					}
				}
			}

		}
	}
}
