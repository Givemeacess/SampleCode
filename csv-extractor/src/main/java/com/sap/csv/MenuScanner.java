package com.sap.csv;

import java.util.Scanner;

public class MenuScanner {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number1");
		int number1 = scanner.nextInt();
		System.out.println("you have Entered number - "+ number1);
		
		
		System.out.println("Enter Number2");
		int number2 = scanner.nextInt();
		System.out.println("you have Entered number - "+ number2);
		
		System.out.println("1 - ADD"+"\n"+"2 - Subtract"+"\n"+"3 - Multiply"+"\n"+"3 - Divide" );
		System.out.println("Choose your operation");
		int numberSelected = scanner.nextInt();
		System.out.println("you have Choose  - "+ numberSelected);
		
		performOperationUsingNestedIfElse(number1, number2, numberSelected);
		
		
	}

	private static void performOperationUsingNestedIfElse(int number1, int number2, int numberSelected) {
		
		switch(numberSelected) {
		case 1: System.out.println("Result =" + (number1 + number2));
		break;
		case 2: System.out.println("Result =" + (number1 - number2));
		break;
		case 3: System.out.println("Result =" + (number1 * number2));
		break;
		case 4: System.out.println("Result =" + (number1 / number2));
		break;
		default:System.out.println("invalid Operation");
		break;
			
		}
	}
	
}
