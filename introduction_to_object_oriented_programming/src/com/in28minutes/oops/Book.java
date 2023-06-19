package com.in28minutes.oops;

public class Book {
	private int noOfCopies;

	void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
		System.out.println(noOfCopies);
		System.out.println(this.noOfCopies);
	}

	public void increaseCopies(int howMuch) {
		this.noOfCopies = this.noOfCopies + howMuch;
	}

	public void decreaseCopies(int howMuch) {
		this.noOfCopies = this.noOfCopies - howMuch;
	}
}
