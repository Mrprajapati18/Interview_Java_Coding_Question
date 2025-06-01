package com.IfElesLadderProgram;
// Debugs Mode in Eclipse

import java.util.Scanner;

public class positiveNegativeNumber {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int number = Sc.nextInt();
		
		if (number >0) {
			System.out.println("positive");
		}
		else if(number <0) {
			System.out.println("Negative");
		}
		else {
			System.out.println("Zero");
			Sc.close();
		}
	}
}
