package ch07;

public abstract class UnitExample {
	int x, y;

	abstract void move(int x, int y);

	void stop() {
		/* 현재 위치에 정지 */}
}

class MarineEx extends UnitExample {
	void move(int x, int y) {
		/* 지정된 위치로 이동 */
	}

	void stimPack() {
	}
}

class TankEx extends UnitExample {
	void move(int x, int y) {

	}

	void changeMode() {
	}
}

class DropshipEx extends UnitExample {
	void move(int x, int y) {
	}

	void load() {
	}

	void unload() {
	}
}
