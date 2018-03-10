package com.steven;

public class Prime1000 {

	public static void main(String[] args) {
		for (int number = 2; number < 1001; number++) {
			boolean prime = true;
			for (int a = 2; a < number; a++) {
				if (number % a == 0) {
					prime = false;
					break;
				}
			}
			if (prime) {
				System.out.print(number + "\t");
			}
		}
	}
}
