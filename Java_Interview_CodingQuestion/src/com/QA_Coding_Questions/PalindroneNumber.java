package com.QA_Coding_Questions;

import java.util.Scanner;

public class PalindroneNumber {
	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the Number..");
		
		int num = Sc.nextInt();
		int org_no = num;
		
		int rev = 0;
		while (num != 0) {
			rev =  rev*10 + num % 10;
			num = num / 10;
		}
		if (org_no == rev) {
			System.out.println(org_no + " Number is palindrone");
		}
		else {
			System.out.println(org_no + " Number is not palindrone");
		}
		Sc.close();
	}

}
