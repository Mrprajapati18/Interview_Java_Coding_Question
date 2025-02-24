package com.Important_Coding_QuestionInterview;

// Write a Java Program to count the number of characters in a given Strin

public class CountStringChar {
     public static void main(String[] args) {
		 
    	 String str = "Hello World";
    	 int Count  = 0;
    	 
    	 // Count the charcter 
    	 for(int i=0; i<str.length(); i++) {
    		 if(str.charAt(i) != ' ')
    			 Count++;
    	 }
    	// Display the total number of character 
		 System.out.println("Total number of Character in String " + Count);
	}
}
