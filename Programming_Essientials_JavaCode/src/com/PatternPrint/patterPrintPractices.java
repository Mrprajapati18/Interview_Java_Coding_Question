package com.PatternPrint;

import java.util.Scanner;

public class patterPrintPractices {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the values");
		
		int n = Scan.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n;j++)
			{
				System.out.print (" * ");
			}
			System.out.println( );
			Scan.close();
		}

	}

}
