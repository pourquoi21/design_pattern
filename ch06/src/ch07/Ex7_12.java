package ch07;

class Ex7_12 {
	public class InstanceInner {
		int iv = 100;
		static int cv = 100;
		final static int CONST = 100;
	}

	static class StaticInner {
		int iv = 200;
		static int cv = 200;
	}

	void myMethod() {
		class LocalInner {
			int iv = 300;
			static int cv = 300;
			final static int CONST = 300;
		}
	}
}
