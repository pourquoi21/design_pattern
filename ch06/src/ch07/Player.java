package ch07;

public abstract class Player { // 추상클래스(미완성 클래스)
	abstract void play(int pos); // 추상메서드(몸통{}이 없는 미완성 메서드)

	abstract void stop(); // 추상메서드

	public static void main(String[] args) {
		// 추상클래스는 다른 클래스 작성에 도움을 주기 위한 것이므로
		// 인스턴스 생성은 불가
		Player p = new Player(); // 에러: 추상클래스의 인스턴스 생성 불가
	}
}
