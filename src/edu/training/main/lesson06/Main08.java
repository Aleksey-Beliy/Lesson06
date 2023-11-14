package edu.training.main.lesson06;

import java.util.Random;

public class Main08 {

	public static void main(String[] args) {

		int mas[] = {1, 5, -7, 0, 9, -6, -10, 8, 0};
		int count0 = 0;
		int countOtr = 0;
		int countPol = 0;

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				count0++;
			} else {
				if (mas[i] < 0) {
					countOtr++;
				} else {
					if (mas[i] > 0) {
						countPol++;
					}

				}
			}
		}
		System.out.println("Нулевых элементов = " + count0);
		System.out.println("Положительных элементов = " + countPol);
		System.out.println("Отрицательных элементов = " + countOtr);

	}

}
