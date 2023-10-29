package ch06;

public class MyMathTest2 {

	public static void main(String[] args) {
		System.out.println(MyMath2.add(200L, 100L)); // 객체생성없이 클래스명을 가지고 호출

		MyMath2 mm = new MyMath2();
		mm.a = 200L;
		mm.b = 100L;
		System.out.println(mm.add());
	}

}
