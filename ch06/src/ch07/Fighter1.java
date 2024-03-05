package ch07;

public class Fighter1 extends Unit implements Fightable1 {
	// 인터페이스에 정의된 추상메서드를 모두 구현해야 한다.
	public void move(int x, int y) {
	};

	public void attack(Unit u) {
	};

	// 일부만 구현하는 경우 클래스 앞에 abstract 붙여야함.
}

interface Fightable1 {
	void move(int x, int y);

	void attack(Unit u);
}