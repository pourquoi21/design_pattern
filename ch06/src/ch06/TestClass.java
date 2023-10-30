package ch06;

public class TestClass {
	// static메서드는 intance메서드를 호출할 수 없다.

	void instanceMethod() {
	} // 인스턴스메서드

	static void staticMethod() {
	} // static메서드

	void instanceMethod2() { // 인스턴스메서드
		instanceMethod();
		staticMethod();
	}

	static void staticMethod2() {
//		instanceMethod(); // 에러: 인스턴스메서드를 호출할 수 없다
		staticMethod(); // static메서드는 호출할 수 있다.
	}
}
