package com.StarPatternPrintingPractice;

import java.util.Scanner;

public class PyrimidStarPrinting {

    public static void main(String[] args) {
        // Creating the object
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = scan.nextInt();
        
        // Outer loop for 1 set of rows
        for (int i = 1; i <= n; i++) {
            // Loop for printing spaces before stars
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Loop for printing stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            // Sending the cursor to the next line
            System.out.println();
        }
        scan.close();
    }
}


