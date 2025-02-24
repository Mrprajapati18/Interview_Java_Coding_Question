package com.NumberManupulationProgram;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Convert Fahreneit to Celsius.");
		
		double fahrenheit = Scanner.nextDouble();
		
		// convert fahrenheit to celsius
		
		double celsius = ((fahrenheit - 32)*5)/9;
		System.out.println(fahrenheit+ " Fahrenheit is equel to " +celsius+" celsius.");
        Scanner.close();
	}

}
