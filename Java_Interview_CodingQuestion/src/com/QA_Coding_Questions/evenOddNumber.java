package com.QA_Coding_Questions;

import java.util.Scanner;

public class evenOddNumber {
	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Enter the Number...");
		
		int Num = Sc.nextInt();
		
		if(Num % 2 == 0) {
			System.out.println("Even Number...");
		}
		else {
			System.out.println("Odd Number...");
		}
		Sc.close();
	}

}
