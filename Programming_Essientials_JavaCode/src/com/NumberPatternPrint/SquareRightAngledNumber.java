package com.NumberPatternPrint;

import java.util.Scanner;

public class SquareRightAngledNumber {

	public static void main(String[] args) {
		// creating the Object
		
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the values of N ");
		int n = Sc.nextInt();
		
		for(int i=1; i<=n; i++) // Loop for rows
		{
			for(int j=1;j<=n;j++) // loop  for print the number
			{
				System.out.print(i);
			}
			// loop for right triangle 
			for(int j=1; j<=i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
			Sc.close();
		}
	}

}
