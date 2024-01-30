package com.sap.csv;

public class SumOfSquares {
	
	public int caluclateSumOfSquares(int n) {
		
		if (n<=0) {
			return -1;
		}
		int sum = 0;
		
		for (int i=1; i<=n ; i++) {
			
			sum += i*i;
			
		} 
		
		System.out.println(sum);
		
		System.out.println(1900%4);
		
		return sum;
	}
	
}
