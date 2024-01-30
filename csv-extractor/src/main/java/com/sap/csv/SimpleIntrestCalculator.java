package com.sap.csv;

import java.math.BigDecimal;

public class SimpleIntrestCalculator {
	    BigDecimal principal;
	    BigDecimal interest;

	public SimpleIntrestCalculator(String principal, String interest) {
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
		
	}

	public BigDecimal calculateTotalValue(int noOfYears) {
	BigDecimal totalValue =	principal.add(principal).multiply(interest).multiply(new BigDecimal(noOfYears));
//	System.out.println(totalValue);
	return totalValue;
	}

}
