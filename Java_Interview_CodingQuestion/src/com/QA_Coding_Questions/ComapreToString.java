package com.QA_Coding_Questions;

import java.util.Scanner;

public class ComapreToString {
	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the First String");
		
		String S1 = Sc.nextLine();
		
		System.out.println("Enter the Second String");
		String S2 = Sc.nextLine();
		
		if(S1.compareTo(S2) == 0) {
			System.out.println("String is eqaual...");
		}
		else {
			System.out.println("String are Unequal...");
		}
		Sc.close();
	}

}
