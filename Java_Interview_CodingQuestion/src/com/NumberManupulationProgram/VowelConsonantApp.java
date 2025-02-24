package com.NumberManupulationProgram;

import java.util.Scanner;

public class VowelConsonantApp {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the Character");
		char ch = Scan.next().charAt(0);
		
		// Checking weather character is alphabet
		if((ch >= 'a' && ch <= 'z')||(ch>='A' && ch<='Z')) 
		{
			// Checking weather character is vowel
			if(ch=='a' || ch=='e' || ch=='i'|| ch=='o' || ch=='u'|| ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
			{
				System.out.println(ch+"  is a vowel");
			}
			// other wise alphabet is consonant
			else 
			{
				System.out.println(ch+ "  is a is Consonant");
			}
		}
		// Other wise character is not valid alphabet
		else 
		{
			System.out.println(ch+"  is Not a valid Alphabet");
			Scan.close();
		}

	}

}
