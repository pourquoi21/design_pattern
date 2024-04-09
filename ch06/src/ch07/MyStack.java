package ch07;

public class MyStack<E> {
	private static final int DEFAULT_CAPACITY = 6;
	private Object[] arr;
	private int top;

	// 생성자
	public MyStack() {
		this.arr = new Object[DEFAULT_CAPACITY];
		this.top = -1;
	}
}
