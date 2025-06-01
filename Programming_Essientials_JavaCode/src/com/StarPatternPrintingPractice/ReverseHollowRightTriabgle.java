package com.StarPatternPrintingPractice;

import java.util.Scanner;

public class ReverseHollowRightTriabgle {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the number of values");
		
		int n = Scan.nextInt();
		// Outer loop for rows
		for(int i=1;i<=n;i++)
		{
			// Inner loop for column
			for(int j=1;j<=n-i+1; j++)
			{
				// printing for spaces
				if(i==1|| j==1 || j==n-i+1)
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
