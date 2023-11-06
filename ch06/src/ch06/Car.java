package ch06;

public class Car {
	String color;
	String gearType;
	int door;

	Car() {
//		color = "white";
//		gearType = "auto";
//		door = 4;

		// 위의 코드를 아래와 같이 중복제거

		this("white", "auto", 4);

	}// 기본 생성자

	Car(String color, String gearType, int door) {

		// 참조변수 this는 lv와 iv를 구별할 때 사용할 수 있다.
		this.color = color;
		this.gearType = gearType;
		this.door = door;

	}
}
