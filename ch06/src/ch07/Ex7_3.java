package ch07;

public class Ex7_3 {

	public static void main(String[] args) {
		Child2 c = new Child2();
		c.method();
	}

}

class Parent2 {
	// Child2에 x가 따로 없으므로 Parent2의 x가
	// Child2의 this도 되고 super도 된다.
	int x = 10;
}

class Child2 extends Parent2 {
	void method() {
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
	}
}