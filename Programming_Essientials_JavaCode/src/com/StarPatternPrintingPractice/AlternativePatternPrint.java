package com.StarPatternPrintingPractice;

public class AlternativePatternPrint {

	public static void main(String[] args) {
		
		int n = 4;
		for(int i = 1; i <= 4; i++) {
			
			if(i%2 == 0) {
				System.out.println("**");
			}else {
				System.out.println("*");
			}
		}

	}

}
