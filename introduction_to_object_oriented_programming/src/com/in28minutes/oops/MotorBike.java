package com.in28minutes.oops;

public class MotorBike {
	private int speed; // member variable

	void setSpeed(int speed) { // local variable
		this.speed = speed;
		System.out.println(speed);
		System.out.println(this.speed);
	}

	void start() {
		System.out.println("vrooooom!!");
	}
}
