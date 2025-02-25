package com.QA_Coding_Questions;

//Write a Java program to swap two numbers without using third variable
public class SwapTwoNumber {
	public static void main(String[] args) {
		
		System.out.println("Enter the Number of Two");
		
		int x = 10;
		int y = 5;
		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println("After Swapping  X is " + x +" And " + " Y Is " + y );
	}

}
