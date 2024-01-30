package com.sap.csv;

public class Sum {

	public static void main(String[] args) {
		
		System.out.println(factorial(10));

	}

	public static int factorial(int number) {

		
		int sum =1;
		
		for(int i=2; i< number; i++) {
			
			sum *=i;
			System.out.println(sum);
			
		}

		return sum;
	}

}
