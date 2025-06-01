package com.StarPatternPrintingPractice;

import java.util.Scanner;

public class ReverseRightAngledpyrimidPattern {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("Enter the number of values");
		int n = Scan.nextInt();
        
		//Outer Loop  for print the rows
		for(int i = 1; i<=n; i++) 
		{
		  // Inner loop for right angled triangle 
			for(int j=1;j<=i; j++) 
			{
				// printing for spaces 
				System.out.print("-");
			}
			// Inner loop for pyramid 
			for(int j=1;j<=11-2*i;j++) 
			{
				// printing for Stars
				System.out.print("*");
			}
			// sending the cursor for next line
			System.out.println();
			Scan.close();
		}
	}

}
