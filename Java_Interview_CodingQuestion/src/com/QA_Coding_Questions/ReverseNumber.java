package com.QA_Coding_Questions;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Enter the Number...");
		
		int Number = Sc.nextInt();
		
		int Reverse = 0;
		
		while(Number != 0) {
			int Digit = Number % 10;  // Find the Last digit
			Reverse = Reverse * 10 + Digit; // Append digit to reverse digit 
			Number  = Number / 10;    // Remove the last Digit		
		}
		System.out.println("Reverse Number is " + Reverse);
		Sc.close();
	}

}
