package com.controlConstructProgram;

import java.util.Scanner;

public class MarksIf {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter your marks");
		
		int marks = Scan.nextInt();
		
		if(marks >= 35) {
			System.out.println("Passed");
			Scan.close();
		}

	}

}
