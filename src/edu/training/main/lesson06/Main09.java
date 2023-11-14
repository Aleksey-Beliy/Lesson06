package edu.training.main.lesson06;

public class Main09 {

	public static void main(String[] args) {

		int mas[] = { 1, 2, 3, 4, 5 };
		int max = 0;
		int min = 0;

		for (int i = 1; i < mas.length; i++) {
			if(mas[i] > mas[max]) {
				max = i;
				if(mas[i] < mas[min]) {
					min = i;
				}
			}
			int temp = mas[max];
			mas[max] = mas[min];
			mas[min] = temp;
			
			
		}
		System.out.println(java.util.Arrays.toString(mas));
	}
}
