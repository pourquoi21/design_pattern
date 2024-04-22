package ch07;

import java.util.Arrays;
import java.util.EmptyStackException;

public class MyStack<E> {
	private static final int DEFAULT_CAPACITY = 6; // 최소 용량 크기
	private Object[] arr; // 요소를 담을 내부 배열
	private int top; // 스택의 가장 마지막 요소를 가리키는 포인터

	// 생성자
	public MyStack() {
		this.arr = new Object[DEFAULT_CAPACITY]; // 6 용량으로 내부 배열 생성
		this.top = -1;
	}

	public boolean isFull() {
		// 마지막 요소 위치인 top이 배열 길이 - 1 과 같은 경우 끝까지 차있는 것과 같음.
		return top == arr.length - 1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	private void resize() {
		int arr_capacity = arr.length - 1;

		if (top == arr_capacity) {
			int new_capacity = arr.length * 2;

			arr = Arrays.copyOf(arr, new_capacity);
			return;
		}

		if (top < (arr_capacity / 2)) {
			int half_capacity = arr.length / 2;

			arr = Arrays.copyOf(arr, Math.max(half_capacity, DEFAULT_CAPACITY));
			return;
		}
	}

	public E push(E value) {
		if (isFull()) {
			resize();
		}

		top++;

		arr[top] = value;

		return value;
	}

	@SuppressWarnings("unchecked")
	public E pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}

		E value = (E) arr[top];

		arr[top] = null;

		top--;

		resize();

		return value;

	}

	@SuppressWarnings("unchecked")
	public E peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}

		return (E) arr[top];
	}
}
