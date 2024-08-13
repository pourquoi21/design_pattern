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
		// 자손은 조상보다 많은 멤버를 갖고있다.
		// 이렇게 타입 불일치하게 선언했을 때는 자손의 모든 멤버를 사용할 수 없을 텐데,
		// 다형성에 장점이 있는 이유는..?
	}
}
