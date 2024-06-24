package ch08;

public class ExceptionExample {
	static void startInstall() throws SpaceException, MemoryException {
		if (!enoughSpace()) {
			throw new SpaceException("설치할 공간이 부족합니다.");
		}

		if (!enoughMemory()) {
			throw new MemoryException("메모리가 부족합니다.");
		}
	}
}
