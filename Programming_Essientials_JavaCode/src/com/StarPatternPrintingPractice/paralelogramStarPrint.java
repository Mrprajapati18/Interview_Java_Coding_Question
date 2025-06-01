package com.StarPatternPrintingPractice;

import java.util.Scanner;

public class paralelogramStarPrint {

	public static void main(String[] args) {
		// Creating the Object
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the number of N");
		int n = Scan.nextInt();
		
		// Loop for rows
		for(int i=1; i<=n;i++) 
		{
			// loop for right angled 
			for(int j = 1; j<=i; j++)
			{
				// Printing for spaces 
				System.out.print(" "); 
			}
			// loop for printing square star
			for(int j = 1; j<=n;j++)
			{
				System.out.print("*");
			}
			// sending the cursor for next line  
			System.out.println();
			Scan.close();
		}

	}

}
