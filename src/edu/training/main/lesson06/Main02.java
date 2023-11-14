package edu.training.main.lesson06;

public class Main02 {

	public static void main(String[] args) {

		int mas[] = { 899, 586, 212, 0, 432, 0, 495, 161, 984, 0, 0, 754, 309, 361, 40, 14, 697, 422, 884, 0 };

		int countZero = 0;
		
		for (int i = 0; i < mas.length; i++) {
			if(mas[i] == 0) {
				countZero++;
			}
		}
		int[] zeroPositionsArray = new int[countZero];
		for (int i = 0, j = 0; i < mas.length; i++) {
			if(mas[i] == 0) {
				zeroPositionsArray[j++] = i;
			}
		}
		for (int i = 0; i <mas.length; i++) {
			System.out.print("[" + mas[i] + "], ");
		}
		System.out.println();
		for (int i = 0; i < zeroPositionsArray.length; i++) {
			System.out.print("{" + zeroPositionsArray[i] + "} ");
		}
	}
}
