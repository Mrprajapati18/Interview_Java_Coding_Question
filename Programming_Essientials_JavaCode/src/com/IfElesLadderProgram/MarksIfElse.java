package com.IfElesLadderProgram;

import java.util.Scanner;

public class MarksIfElse {
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("Enter your marks");
		
		int marks = Scan.nextInt();
		
		if(marks >= 90 && marks <=100) {
			System.out.println("Grade A");
		}
		else if (marks >70 && marks <= 90) {
			System.out.println("grade B");
		}
		else if(marks >50 && marks <=70) {
			System.out.println("Grade C");
			
		}
		else if(marks >=35 && marks <= 50) {
			System.out.println("grade  D");
		}
		else if(marks>=0 && marks<=35) {
			System.out.println("Fail");
		}
		 else {
			 System.out.println("Invalid");
			 Scan.close();
		 }
	}

}

