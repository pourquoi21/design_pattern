package ch07;

public class Ex7_15 {
	public static void main(String[] args) {
		// 외부 클래스의 바깥에서 해당 외부 클래스의 내부 클래스 사용하는 방법
		Outer2 oc = new Outer2(); // 외부 클래스의 인스턴스를 먼저 생성해야 인스턴스 클래스의
		Outer2.InstanceInner ii = oc.new InstanceInner(); // 인스턴스를 생성 가능
	}
}

class Outer2 {
	class InstanceInner {
		int iv = 100;
	}
}