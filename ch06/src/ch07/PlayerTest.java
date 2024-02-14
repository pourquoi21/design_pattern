package ch07;

abstract class Player1 { // 추상메서드 가지고있다면 추상클래스로(미완성 클래스)
//	void play(int pos); // 일반 메서드로 지정했는데 몸통이 없으니까 에러난다.
	abstract void play(int pos); // 이렇게 해도 에러난다: 클래스에 abstract안붙여서

	abstract void stop(); // 몸통없는 클래스 만들고 싶으면 abstract로!(선언부만 있고 구현부{}가 없는 메서드)
}

// 추상클래스는 상속을 통해 완성해야 객체생성 가능
class AudioPlayer1 extends Player1 {

	void play(int pos) {
		System.out.println(pos + " 위치부터 play합니다.");
	}

	void stop() {
		System.out.println("재생을 멈춥니다.");
	}

}

public class PlayerTest {

	public static void main(String[] args) {
//		Player1 p = new Player1(); // 추상 클래스의 객체를 생성: 오류남(미완성 클래스라 객체 만들수 없음)
//		AudioPlayer1 ap = new AudioPlayer1();
		Player1 ap = new AudioPlayer1(); // 부모 타입으로 만들어도 가능..(다형성) 실제 호출되는건 구현된 객체이므로
		ap.play(100);
		ap.stop();
	}

}
