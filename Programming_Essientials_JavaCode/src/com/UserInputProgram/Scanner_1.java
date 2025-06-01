package com.UserInputProgram;

import java.util.Scanner;

public class Scanner_1 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner (System.in);
		
		System.out.println("Enter you height");
		float height = Scan.nextFloat();
		
		System.out.println("Enter your account");
		double  account = Scan.nextDouble();
		
		System.out.println("Enter your marridStatus");
		boolean marridstatus = Scan.nextBoolean();
		
		System.out.println("Height is:"+height);
		System.out.println("Account Balance is:"+account);
		System.out.println("Married status is:"+marridstatus);
        
		Scan.close();
	}

}
