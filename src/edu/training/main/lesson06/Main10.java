package edu.training.main.lesson06;

public class Main10 {

	public static void main(String[] args) {

		double mas[] = {0.3, 0.5, 10, 2.9, 4.0, 42, 67, 83};
		
		for (int i = 0; i < mas.length; i++) {
			if(mas[i] > i) {
				System.out.print("[" + mas[i] + "] ; ");
			}
		}
	}

}
