package com.StarPatternPrintingPractice;

import java.util.Scanner;

public class HollowRightAngled {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter number of values");
		
		int n = Scan.nextInt();
		
		// Outer loop for rows
		for(int i=1;i<=n; i++) 
		{
			// inner loop for column 
			for(int j=1; j<=i; j++) 
			{
				if( i==n || j==1 || j==i) // Condition check and printing for Spaces between triangle
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}			
			}
			System.out.println();
			Scan.close();
		}
	}

}
