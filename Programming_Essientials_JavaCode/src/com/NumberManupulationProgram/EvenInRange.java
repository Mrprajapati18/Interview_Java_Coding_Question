package com.NumberManupulationProgram;

import java.util.Scanner;

public class EvenInRange {

	public static void main(String[] args) {

		Scanner Scan  = new Scanner(System.in);
		System.out.println("Enter the values of M");
		int  m = Scan.nextInt();

		System.out.println("Enter the values of N");
		int n = Scan.nextInt();

		// Checking weather the m is greater then or equal n

		if(m>=n) 
		{
			System.out.println("m should be lesser then n");
		}
		// If m is lesser then n , print the even number
		else
		{
			System.out.println("The even number in between"+m+"and"+n+"are:");

			// searching all even number in range of m to n
			for(int  i=m;i<=n;i++) {

				// Checking weather number is even 
				if(i%2==0) {
					// checking weather the value is true
					if(i<(n-1))
						System.out.println(i+",");
				}
				else {
					System.out.println(i);
					Scan.close();
				}
			}
		}
	}

}
