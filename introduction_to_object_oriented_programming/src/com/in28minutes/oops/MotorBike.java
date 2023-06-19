package com.in28minutes.oops;

public class MotorBike {
	private int speed; // member variable

	void start() {
		System.out.println("vrooooom!!");
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed > 0)
			this.speed = speed;
	}

	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);
	}

	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
	}

//	void setSpeed(int speed) { // local variable
//		this.speed = speed;
//	}
//
//	int getSpeed() {
//		return this.speed;
//	}

}
