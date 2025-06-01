package com.ForLoop;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner Scan  = new Scanner(System.in);
		
		System.out.println("Enter the n number");
		int n = Scan.nextInt();
		int factorial = 1;
		// using for loop
		for(int i = n; i>=1; i--) 
		{
			//factorial *= i ;
			factorial = factorial*1;
		}
		// using While loop
		
		factorial = 1;
		int i = n;
		
		while(i>=1)
		{
			factorial *= i;
			i--;
		}
          System.out.println("factorial is:"+factorial);
          Scan.close();
	}

}
