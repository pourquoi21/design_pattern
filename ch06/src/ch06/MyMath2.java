package ch06;

public class MyMath2 {
	long a, b; // this.a, this.b가 해당 iv의 진짜 이름.

	MyMath2(int a, int b) { // 생성자
		this.a = a; // lv와 iv 구분위해 this사용
		this.b = b;
	}

	long add() { // instance method
		return a + b; // iv 사용
	}

	static long add(long a, long b) { // static method
		return a + b; // iv 사용X, this 사용불가

		// 메서드가 종료될때까지가 long a와 long b의 유효범위(lv이므로)
	}
}
