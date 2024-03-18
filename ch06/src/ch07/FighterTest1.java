package ch07;

abstract class Unit1 {
	int x, y;

	// abstract
	abstract void move(int x, int y);

	void stop() {
		System.out.println("멈춥니다.");
	}
}

interface Fightable2 { // 인터페이스의 모든 메서드는 public abstract임
	void move(int x, int y); // public abstract 생략됨

	void attack(Fightable2 f); // public abstract 생략됨
}

class Fighter2 extends Unit1 implements Fightable2 {
	// 오버라이딩 규칙: 조상(public)보다 접근제어자가 좁으면 안된다.
	// public 안붙이면 default이므로 안된다.
	public void move(int x, int y) {
		System.out.println("[" + x + ", " + y + "] 로 이동");
	}

	public void attack(Fightable2 f) {
		System.out.println(f + "를 공격");
	};

	// 싸울 수 있는 상대를 불러온다.
	Fightable2 getFightable() {
		Fighter2 f = new Fighter2(); // Fighter를 생성해서 반환
		return f;
	}
}

public class FighterTest1 {

	public static void main(String[] args) {
//		Fighter2 f = new Fighter2();
//		Unit1 f = new Fighter2(); // Unit1에는 attack()이 없어서 호출불가 
//		Fightable2 f = new Fighter2();
//		f.move(100, 200);
//		f.attack(new Fighter2());
		Fighter2 f = new Fighter2();

		Fightable2 f2 = f.getFightable();
	}

}
