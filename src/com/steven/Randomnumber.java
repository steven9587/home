package com.steven;

import java.util.ArrayList;
import java.util.Random;

public class Randomnumber {

	public static void main(String[] args) {
		Random r = new Random();

		ArrayList<Integer> number = new ArrayList<Integer>();
		//�Q��for loop ��Ʀr
		for (int i = 0; i < 10; i++) {
			number.add((i + 1));
		}
		//�üƩ�Ʀr  �ԥX��  �æL�X
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
