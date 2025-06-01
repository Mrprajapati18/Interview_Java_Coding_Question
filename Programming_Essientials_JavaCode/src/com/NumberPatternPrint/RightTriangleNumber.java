package com.NumberPatternPrint;

import java.util.Scanner;

public class RightTriangleNumber {

	public static void main(String[] args) {
		// Creating t  he object
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("Enter the  Number of the N");
		int n = Scan.nextInt();
		
		// outer loop for rows
		for(int i=1; i<=n; i++) 
		{
			// inner loop for column 
			for(int j = 1; j<=i; j++)
			{
				// printing the number for each rows
				System.out.print(i);
			}
			// sending the cursor for  next line
			System.out.println();
			Scan.close();
		}

	}

}
