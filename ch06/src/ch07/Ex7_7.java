package ch07;

public class Ex7_7 {

	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;

		fe.water();
		car = fe; // car = (Car)fe;에서 형변환이 생략됨
		// car.water(); // 에러 : Car타입의 참조변수로는 water()호출불가
		fe2 = (FireEngine) car; // 조상타입 > 자손타입이므로 멤버수가 늘어남(형변환 생략불가)
		fe2.water();

	}

}
