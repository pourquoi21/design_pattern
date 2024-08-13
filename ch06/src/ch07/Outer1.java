package ch07;

public class Outer1 {
	private int outerIv = 0;
	static int outerCv = 0;

	class InstanceInner1 {
		int iiv = outerIv; // 1. 외부 클래스의 private멤버에도 접근 가능
		int iiv2 = outerCv;
	}

	static class StaticInner {
		int siv = outerIv; // static 클래스는 외부클래스의 인스턴스멤버에 접근불가능
		static int scv = outerCv; // 그러나 외부클래스의 스태틱멤버에는 접근가능
	}

	void myMethod() {
		// 지역내부클래스에서의 변수와 상수
		int lv = 0; // 지역변수는 메서드 종료와 함께 소멸됨
		// 내부 클래스의 객체가 지역변수보다 더 오래 존재할 수도 있으므로
		// 원래는 지역변수를 내부클래스에서 자유롭게 사용할수 없음
		final int LV = 0; // JDK1.8부터 final 생략가능
		// final없는데(변수인데) 값이 안바뀌면 상수로 간주

		lv = 3; // 이렇게 값을 바꾸면 상수가 아니므로 에러남

		class LocalInner1 { // 2. 지역 내부클래스를 감싸고 있는 메서드의 상수만 사용 가능.
			int liv = outerIv;
			int liv2 = outerCv;

			// 외부클래스의 지역변수는 final이 붙은 변수(상수)만 접근가능
			int liv3 = lv; // 에러였지만 JDK1.8부터 에러아님
			// 위에서 lv = 3과 같이 값을 바꿔버리니 에러남
			int liv4 = LV;
		}
	}
}
