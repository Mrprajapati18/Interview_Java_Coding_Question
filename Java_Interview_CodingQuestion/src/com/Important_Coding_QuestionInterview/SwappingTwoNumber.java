package com.Important_Coding_QuestionInterview;

//Write a Java program to swap two numbers without using third variable?

import java.util.Scanner;

public class SwappingTwoNumber {
       public static void main(String[] args) {
    	   
    	   int x,y,z;
    	   Scanner scan = new Scanner(System.in);
    	    x = scan.nextInt();
    	    y = scan.nextInt();
 
    	   
    	   System.out.println("Before Swapping:"+ " x is " + x + " and " + y + " is y " + y);
    	   z = x; x = y; y = z;
    	   
    	   System.out.println("After Swapping:"+ " x is " + x + " and " + y + " is y " + y);
		   scan.close();
       }
      
}