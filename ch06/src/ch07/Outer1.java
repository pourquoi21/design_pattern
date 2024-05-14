package ch07;

public class Outer1 {
	private int outerIv = 0;
	static int outerCv = 0;

	class InstanceInner1 {
		int iiv = outerIv; // 외부 클래스의 private멤버에도 접근 가능
		int iiv2 = outerCv;
	}
}
