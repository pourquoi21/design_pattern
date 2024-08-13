package ch07;

public class Ex7_13 {
	class InstanceInner { // iv와 같음
	}

	static class StaticInner {
	}

	static int sv = 100;
	int v = 100;

	InstanceInner iv = new InstanceInner(); // 인스턴스멤버끼리는 직접 접근 가능
	static StaticInner cv = new StaticInner(); // static멤버끼리는 직접 접근 가능

	static void staticMethod() { // static멤버는 인스턴스멤버에 직접 접근 불가
//		InstanceInner obj1 = new InstanceInner(); // 안됨
		StaticInner obj2 = new StaticInner();

		// 이렇게 써도 되지만 굳이 쓸 일은 없다..
		Ex7_13 outer = new Ex7_13(); // 인스턴스 클래스는 외부 클래스를 먼저 생성해야만 생성 가능
		InstanceInner obj1 = outer.new InstanceInner();
	}

	void instanceMethod() { // 인스턴스메서드는 인스턴스멤버와 static멤버 모두 접근 가능
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
//		LocalInner lv = new LocalInner(); // 지역 내부 클래스는 외부에서 접근할 수 없다.
	}

	void myMethod() {
		class LocalInner {
		}
		LocalInner lv = new LocalInner();
	}
}
