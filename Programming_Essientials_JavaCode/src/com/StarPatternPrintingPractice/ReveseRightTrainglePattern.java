package com.StarPatternPrintingPractice;

import java.util.Scanner;

public class ReveseRightTrainglePattern {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("Enter the Number of Star");
		int n =Scan.nextInt();
		
		// Outer loop for each row
		for(int i=n; i>=1;i--) 
		{
			// inner loop for printing dashed
		 for(int j=1; j<=n;j++)
		 {
			 System.out.print("-");
		 }
	       // Inner loop for printing stars
		 for(int k=1;k<=i; k++) {
			System.out.print("*");
		}
		// Sending the cursor for next line
		System.out.println();
		Scan.close();
	   }
	}
}
