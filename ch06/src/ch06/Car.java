package ch06;

public class Car {

	// 명시적 초기화
	String color;
	String gearType;
	int door = 4; // 기본형 변수의 초기화
	Engine e = new Engine(); // 참조형 변수의 초기화

	Car() {
//		color = "white";
//		gearType = "auto";
//		door = 4;

		// 위의 코드를 아래와 같이 중복제거

		this("white", "auto", 4);

	}// 기본 생성자

	Car(String color, String gearType, int door) {

		// 인스턴스 자신을 가리키는 this
		// 인스턴스 메서드(생성자 포함)에서 사용가능
		// 참조변수 this는 lv와 iv를 구별할 때 사용할 수 있다.
		this.color = color;
		this.gearType = gearType;
		this.door = door;

	}

	static class Engine {

	}
}
