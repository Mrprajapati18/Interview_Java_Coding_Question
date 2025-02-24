package com.Important_Coding_QuestionInterview;

//  Write a Java program to compare two strings?

import java.util.Scanner;

public class ComapareTwoString {
   public static void main(String[] args) {

	  Scanner Scan = new Scanner(System.in);
	  System.out.println("Enter the First String");
	  
	  String S1 = Scan.next();
	  System.out.println("Enter the Second String");
	  
	  String S2 = Scan.next();
	  
	  if(S1.compareTo(S2)==0) {
		  System.out.println("String is equal");
	  }
	  else {
		  System.out.println("String is Not Equal");
	  }
	  Scan.close();
  }
}
