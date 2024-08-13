package ch07;

//class A {
//	public void method(B b) {
//		b.method();
//	}
//}

// 선언과 구현을 분리한 후의 인자
class A {
	public void method(I i) { // interface I를 구현한 녀석만 들어올 수 있음.
		i.method();
	}
}

//class B {
//	public void method() {
//		System.out.println("B클래스의 메서드");
//	}
//}

// B클래스의 선언과 구현을 분리
interface I {
	public void method();
}

class B implements I {
	public void method() {
		System.out.println("B클래스의 메서드");
	}
}

class C1 implements I {
	public void method() {
		System.out.println("C클래스의 메서드");
	}
}

public class InterfaceTest {

	public static void main(String[] args) {
		A a = new A();
		a.method(new B()); // A가 B를 사용(의존)
		a.method(new C1()); // A가 C1도 사용할 수 있다.

		// C클래스를 인자로 쓰고 싶으면
//		a.method(new C());

		// 이렇게 인자만 바꾸는 게 아니라
//		class A의 method선언부에도 바꿔줘야한다.
	}

}
