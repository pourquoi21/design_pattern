package ch07;

class MyPoint3 {
	int x;
	int y;

//	String getLocation() {
//		return "x: " + x + ", y: " + y;
//	}

	MyPoint3(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// Object 클래스의 toString을 오버라이딩
	public String toString() {
		return "x: " + x + ", y: " + y;
	}

}

//class MyPoint3D extends MyPoint3 {
//	int z;
//
//	// 조상의 getLocation()을 오버라이딩
//	String getLocation() {
//		return "x: " + x + ", y: " + y + ", z: " + z;
//	}
//}

public class OverrideTest {
	public static void main(String[] args) {
//		MyPoint3D p = new MyPoint3D();
//		p.x = 3;
//		p.y = 5;
//		p.z = 7;
//		System.out.println(p.getLocation());

//		MyPoint3 p = new MyPoint3();
//		p.x = 3;
//		p.y = 5;
//		System.out.println("p.x = " + p.x);
//		System.out.println("p.y = " + p.y);

		// 위의 코드가 아래처럼 바뀌었다(생성자, toString 오버라이딩 이용)
		MyPoint3 p = new MyPoint3(3, 5);

		System.out.println(p.toString());
		System.out.println(p);
	}
}
