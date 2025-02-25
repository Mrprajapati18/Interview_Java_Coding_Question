package com.QA_Coding_Questions;

import java.util.Scanner;

/* Armstrong Approach
   153, 370 
   
   153 -> 1*1*1 + 5*5*5 + 3*3*3
           1 + 125 + 27
            153
*/
  public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the Number...");
		
		// using user variable 
		int Num = Sc.nextInt();
		
		// int Num = 153;
		
		int temp = Num;
		int rev = 0;
		int sum = 0;
		
		while(Num > 0) {
			rev = Num % 10;
			Num = Num / 10;
			sum = sum + rev*rev*rev;
		}
		if(temp == sum) {
			System.out.println("Number is Armstrong");
		}
		else {
			System.out.println("Not Armstrong Number");
		}
		Sc.close();
	}

}
