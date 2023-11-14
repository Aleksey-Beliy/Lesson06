package edu.training.main.lesson06;

import java.util.Random;

public class Main05 {

	public static void main(String[] args) {

		Random rand = new Random();
		int mas[] = new int[5];
		int count = 0;

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(100);
			if (mas[i] % 2 == 0) {
				count++;
			}
		}

		int masArray[] = new int[count];
		for (int j = 0, i = 0; i < mas.length; i++) {
			if (mas[i] % 2 == 0) {
				masArray[j] = mas[i];
				System.out.print("{" + masArray[j] + "}, ");
			}
		}if(count == 0) {
			System.out.println("В этом массиве только нечетные числа");
		}
	}

}
