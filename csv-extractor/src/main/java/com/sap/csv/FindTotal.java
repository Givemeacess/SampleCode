package com.sap.csv;

public class FindTotal {
	
	public static void main(String[] args) {
		
		System.out.println(getNoOfDigits(0000006));
		
	}
	
	public static int getNoOfDigits(int number) {
		
		if(number < 0) {
			return -1;
		}
		 int sum =0;
		 for(int i=1; i<number; i++) {
			 number= number/10;
			 sum++;
		 }
		
		return sum;
		
	}

}
