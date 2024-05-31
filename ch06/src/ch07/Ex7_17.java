package ch07;

public class Ex7_17 {
	Object iv = new Object() { // 조상이름을 대신쓴다. 조상또는 인터페이스
		void method() { // 해당 클래스에서 쓰고싶은 함수를 넣는다.
		}
	}; // 익명클래스
	static Object cv = new Object() {
		void method() {
		}
	}; // 익명클래스

	void myMethod() {
		Object lv = new Object() { // 익명클래스
			void method() {
			}
		};
	}

}
