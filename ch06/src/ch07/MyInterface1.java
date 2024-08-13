package ch07;

public interface MyInterface1 {
	void method();
	// 일반적인 추상 메서드를 인터페이스에 추가하면
	// 해당 인터페이스를 구현한 곳에서도 해당 메서드를 추가해야하는 문제가 생긴다.

	// 따라서 구현부가 있는 메서드를 추가할 수 있게 허용하는데
	// 이것이 default메서드이다.
	default void newMethod() {

	}

	// 여러 인터페이스 간 디폴트 메서드간 충돌이 일어날 경우
	// 오버라이딩해서 수정하는 방법이 있음

	// 디폴트 메서드와 조상클래스의 메서드간 충돌이 있을 경우
	// 조상클래스의 메서드가 상속되고 디폴트메서드는 무시된다.
}
