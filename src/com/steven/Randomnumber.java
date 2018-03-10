package com.steven;

import java.util.ArrayList;
import java.util.Random;

public class Randomnumber {

	public static void main(String[] args) {
		Random r = new Random();

		ArrayList<Integer> number = new ArrayList<Integer>();
		//利用for loop 放數字
		for (int i = 0; i < 10; i++) {
			number.add((i + 1));
		}
		//亂數抽數字  拉出來  並印出
		for (int n = 1; n > 0; n++) {
			if (number.size() > 0) {
				int a = r.nextInt(number.size());
				System.out.println(number.get(a));
				number.remove(a);
			}else {
				break;
			}
		}
	}
}
