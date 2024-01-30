package com.sap.csv;

public class LeapYearCheck{
	
	public boolean isLeapYear(int year) {
		if(year < 1) {
			System.out.println("false");
			return false;	
		}
		
		if (year%4 !=0) {
			System.out.println("false");
			return false;
		} if(year%100 !=0) {
			System.out.println("true");
			return true;
		}
		if (year%400 !=0) {
				System.out.println("false");
				return false;
			}
		return true;
		
	}

}
