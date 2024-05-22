package ch07;

public class Ex7_15 {
	public static void main(String[] args) {
		// 외부 클래스의 바깥에서 해당 외부 클래스의 내부 클래스 사용하는 방법
		Outer2 oc = new Outer2(); // 외부 클래스의 인스턴스를 먼저 생성해야 인스턴스 클래스의
		Outer2.InstanceInner ii = oc.new InstanceInner(); // 인스턴스를 생성 가능
	}
}

class Outer2 {
	// 이것도 인스턴스멤버이므로 객체를 만들어 쓴다고 이해하면 된다.
	class InstanceInner {
		int iv = 100;

		// static은 바로 쓸 수 있음
	}
}