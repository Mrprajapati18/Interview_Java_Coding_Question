package com.NumberManupulationProgram;

import java.util.Scanner;

public class CountNumberDigitValues {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number value:");
		int number = scan.nextInt();

		int countNumberDigit = countNumberDigit(number);

		System.out.println("The number of digits in " + number + " is: " + countNumberDigit);

		scan.close();
	}

	public static int countNumberDigit(int number) {
		if (number == 0) {
			return 1;
		}

		int count = 0;
		while (number != 0) {
			number = number / 10;
			count++;
		}
		return count;
	}
}

