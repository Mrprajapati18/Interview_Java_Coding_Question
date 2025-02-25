package com.QA_Coding_Questions;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the Nuber...");
		
		int n = Scan.nextInt();
		
		if(n%1 == 0 || n%2 == 0) {
			System.out.println("Prime Number " + n);
		}
		else {
			System.out.println("Not prime Number " + n);
		}
	}

}
