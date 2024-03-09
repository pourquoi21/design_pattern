package ch07;

public class Fighter1 extends Unit implements Fightable1 {
	// 클래스와 인터페이스 모두 상속했음
	// 인터페이스에 정의된 추상메서드를 모두 구현해야 한다.
	public void move(int x, int y) {
	};

	public void attack(Unit u) {
	};

	public static void main(String[] args) {
		Fightable1 f = new Fighter1();
		// 인터페이스일 경우에도 조상클래스로 자손객체 가리킬수있다.
		// 이럴 경우 인터페이스가 구현한 메서드만 쓸 수있다.
	}
	// 일부만 구현하는 경우 클래스 앞에 abstract 붙여야함.

	@Override
	public void attack(Fightable1 f) {
		// TODO Auto-generated method stub

	}
}

interface Fightable1 {
	void move(int x, int y);

//	void attack(Unit u);
	void attack(Fightable1 f);
	// 인터페이스 타입 매개변수는 인터페이스를 구혀난 클래스의 객체만 가능
}
