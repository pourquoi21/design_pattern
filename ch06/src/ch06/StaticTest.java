package ch06;

public class StaticTest {
	// 간단초기화(명시적 초기화)
	static int width = 200; // 클래스 변수(static 변수)
	static int height = 120; // 클래스 변수(static 변수)

	static { // 클래스 초기화 블럭
		// static변수의 복잡한 초기화 수행
	}

	static int max(int a, int b) { // 클래스 메서드(static메서드)
		// static메서드에서는 instance 멤버를 사용할 수 없음
		return a > b ? a : b;
	}
}
