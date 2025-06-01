package com.StarPatternPrintingPractice;

import java.util.Scanner;

public class RightAngledpyradmidStarPrattern {

	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the values of Number");
		int n = Scan.nextInt();
		
		// Outer loop for printing the Rows
		for(int i=1; i<=n;i++) 
		{
			// inner loop for column 
			for(int j=1; j<=n-i+1; j++) 
			{
				System.out.print("-");
			}
			// inner loop printing for star
			for(int j=1;j<=2*i-1; j++) 
			{
				System.out.print("*");
			}
			// Sending the cursor for next line
			System.out.println();
			Scan.close();
		}

	}

}
