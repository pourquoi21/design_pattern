package ch08;

public class MyException extends Exception {
	private final int ERR_CODE;

	MyException(String msg) { // String을 매개변수로 받는 생성자를 넣어준다.
		super(msg);
	}

	// 예외 되던지기라는 개념도 있다.
	// 메서드 내에서 약간 처리한 다음 main에서 나머지를 처리한다든지..
}
