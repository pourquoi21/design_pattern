package ch06;

public class Scope {

	static int cv;
	int iv;

	static int a;
	static int b;

	public static void main(String[] args) {
		System.out.println("add2 first: " + add2());
		int lv;
		a = 2;
		b = 3;
		System.out.println("Scope.add2() : " + Scope.add2());

		System.out.println("a of main : " + a);
		System.out.println("add2 second: " + add2());

		System.out.println("Scope.add3(a, b) : " + Scope.add3(a, b));
		Scope s = new Scope();

		s.a = 3;
		s.b = 4;

		System.out.println("add2 third: " + add2());
		System.out.println(s.add(a, b));
		System.out.println(add2()); // s의 a와 b를 주석처리했으므로 0나옴

		System.out.println("a of main : " + a);
		System.out.println("before change(s) : a = " + a);
		change(s);
		System.out.println("after change(s) : s.a = " + s.a);
		System.out.println("after change(s) : a = " + a);
		System.out.println("after change(s) add = " + s.add(a, b));

		change2(a);
		System.out.println("after change2(s) : a = " + a);
	}

	String add(int a, int b) {
		int c = a + b;
		return Integer.toString(c); // 두 가지 방법 중 하나로 int > String 가능
//        return String.valueOf(c);
	}

	static String add2() {
		int c = a + b;
		return String.valueOf(c);
	}

	static int add3(int a, int b) {
		int c = a + b;
		return c;
	}

	static void change(Scope s) {
		s.a = 2000;
		System.out.println("change() : a = " + s.a);

	}

	static void change2(int a) {
		a = 3000;
		System.out.println("change2() : a = " + a);
	}

}
