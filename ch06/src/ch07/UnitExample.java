package ch07;

public abstract class UnitExample {
	int x, y;

	abstract void move(int x, int y);

	void stop() {
		/* 현재 위치에 정지 */}
}

class MarineEx extends UnitExample {
	void move(int x, int y) {
	}

	void stimPack() {
	}
}
