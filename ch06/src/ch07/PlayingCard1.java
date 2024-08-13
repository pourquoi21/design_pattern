package ch07;

public interface PlayingCard1 {
	// 아래 메서드 예시와 같이, interface의 iv들은 항상 public/static/final이다(생략됨).
	public static final int SPADE = 4;
	final int DIAMOND = 3;
	static int HEART = 2;
	int CLOVER = 1;

	public abstract String getCardNumber1();

	String getCardKind1(); // 몸통이 없다? : public abstract가 생략됨
	// interface의 메서드는 항상 public / abstract니까

	// 인터페이스는 다중상속 가능(몸통이 없으므로 충돌 문제가없음)
}
