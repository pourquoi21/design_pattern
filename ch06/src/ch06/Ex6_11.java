package ch06;

class Data_1 {
	int value;

	// 생성자가 하나도 없어서 compiler가 알아서 추가해줌
}

class Data_2 {
	int value;

	Data_2() {
		value = 0;
	}

	Data_2(int x) {
		value = x;
	}
}

public class Ex6_11 {

	public static void main(String[] args) {
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2(); // 인자없는 생성자가 없으면 compile error!
	}

}
