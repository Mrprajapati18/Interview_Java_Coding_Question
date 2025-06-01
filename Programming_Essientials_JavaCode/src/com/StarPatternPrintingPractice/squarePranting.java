package com.StarPatternPrintingPractice;

import java.util.Scanner;

public class squarePranting {

	public static void main(String[] args) {
		// Creating the object
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		
		int n = Scan.nextInt();
		
		for(int i = 1; i<=n;i++) // for printing the column(Outer loop)
		{
			for(int j=1; j<=n; j++) // printing the rows (inner loop)
			{
				System.out.print(" * "); // Printing the Star 
			}
			System.out.println( ); // for Next line
			Scan.close();
		}

	}

}
