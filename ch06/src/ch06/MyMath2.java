package ch06;

public class MyMath2 {
	long a, b;

	long add() { // instance method
		return a + b; // iv 사용
	}

	static long add(long a, long b) { // static method
		return a + b; // iv 사용X

		// 메서드가 종료될때까지가 long a와 long b의 유효범위(lv이므로)
	}
}
