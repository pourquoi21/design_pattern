package ch08;

public class MyException extends Exception {
	private final int ERR_CODE;

	MyException(String msg) {
		super(msg);
	}
}
