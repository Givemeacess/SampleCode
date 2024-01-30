package com.sap.csv;

public class MyNumber {

	private int inputNumber;

	public MyNumber(int inputNumber) {

		this.inputNumber = inputNumber;

		// TODO Auto-generated constructor stub
	}

	public boolean isPrime() {
		for (int i = 2; i <= inputNumber-1; i++) {
			if(inputNumber%i == 0) {
				return false;
			}
		}

		return true;
	}

	public int sumUpToN() {
		int result = 0;
		for (int i = 1; i <= inputNumber; i++) {
			result +=i;
		}
		return result;
	}

	public int sumOfDivisors() {
		int sum = 0;
		for (int i = 2; i < inputNumber; i++) {

			if (inputNumber % i == 0) {
				sum +=i;
			}
		}
		return sum;
	}

	public void printAtraingle() {

		for (int i = 1; i < inputNumber; i++) {
			
			for(int j=1; j<=i; j++) {
				System.out.print(j + " ");
			}
				System.out.println();
			
		}

	}

}
