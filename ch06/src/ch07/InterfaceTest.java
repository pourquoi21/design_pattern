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
	}

}
