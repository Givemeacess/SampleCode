package com.sap.csv;

public class NumberUtils {

	public static void main(String[] args) {
		
		System.err.println(getSumOfDigits(2));

	}
	
	public static int getSumOfDigits(int number) {
		
		if(number < 0) {
			return -1;
		}
		
		if(number == 0) {
			return 0;
		}
		
		int total = 0;
		
		for(int i = 0; i< number ; i++) {
			
			total += number%10;
			
			number/=10;
		}
		
		return total;
	}

}
