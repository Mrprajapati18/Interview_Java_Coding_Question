package com.Important_Coding_QuestionInterview;

// Write a Java program for printing the prime numbers?

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
		
    	System.out.println("Enter the Number");
    	Scanner scan = new Scanner(System.in);
    	boolean flag = false;
    	
    	int num = scan.nextInt();
    	
    	for(int i=2; i<num/2; i++) {
    		if(num%2==0) {
    			flag = true;
    			break;
    		}
    	}
    	if(!flag) {
    		System.out.println(num + " is a prime Number");
    	}
    	else {
    		System.out.println(num + " is not a prime Number");
    	}
    	scan.close();
	}
}
