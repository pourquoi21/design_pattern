package ch07;

public class Ex7_7 {

	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		FireEngine fe3 = (FireEngine) car; // 조상 -> 자손으로 형변환
		Car car2 = (Car) fe2; // 자손 -> 조상으로 형변환

		// 주의할점
		Car car3 = null; // null이어도 형변환에는 문제가 없지만
		FireEngine fe4 = (FireEngine) car3;
		fe4.water(); // 여기서 nullpointerexception나옴
		car3.drive();
		// 따라서 형변환을 할 때는 실제 인스턴스가 무엇인지가 중요하다.

		fe.water();
		car = fe; // car = (Car)fe;에서 형변환이 생략됨
		// car.water(); // 에러 : Car타입의 참조변수로는 water()호출불가
		fe2 = (FireEngine) car; // 조상타입 > 자손타입이므로 멤버수가 늘어남(형변환 생략불가)
		fe2.water();

	}

}
