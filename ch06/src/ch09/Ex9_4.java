package ch09;

public class Ex9_4 {

}

class Card {
	String kind;
	int number;

	Card()_ {
		this("SPADE", 1);
	}

	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
}