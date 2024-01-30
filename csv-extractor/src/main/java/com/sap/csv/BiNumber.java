package com.sap.csv;

public class BiNumber {
	
	private int number1=0;
	private int number2=0;
	
	
	
	public int getNumber1() {
		System.out.println(number1);
		
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public int getNumber2() {
		System.out.println(number2);
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	public BiNumber(int number1 , int number2) {
		this.number1 = number1;
		this.number2 = number2;
		
	}
	
	public void add() {
		int sum = this.number1+this.number2;
		
		System.out.println(sum);
	}
	
	public void multiply() {
		int  multi = this.number1*this.number2;
		System.out.println(multi);
	}


	public void Double() {
		this.number1 *=2;
		this.number2 *=2;
		
		
	}
	

	
}
