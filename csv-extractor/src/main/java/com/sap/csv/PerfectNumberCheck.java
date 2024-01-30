package com.sap.csv;

public class PerfectNumberCheck {

	public boolean isPerfectNumber(int number) {
		if (number <= 0) {
			System.out.println("false");
			return false;
		}

		int sumOfDivisors = 0;

		for (int i = 1; i < number; i++) {

			if (number % i == 0) {
				sumOfDivisors += i;
			}
		}

		if (sumOfDivisors == number) {
			System.out.println("true");
			return true;
		}

		System.out.println("false");
		return false;
	}

}
