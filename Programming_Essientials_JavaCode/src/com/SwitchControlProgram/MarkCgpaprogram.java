package com.SwitchControlProgram;

import java.util.Scanner;

public class MarkCgpaprogram {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        
        System.out.println("Enter your marks");
        int marks = Scan.nextInt();
        int cgpa = marks / 10;    
        printremarks(cgpa);
        
        Scan.close(); // Close the Scanner object
    }
    
    public static void printremarks(int cgpa) {
        switch (cgpa) {
            case 10:
            case 9:
            case 8:
                System.out.println("Excellent");
                break;
            case 7:
            case 6:
                System.out.println("Good");
                break;
            case 5:
                System.out.println("Ok");
                break;
            case 4:
            case 3:
            case 2:
                System.out.println("Poor");
                break;
            case 1:
            case 0:
                System.out.println("Get Lost");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
