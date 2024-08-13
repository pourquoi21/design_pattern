package ch08;

public class ExceptionExample {
	static void startInstall() throws SpaceException, MemoryException // 스스로 처리할 수 없는 예외는 떠넘긴다.
	{
		if (!enoughSpace()) {
			throw new SpaceException("설치할 공간이 부족합니다.");
		}

		if (!enoughMemory()) {
			throw new MemoryException("메모리가 부족합니다.");
		}
	}
}
