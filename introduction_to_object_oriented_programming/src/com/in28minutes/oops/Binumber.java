package com.in28minutes.oops;

public class Binumber {
	private int firstNumber;
	private int secondNumber;

	Binumber() {
		this(2, 3);
	}

	Binumber(int firstNumber, int secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;

	}

	public int add() {
		return (firstNumber + secondNumber);
	}

	public int multiply() {
		return (firstNumber * secondNumber);
	}

	public void twice() {
		this.firstNumber *= 2;
		this.secondNumber *= 2;
	}

	public int getNumber1() {
		return firstNumber;
	}

	public int getNumber2() {
		return secondNumber;
	}

}
