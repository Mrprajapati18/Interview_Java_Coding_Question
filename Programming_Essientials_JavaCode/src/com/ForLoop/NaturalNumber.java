package com.ForLoop;

import java.util.Scanner;

public class NaturalNumber {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the natural number:");
        int n = scan.nextInt();
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            sum += i;
            
        }
        
        System.out.println("Natural number is:"+sum);
        scan.close();
    }
}
