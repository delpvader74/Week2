package com.coderscampus.week2;

import java.util.Scanner;

public class Week2Example {

	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type a number between 50 and 300");
		//String userInput = scanner.nextLine();//	
		
		//System.out.println("You typed in: " + userInput);//
		String input = scanner.nextLine();

		Integer convertedInput = Integer.parseInt(input);
	
		if (convertedInput < 50) {
			System.out.println("No");
		} else if (convertedInput > 300) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		
		}
	}
}
