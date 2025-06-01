package com.StarPatternPrintingPractice;

import java.util.Scanner;

public class HellowRectanglePattern {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("Enter the row and column");
		int row = Scan.nextInt();
		int col = Scan.nextInt();
		// Printing for rows
		
		for(int i=1; i<=row; i++) 
		{
			// printing for column
			for(int j=1;j<=col;j++)
			
				if((i==1 || i==col) || (j==1 || j== col)) 
				
					System.out.print("*");
				
				else 
					System.out.print(" ");
				
				System.out.println();
				Scan.close();
			}
		}

	}

