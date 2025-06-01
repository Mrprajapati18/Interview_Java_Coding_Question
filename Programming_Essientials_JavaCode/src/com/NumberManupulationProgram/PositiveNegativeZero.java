package com.NumberManupulationProgram;

import java.util.Scanner;

public class PositiveNegativeZero {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = Scan.nextInt();
		
		// checking weather number is positive 
       if(num>0) {
    	   System.out.println(num+ "positive Number");
       }
       
       // Checking weather number is negative 
       else if (num<0) {
    	   System.out.println(num+ "negative Number");
       }
       
       // checking weather  number is Zero
       else {
    	   System.out.println(num+ "Zero");
    	   Scan.close();
       }
	}

}
