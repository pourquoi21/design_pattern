package ch07;

abstract class Unit1 {
	int x, y;

	// abstract
	abstract void move(int x, int y);

	void stop() {
		System.out.println("멈춥니다.");
	}
}

interface Fightable2 {
	void move(int x, int y); // public abstract 생략됨
}

public class FighterTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
