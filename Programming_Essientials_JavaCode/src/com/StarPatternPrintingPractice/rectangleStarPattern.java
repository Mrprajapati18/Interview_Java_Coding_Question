package com.StarPatternPrintingPractice;

import java.util.Scanner;

public class rectangleStarPattern {

	public static void main(String[] args) {
		// Object  creating 
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the rows values");
		int row = Sc.nextInt();
		
		System.out.println("Enter the column values");
		int col = Sc.nextInt();
		
		System.out.println("Enter character values");
		char ch = Sc.next().charAt(0);
		
		// loop for rows
		
		for(int i=1; i<=row; i++) 
		{
			// loop for printing stars in column
			for(int j = 1; j<=col; j++)
			{
				// printing for character
				System.out.print( ch );
			}
			// sending for courser for next line
			System.out.println();
			Sc.close();
		}

	}

}
