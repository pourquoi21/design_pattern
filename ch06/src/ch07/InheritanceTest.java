package ch07;

class Point { // (extends Object) : Object는 모든 class의 조상
	int x;
	int y;
}

//class Circle extends Point { // 상속
//	int r;
//}

class Circle { // 포함
	Point p = new Point(); // 참조변수의 초기화: Point의 저장공간을 만들어주기
	int r;

	Circle() { // 만약 위에서 초기화를 안해줬으면 이렇게 생성자 이용해서 해줘야된다.
		p = new Point();
	}
}

public class InheritanceTest {

	public static void main(String[] args) {
		Circle c = new Circle();
//		c.x = 1;
//		c.y = 2;

//		c.p.x = 1;
//		c.p.y = 2;
//		c.r = 3;
//
//		System.out.println("c.p.x = " + c.p.x);
//		System.out.println("c.p.y = " + c.p.y);
//		System.out.println("c.r = " + c.r);

		System.out.println(c.toString()); // Object 클래스가 가지고 있는 메서드
		System.out.println(c); // println에 참조변수가 들어오면 알아서 toString 해줌
	}

}
