package com.sap.csv;

public class Dimensions {
	
	private int feet;
	private int inches;
	
	
	public int getFeet() {
		return feet;
	}
	public void setFeet(int feet) {
		this.feet = feet;
	}
	public int getInches() {
		return inches;
	}
	public void setInches(int inches) {
		this.inches = inches;
	}
	
	public Dimensions(int inches) {
		
		if (inches<0) {
			setFeet(-1);
			setInches(-1);
		}else {
			setInches(inches%12);
			setFeet(inches/12);
		}
		
	}
	

}
