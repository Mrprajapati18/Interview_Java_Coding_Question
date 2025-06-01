package com.UserInputProgram;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		
        System.out.println("Enter the number of values");
        int n = Scan.nextInt();
        
        if(n%1==0 || n%2==0) {
        	System.out.println(n+ " is a prime number");
        }
        else
        {
        	System.out.println(n+ " is not a prime number");
        }
        Scan.close();
	}

}
