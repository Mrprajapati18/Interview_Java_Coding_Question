package com.StarPatternPrintingPractice;

import java.util.Scanner;

public class HollowSquarepattern {

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter the value of number:");
        int n = Scan.nextInt();
        // n=5
        // Loop for rows
        for (int i = 1; i <= n; i++) {
            // Inner loop for columns
            for (int j = 1; j <= n; j++) 
            {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } 
                else {
                    System.out.print("-");
                }
            }
            // Move to the next line after printing each row
            System.out.println();
        }
        
        Scan.close();
    }
}
