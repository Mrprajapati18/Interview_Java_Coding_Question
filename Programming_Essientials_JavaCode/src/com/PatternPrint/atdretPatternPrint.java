package com.PatternPrint;

import java.util.Scanner;

public class atdretPatternPrint {

	public static void main(String[] args) {
		
		// creating the object 
		Scanner Scan = new Scanner(System.in);
		 System.out.println("Enter the Row Value");
		 int row = Scan.nextInt();
		 
		 System.out.println("Enter the Columns value");
		 int col = Scan.nextInt();
		 
		 System.out.println("Enter the Charcter values");
		 char ch = Scan.next().charAt(0);
		 
		 // loop for row
		 
		 for(int i = 1; i<=row; i++) 
		 {
			 // loop  for printing the columns
			 for(int j=1; j<=col; j++) {
				 System.out.print(ch);
			 }
			 // sending the cursor to next line
			 System.out.println();
			 Scan.close();
		 }

	}

}
