package ch09;

public class Ex9_4 {
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();

		System.out.println(c1.toString()); // 이건 별로 도움이 안된다.
		System.out.println(c2.toString());
	}
}

class Card {
	String kind;
	int number;

	Card() {
		this("SPADE", 1);
	}

	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	// Object클래스의 toString()을 오버라이딩
	public String toString() {
		return "kind: " + kind + " number: " + number;
	}
}