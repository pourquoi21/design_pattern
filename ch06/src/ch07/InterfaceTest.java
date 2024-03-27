package ch07;

class A {
	public void method(B b) {
		b.method();
	}
}

class B {
	public void method() {
		System.out.println("B클래스의 메서드");
	}
}

class C1 {
	public void method() {

	}
}

public class InterfaceTest {

	public static void main(String[] args) {
		A a = new A();
		a.method(new B()); // A가 B를 사용(의존)

		// C클래스를 인자로 쓰고 싶으면
//		a.method(new C());

		// 이렇게 인자만 바꾸는 게 아니라
//		class A의 method선언부에도 바꿔줘야한다.
	}

}
