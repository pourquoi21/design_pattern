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

	Car(String c, String g, int d) {
		color = c;
		gearType = g;
		door = d;
	}
}
