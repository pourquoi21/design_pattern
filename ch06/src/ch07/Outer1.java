package ch07;

public class Outer1 {
	private int outerIv = 0;
	static int outerCv = 0;

	class InstanceInner1 {
		int iiv = outerIv; // 외부 클래스의 private멤버에도 접근 가능
		int iiv2 = outerCv;
	}

	static class StaticInner {
		int siv = outerIv; // static 클래스는 외부클래서의 인스턴스멤버에 접근불가능
		static int scv = outerCv; // 그러나 외부클래스의 스태틱멤버에는 접근가능
	}
}
