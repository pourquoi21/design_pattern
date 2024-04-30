package ch07;

class AAA {
	int i = 100;
	BBB b = new BBB();

	class BBB { // AAA의 내부클래스 BBB
		void method() {
			System.out.println(i); // 객체생성없이 외부클래스의 멤버에 접근가능
		}
	}

	static class StaticBBB {
		// 외부클래스의 static멤버처럼 다루어짐.
		// static메서드에 사용될 목적으로 선언된다.
	}

	void AAAMethod() {
		class LocalInner {
			// 이렇게 메서드내에서만 쓰는 내부클래스도 있을 수 있다.
			// local variable처럼 변수선언하듯 내부클래스도 선언이 가능한 것임
			// 이는 선언된 영역 내부에서만 사용가능.
		}
	}
}

// BBB 클래스가 AAA의 외부에 있으면 AAA의 멤버를 사용하기 위해
// 새로운 인스턴스 선언을 해주어야 하는 불편함이 있다.
//class BBB {
//	void method() {
//		AAA a = new AAA();
//		System.out.println(a.i);
//	}
//}

class CCC {
//	BBB b = new BBB();
}

public class InnerTest {

	public static void main(String[] args) {
		// BBB가 외부에 있을 때 BBB를 통해 AAA의 멤버를 부르는 방법
//		BBB b = new BBB();
//		b.method();

		AAA a = new AAA();
		System.out.println(a.b);
		a.b.method();

	}

}
