package com.NumberManupulationProgram;

import java.util.Scanner;

public class NprimeNumber {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
  
		int n = Scanner.nextInt(); // change this value to get the first n prime numbers
		int count = 0; // count of prime numbers found
		int num = 2; // number to be checked for prime

		System.out.println("The first "+n+" prime numbers are:");
		while (count < n) {
			if (isPrime(num)) {
				System.out.println(num);
				count++;
			}
			num++;
			Scanner.close();
		}
	}

	// Method to check if a number is prime
	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
