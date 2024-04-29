package ch07;

class AAA {
	int i = 100;
	BBB b = new BBB();

	class BBB { // AAA의 내부클래스 BBB
		void method() {
			System.out.println(i); // 객체생성없이 외부클래스의 멤버에 접근가능
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
