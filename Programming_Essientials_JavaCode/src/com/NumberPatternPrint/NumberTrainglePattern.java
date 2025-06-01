package com.NumberPatternPrint;

import java.util.Scanner;

//Number triangle pattern

public class NumberTrainglePattern {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the Number of values");
		int n = Scan.nextInt();
		
		// Outer loop for rows
		for(int i=1; i<=n;i++) 
		{
			// Inner loop for Spaces
			for(int j=1;j<=n-i;j++) 
			{
				System.out.print(" ");
			}
			// inner loop printing for stars
			for(int j=1; j<=i;j++) 
			{
				System.out.print(i+ " ");
			}
			// printing for new for each rows
			System.out.println();
			Scan.close();
		}
	}

}
