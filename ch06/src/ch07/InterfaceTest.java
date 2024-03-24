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

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
