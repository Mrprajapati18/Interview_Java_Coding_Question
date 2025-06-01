package com.StarPatternPrintingPractice;

//Java program that prints 6 lines with alternating patterns of stars (*) and spaces,
//where every odd line contains stars and every even line contains spaces.

public class AlternativeStarAndSpaces {

	public static void main(String[] args) {
		int num1 = 6;
		int num2 = 6;
		
		for(int i = 1; i <= num1; i++) {
			// checking the odd number
			if(i%2 ==1) {
				// print stars
				for(int j = 1; j <= num2; j++ ) {
					System.out.print("* ");
				}		
			}
			else {
				for(int j = 1; j <= num2; j++) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
