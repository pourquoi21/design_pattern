package ch07;

public class Ex7_7 {

	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
//		FireEngine fe2 = null;
//		FireEngine fe3 = (FireEngine) car; // 조상 -> 자손으로 형변환
//		Car car2 = (Car) fe2; // 자손 -> 조상으로 형변환

		// 주의할점
//		Car car3 = null; // null이어도 형변환에는 문제가 없지만
//		FireEngine fe4 = (FireEngine) car3;
//		fe4.water(); // 여기서 nullpointerexception나옴
//		car3.drive();
//		// 따라서 형변환을 할 때는 실제 인스턴스가 무엇인지가 중요하다.

//		fe.water();
//		car = fe; // car = (Car)fe;에서 형변환이 생략됨
//		// car.water(); // 에러 : Car타입의 참조변수로는 water()호출불가
//		fe2 = (FireEngine) car; // 조상타입 > 자손타입이므로 멤버수가 늘어남(형변환 생략불가)
//		fe2.water();

//		Car c = new Car();
//		FireEngine fe5 = (FireEngine) c;
//		fe5.water(); // 컴파일은 되지만 형변환 에러(런타임에러) classCastException 발생
		// 조상 -> 자손은 안되는 것 같다(멤버수가 늘어날때..)
		// 원래 car 인스턴스였기에 water()라는 멤버가 없으므로 안된다.
		doWork(car);
		doWork2(fe);
	}

	static void doWork(Car c) {
		if (c instanceof FireEngine) { // 형변환이 가능한지 확인
			FireEngine fe = (FireEngine) c; // 형변환
			fe.water();
		}
	}

	static void doWork2(FireEngine fe) {
		if (fe instanceof Car) { // 형변환이 가능한지 확인
			Car c = (Car) fe; // 형변환
			fe.stop();
		}
	}

}
