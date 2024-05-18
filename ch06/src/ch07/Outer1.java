package ch07;

public class Outer1 {
	private int outerIv = 0;
	static int outerCv = 0;

	class InstanceInner1 {
		int iiv = outerIv; // 외부 클래스의 private멤버에도 접근 가능
		int iiv2 = outerCv;
	}

	static class StaticInner {
		int siv = outerIv; // static 클래스는 외부클래스의 인스턴스멤버에 접근불가능
		static int scv = outerCv; // 그러나 외부클래스의 스태틱멤버에는 접근가능
	}

	void myMethod() {
		// 지역내부클래스에서의 변수와 상수
		int lv = 0;
		final int LV = 0; // JDK1.8부터 final 생략가능

		class LocalInner1 {
			int liv = outerIv;
			int liv2 = outerCv;

			// 외부클래스의 지역변수는 final이 붙은 변수(상수)만 접근가능
			int liv3 = lv; // 에러였지만 JDK1.8부터 에러아님
			int liv4 = LV;
		}
	}
}
