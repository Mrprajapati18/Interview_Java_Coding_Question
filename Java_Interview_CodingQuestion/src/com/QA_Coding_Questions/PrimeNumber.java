package com.QA_Coding_Questions;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number...");

        int n = scan.nextInt();
        scan.close();  // Closing scanner to avoid resource leak

        if (n < 2) {  // Handling non-prime numbers
            System.out.println(n + " is not a Prime Number.");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(n); i++) { // Checking divisibility from 2 to sqrt(n)
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(n + " is a Prime Number.");
        } else {
            System.out.println(n + " is not a Prime Number.");
        }
    }
}
