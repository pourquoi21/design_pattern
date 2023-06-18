package com.in28minutes.oops;

public class MotorBike {
	private int speed; // member variable

//	void setSpeed(int speed) { // local variable
//		this.speed = speed;
//	}
//
//	int getSpeed() {
//		return this.speed;
//	}

	void start() {
		System.out.println("vrooooom!!");
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
