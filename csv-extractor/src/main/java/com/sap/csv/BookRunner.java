package com.sap.csv;

public class BookRunner {
	
	public static void main (String args[]) {
		
		Books artOfComputerProgramming = new Books();
		Books cleanCode= new Books();
		Books effectiveJava = new Books();
		
		artOfComputerProgramming.setNoOfCopies(100);
		System.out.println(artOfComputerProgramming.getNoOfCopies());
		cleanCode.setNoOfCopies(500);
		System.out.println(cleanCode.getNoOfCopies());
		effectiveJava.setNoOfCopies(600);
		System.out.println(effectiveJava.getNoOfCopies());
		
		artOfComputerProgramming.increaseNoOfCopies(100);
		System.out.println(artOfComputerProgramming.getNoOfCopies());
		cleanCode.decreaseNoOfCopes(100);
		System.out.println(cleanCode.getNoOfCopies());
	}

}
