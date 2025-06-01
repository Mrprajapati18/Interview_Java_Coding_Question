package com.StarPatternPrintingPractice;

import java.util.Scanner;
public class HalfDiamondPatternPrint {

    public static void main(String[] args) {
    	
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of Number");
        int n = scan.nextInt();
        
        
        // Outer loop for 1 set of rows
        for(int i = 1; i <= n; i++) {
            // Inner loop for column (printing '-')
            for(int j = 1; j <= n; j++) {
                System.out.print("-");
            }
            // Loop for printing right-angled triangle (printing '*')
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
               
            }
            // Sending the cursor to the next line
            System.out.println();
            
        }
        // Outer loop for 2 set of rows
        for(int i = 1; i <= n; i++) {
            // Inner loop for column (printing '-')
            for(int j = 1; j <= n; j++) {
                System.out.print("-");
            }
            // Loop for printing right-angled triangle (printing '*')
            for(int j = 1; j <= n-i+1; j++) {
                System.out.print("*");
               
            }
            // Sending the cursor to the next line
            System.out.println();
            scan.close();
        }
    }
}