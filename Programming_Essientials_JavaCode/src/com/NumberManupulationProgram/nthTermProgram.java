package com.NumberManupulationProgram;

import java.util.Scanner;

public class nthTermProgram {

	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the number of N");
		int Number = Scan.nextInt();
		
		// print the nth term
		int nthTerm = (Number*(Number+1))/2;
		
		System.out.println("The "+Number+"th term of series is "+nthTerm+".");
		Scan.close();
	}

}
