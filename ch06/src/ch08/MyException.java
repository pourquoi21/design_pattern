package ch08;

public class MyException extends Exception {
	private final int ERR_CODE;

	MyException(String msg) { // String을 매개변수로 받는 생성자를 넣어준다.
		super(msg);
	}
}
