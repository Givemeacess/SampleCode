package com.sap.csv;

public class NumberUtil {

	
	public static void main(String[] args) {
		
		System.out.println(reverseNumber(1234));
		
	}
	
	public static int reverseNumber(int number) {
		
		if(number<0) {
			return -1;
		}
		
		if(number == 0) {
			return 0;
		}
		
		int reverseNumberValue = 0;
		
		while(number > 0) {
			int lastDigit = number%10;
			reverseNumberValue = reverseNumberValue*10+lastDigit;
			number = number/10;
		}
		return reverseNumberValue;
	}
}
