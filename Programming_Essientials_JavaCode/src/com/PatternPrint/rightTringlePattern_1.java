package com.PatternPrint;

import java.util.Scanner;

public class rightTringlePattern_1 {

	public static void main(String[] args) {
		// Creating the object
		Scanner Scan = new Scanner (System.in);
		
		System.out.println("Enter the values");
		int n = Scan.nextInt();
		
		for(int i =1; i<=n; i++)
		{
			for(int j = 1; j<= n-i+1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			Scan.close();
		}

	}

}
