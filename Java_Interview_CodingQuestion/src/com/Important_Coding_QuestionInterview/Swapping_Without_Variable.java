package com.Important_Coding_QuestionInterview;

//Write a Java program to swap two numbers without using third variable?

public class Swapping_Without_Variable {
     public static void main(String[] args) {
    	  int x = 10;
    	  int y = 5;
    	  x = x + y;
    	  y = x - y;
    	  x = x - y;
    	  
    	  System.out.println("After Swapping:"+ " x is " + x + " and " + y + " is y " + y);
	}
}