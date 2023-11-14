package edu.training.main.lesson06;

import java.util.Random;

public class Main11 {

	public static void main(String[] args) {
		
		int mas[] = new int[15];
		int m = 10;
		int l = 2;
		int sum = 0;
		
		Random rand = new Random();
		
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(1000);
			if(mas[i] % m == l) {
				sum += mas[i];
			}
			
		}
		System.out.println(sum);
	}

}
