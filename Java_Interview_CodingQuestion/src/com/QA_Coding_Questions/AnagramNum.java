package com.QA_Coding_Questions;

import java.util.Arrays;

public class AnagramNum {
    public static void main(String[] args) {
        String str1 = "Amit";
        String str2 = "Aman";

        // Convert strings to character arrays
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        // Check if lengths are different, if yes, they cannot be anagrams
        if (ch1.length != ch2.length) {
            System.out.println("False");
            return;
        }

        // Sort both character arrays
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        // Compare sorted arrays
        System.out.println(Arrays.equals(ch1, ch2) ? "True" : "False");
    }
}
