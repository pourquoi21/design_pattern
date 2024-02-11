package ch07;

abstract class Player1 { // 추상메서드 가지고있다면 추상클래스로(미완성 메서드)
//	void play(int pos); // 일반 메서드로 지정했는데 몸통이 없으니까 에러난다.
	abstract void play(int pos); // 이렇게 해도 에러난다: 클래스에 abstract안붙여서

	abstract void stop(); // 몸통없는 클래스 만들고 싶으면 abstract로!
}

public class PlayerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
