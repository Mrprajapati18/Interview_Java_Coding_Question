package com.StarPatternPrintingPractice;

import java.util.Scanner;

public class SquareRightAngledpattern {

	public static void main(String[] args) {
		// Creating for object
		Scanner Scan= new Scanner(System.in);
		System.out.println("Enter the values of N");
		int n = Scan.nextInt();
		
		// Loop for rows
		for(int i=1;i<=n;i++)
		{
			// loop for Square 
			for(int j=1; j<=n; j++)
			{
				// printing for Spaces
				
				System.out.print("-");
			}
			
			// Loop for right angled
		    for(int j=1;j<=i;j++) 
		    {
		    	System.out.print(" * ");
		    }
		    // sending for cursor to next line
			System.out.println();
			Scan.close();
		}

	}

}
