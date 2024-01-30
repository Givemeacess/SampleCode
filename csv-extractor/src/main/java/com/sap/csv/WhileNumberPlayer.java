package com.sap.csv;

public class WhileNumberPlayer {

	private int number;

	public WhileNumberPlayer(int number) {
		// TODO Auto-generated constructor stub
		this.number = number;
	}

	public void printSquaresUptoLimit() {
		 int i =1;;
		while(i*i < number) {
			System.out.print(i*i+" ");
			i++;
			
		}
		
	}

	public void printCubesUptoLimit() {
		int i =1;
		while(i*i*i < number) {
			System.out.print(i*i*i+" ");
			i++;
		}
	}

}
