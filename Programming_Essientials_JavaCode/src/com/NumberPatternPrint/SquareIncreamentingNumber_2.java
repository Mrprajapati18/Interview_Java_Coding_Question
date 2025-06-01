package com.NumberPatternPrint;

import java.util.Scanner;

public class SquareIncreamentingNumber_2 {

	public static void main(String[] args) {
		// Creating for object
		
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the number of N");
        
		int n = Scan.nextInt();
		
		// Loop for rows
		for(int i=1; i<=n; i++)
		{
			// loop for printing for column
			
			for(int j=1; j<=n; j++)
			{
				System.out.print(i);
			}
			// sending the cursor for next line
			System.out.println();
			Scan.close();
		}
	}

}
