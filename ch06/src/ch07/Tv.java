package ch07;

public class Tv {
	boolean power;
	int channel;

	void power() {power = !power}

	void channelUp() {
		++channel;
	}

	void channelDown() {
		--channel;
	}
}

class SmartTv extends Tv {
	String text;

	void caption() {
	}

	public static void main(String[] args) {
		Tv t = new SmartTv(); // 다형성: 타입 불일치
	}
}
