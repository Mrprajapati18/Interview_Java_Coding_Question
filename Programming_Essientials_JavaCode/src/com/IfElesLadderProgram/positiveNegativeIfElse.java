package com.IfElesLadderProgram;

import java.util.Scanner;

public class positiveNegativeIfElse {

	public static void main(String[] args) {
		Scanner Scan = new Scanner (System.in);
		
		System.out.println("Enter the number");
		int number = Scan.nextInt();
		
		if(number > 0) {
			System.out.println("Number is positive");
		}
		else if(number <0) {
			System.out.println("Number is Negative");
		}
		else {
			System.out.println("Zero");
			Scan.close();
		}
	}

}
