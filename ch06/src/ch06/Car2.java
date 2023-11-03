package ch06;

public class Car2 {
	String color;
	String gearType;
	int door;

	// 생성자에서 같은 클래스의 다른 생성자를 호출할 때 this를 쓴다.
	// this를 쓸 때는 해당 생성자메서드 내의 첫번째 줄에 써야 한다.

	Car2() {
		this("white", "auto", 4);
	}

	Car2(String color) {
		this(color, "auto", 4);
	}

	Car2(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}

}
