package ch07;

class Ex7_12 {

	class InstanceInner {
		int iv = 100;
		static int cv = 100; // static class가 아닌데 왜 static 변수 쓰는게 가능하지?
		// 자바 버전이 업그레이드되면서 바뀌었다고 함.
		final static int CONST = 100; // final static은 상수이기에 허용

	}

	static class StaticInner {
		int iv = 200;
		static int cv = 200;
	}

	void myMethod() {
		class LocalInner {
			int iv = 300;
			static int cv = 300;
			final static int CONST = 300; // 상수는 허용
		}

		int i = LocalInner.CONST; // 이건 되지만
	}

	public static void main(String[] args) {
		System.out.println(InstanceInner.cv);
		System.out.println(StaticInner.cv);
		// localInner의 변수를 이렇게 외부에서 쓸 수는 없다.
		// 왜냐하면 localInner는 method안에서만 사용되고 사라지기 때문
		System.out.println(LocalInner.CONST);

	}
}
