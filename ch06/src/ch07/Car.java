package ch07;

public class Car {
	String color;
	int door;

	void drive() { // 운전하는 기능
		System.out.println("Drive, Brrrr");
	}

	void stop() {
		System.out.println("STOP!!!");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("Water!!!");
	}
}
