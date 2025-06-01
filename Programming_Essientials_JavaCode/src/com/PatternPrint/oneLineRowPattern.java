package com.PatternPrint;

import java.util.Scanner;

public class oneLineRowPattern {

    public static void main(String[] args) {
        // creating object
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter the values");
        
        int n = Scan.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        // Closing the Scanner object
       Scan.close();
    }
}
