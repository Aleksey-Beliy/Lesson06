package edu.training.main.lesson06;

public class Main07 {

	public static void main(String[] args) {

		int mas[] = { 1, 4, 6, 8, 15, 23, 45, 71, 96, };
		int z = 30;
		int count = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > z) {
				mas[i] = z;
				count++;
			}
			System.out.print("[" + mas[i] + "] ; ");
		}
		System.out.println("Количество замен = " + count);

	}

}
