package ch08;

public class Ex8_7 {

	public static void main(String[] args) {
		try {
			throw new Exception();
		} catch (Exception e) {
			// 예외를 메서드에 선언할 때는 throws를 쓰지만
			// 예외를 발생시킬 때는 throw
			throw new RuntimeException();
		} finally {
		}
	}

}
