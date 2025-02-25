package com.QA_Coding_Questions;

// Write a Java Program to count the number of characters in a given String?
import java.util.Scanner;

public class CountCharacter {
     public static void main(String[] args) {
		
    	 Scanner Sc = new Scanner(System.in);
    	 System.out.println("Enter the number of String");
    	 
    	 String input = Sc.nextLine();
    	 int Count = input.length();
    	 
    	 System.out.println("Count of Character is = " + Count);
    	 Sc.close();
	}
}
