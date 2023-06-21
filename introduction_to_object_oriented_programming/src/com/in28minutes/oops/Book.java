package com.in28minutes.oops;

public class Book {
	private int noOfCopies;

	Book(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
		System.out.println(noOfCopies);
		System.out.println(this.noOfCopies);
	}

	public void increaseCopies(int howMuch) {
		setNoOfCopies(this.noOfCopies + howMuch);
	}

	public void decreaseCopies(int howMuch) {
		setNoOfCopies(this.noOfCopies - howMuch);
	}
}
