package com.ForLoop;

import java.util.Scanner;

public class tableOfNumber {

	public static void main(String[] args) {
		// To create object
		Scanner Scan = new Scanner(System.in);
		 System.out.println("Enter the number");
		 
		 int n = Scan.nextInt();
		
         for(int i =1; i<=10; i++) {
        	 System.out.println(n+"X"+ i+"="+ (n*i));
        	 Scan.close();
         }
	}

}
