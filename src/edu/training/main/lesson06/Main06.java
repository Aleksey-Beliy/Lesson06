package edu.training.main.lesson06;

import java.util.Random;

public class Main06 {

	public static void main(String[] args) {

		int mas[] = {2, 5, 8, 10, 23, 65, 89, 93};
		int max = mas[0];
		int min = mas[0];
		
		for (int i = 0; i < mas.length; i++) {
			if(mas[i] > max) {
				max = mas[i];
			}
			if(mas[i] < min) {
				min = mas[i];
			}
		}
		int lenght = max - min;
		System.out.println("Найменьшая длина числовой оси = " + lenght);
	}
}
