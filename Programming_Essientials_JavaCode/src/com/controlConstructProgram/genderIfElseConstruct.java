package com.controlConstructProgram;

import java.util.Scanner;

public class genderIfElseConstruct {

	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter your gender");
		
		char gender = Scan.next().charAt(0);
		
		if( gender == 'M') 
			System.out.println("Male");
		
		else 
			System.out.println("Female");
		   Scan.close();
	}

}
