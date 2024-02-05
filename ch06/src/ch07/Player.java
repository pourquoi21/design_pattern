package ch07;

public abstract class Player { // 추상클래스(미완성 클래스)

	boolean pause; // 일시정지 상태를 저장하기 위한 변수
	int currentPos; // 현재 play되고 있는 위치를 저장하기 위한 변수

	Player() { // 추상클래스도 생성자가 필요하다.
		pause = false;
		currentPos = 0;
	}

	// 아래의 두 추상메서드는 몸통이 없기 때문에
	// 반드시 자식클래스에서 제대로 구현해주어야 한다.
	// abstract를 붙임으로써 구현을 강제한다는 점에서
	// 필수적인 부분을 강조하는 것으로도 볼 수 있음.
	abstract void play(int pos); // 추상메서드(몸통{}이 없는 미완성 메서드)

	abstract void stop(); // 추상메서드

	public static void main(String[] args) {
		// 추상클래스는 다른 클래스 작성에 도움을 주기 위한 것이므로
		// 인스턴스 생성은 불가
		Player p = new Player(); // 에러: 추상클래스의 인스턴스 생성 불가

		AudioPlayer ap = new AudioPlayer(); // 이건 가능
		Player ap2 = new AudioPlayer(); // 이것도 가능(자손이니까), 조상은 변수만 제공하고있는 것
	}

	void play() {
		play(currentPos); // 추상메서드를 사용할 수 있다.
		// 어차피 객체 생성한 후에 호출할 수 있기 때문에 여기에 선언해주는건 상관없음
	}
}

// 상속을 통해 추상메서드를 완성해야 인스턴스 생성 가능
class AudioPlayer extends Player { // 완성된 설계도
	void play(int pos) {
	}; // 추상메서드를 구현했으므로 더이상 추상메서드가 아니다.

	void stop() {
	}; // 추상메서드를 구현
}

// 상속받은 메서드 중 메서드 하나만 구현할 것이라면 반드시 abstract 붙여줘야 한다.
abstract class AbstractPlayer extends Player {
	void play(int pos) {
	}
}