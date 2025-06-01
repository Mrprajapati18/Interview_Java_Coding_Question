package com.NumberPatternPrint;

import java.util.Scanner;

public class Squarenumber {
	public static void main(String[] args) {
		// Creating the object
		
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int n = Scan.nextInt();
		
		// loop for Rows
		 for(int i=1; i<=n; i++) 
		 {
			 // loop printing for J number
			 for(int j=1;j<=n; j++) 
			 {
				 System.out.print(j);
			 }
			 // sending the cursor for next line
			 System.out.println();
			 Scan.close();
		 }
	}

}
