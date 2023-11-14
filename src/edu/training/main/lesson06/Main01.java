package edu.training.main.lesson06;

import java.util.Random;

public class Main01 {

	public static void main(String[] args) {

		int sum = 0;
		int k = 2;
		int masA[] = { 1, 2, 3, 4, 5, 6 };
		Random rand = new Random();

		for (int i = 0; i < masA.length; i++) {
			if (masA[i] % k == 0) {
				sum += masA[i];
			}
		}
		System.out.println("Сумма = " + sum);

	}

}
