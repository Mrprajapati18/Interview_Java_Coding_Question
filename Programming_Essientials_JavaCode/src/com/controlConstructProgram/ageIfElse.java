package com.controlConstructProgram;

import java.util.Scanner;

public class ageIfElse {

	public static void main(String[] args) {
		
		Scanner Scan = new Scanner (System.in);
        System.out.println("Enter your age");
        int age = Scan.nextInt();
        
        if(age >=18) 
        {
        	System.out.println("Adult");
        }
        else
        {
        	System.out.println("Not Adult");
        	Scan.close();
        }
	}

}
