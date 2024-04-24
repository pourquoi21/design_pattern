package datastructure.list.linkedlist.implementation;

public class LinkedList {
	// 첫번째 노드를 가리키는 필드
	private Node head;
	private Node tail;
	private int size = 0;

	private class Node {
		// 데이터가 저장될 필드
		public Object data;
		// 다음 노드를 가리키는 필드
		public Node next;

		public Node(Object input) {
			this.data = input;
			this.next = null;
		}
	}
}
