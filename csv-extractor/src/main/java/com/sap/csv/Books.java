package com.sap.csv;

public class Books {
	
	private int noOfCopies;

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}
	
	public void increaseNoOfCopies(int copies) {
		this.noOfCopies = this.noOfCopies+copies;
	}
	
	public void decreaseNoOfCopes(int copies) {
		this.noOfCopies = this.noOfCopies-copies;
	}
	
	}


