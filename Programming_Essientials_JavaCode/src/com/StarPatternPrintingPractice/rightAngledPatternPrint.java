package com.StarPatternPrintingPractice;

import java.util.Scanner;

public class rightAngledPatternPrint {

	public static void main(String[] args) {
		// Creating for object
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the values of N");
        int n = Scan.nextInt();
        
        // Loop for rows
        for(int i=1; i<=n; i++) 
        {
        	// loop for 1st right angled triangle
        	for(int j=1; j<=i; j++) 
        	{
        		// printing for spaces
        		System.out.print("-");
        	}
        	// loop for 2ed right angled triangle
        	for(int  j=1; j<=i; j++)
        	{
        		System.out.print("*");
        	}
        	// sending cursor for next line
        	System.out.println();
        	Scan.close();
        }
	}

}
