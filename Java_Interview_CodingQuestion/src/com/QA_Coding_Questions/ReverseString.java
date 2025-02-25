package com.QA_Coding_Questions;

import java.util.Scanner;

public class ReverseString {
      public static void main(String[] args) {
		
    	  Scanner Sc = new Scanner(System.in);
    	  
    	  System.out.println("Enter the String");
    	  
    	  String input = Sc.nextLine();
    	  String reverse = " ";
    	  
    	  for(int  i = input.length() - 1; i >= 0; i--) {
    		  reverse = reverse + input.charAt(i);
    	  }
    	  System.out.println("Reverse String = " + reverse);
    	  Sc.close();
	}
}
