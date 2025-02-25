package com.QA_Coding_Questions;

public class duplicateCharacter {
	public static void main(String[] args) {
		
		String str = new String("Testing Automation");
		int count = 0;
		
		// Convert to character in array
		char[] ch = str.toCharArray();
		for(int i = 0; i < ch.length; i++) {
			for(int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					System.out.println("Duplicate character in String are: " + ch[j]);
					count++;
				}
			}
		}
		System.out.println("Duplicate character count: " + count);
	}

}
