package edu.training.main.lesson06;

import java.util.Scanner;

public class Main04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean x = true;
		int mas[] = new int[5];

		for (int i = 0; i < mas.length; i++) {
			mas[i] = sc.nextInt();
		}
		for (int i = 0; i < mas.length - 1; i++) {
			if (mas[i] >= mas[i + 1]) {
				x = false;
			}
		}
		if (x == false) {
			System.out.println("Последоватьельность не возрастающая");
		} else {
			System.out.println("Последоватьельность возрастающая");
		}
	}
}
