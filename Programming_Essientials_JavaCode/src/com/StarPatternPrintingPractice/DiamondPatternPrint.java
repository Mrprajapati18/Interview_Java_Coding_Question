package com.StarPatternPrintingPractice;

import java.util.Scanner;

public class DiamondPatternPrint {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the values of Number");
		int n = Scan.nextInt();
		
		//1 Outer loop for rows
		for(int i=1; i<=n;i++) 
		{
			// Inner loop for column
			for(int j=1;j<=n-i+1;j++) 
			{
				System.out.print("-");
			}
			//  inner loop for star printing
			for(int j=1; j<=2*i-1;j++) 
			{
				// Printing for  spaces
				System.out.print("*");
			}
			// Sending the cursor for next line
			System.out.println();
		}
       // 2 outer loop for Rows
	
		for(int i=2; i<=n;i++) 
		{
			// Inner loop for column
			for(int j=1;j<=i;j++) 
			{
				System.out.print("-");
			}
			//  inner loop for star printing
			for(int j=1; j<=(n*2+1)-2*i;j++) 
			{
				// Printing for  spaces
				System.out.print("*");
			}
			// Sending the cursor for next line
			System.out.println();
			Scan.close();
		}
	}

}
