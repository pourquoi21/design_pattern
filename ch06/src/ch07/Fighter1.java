package ch07;

public class Fighter1 extends UnitExample implements Fightable1 {
	// 클래스와 인터페이스 모두 상속했음
	// 인터페이스에 정의된 추상메서드를 모두 구현해야 한다.
	public void move(int x, int y) {
	};

	@Override
	public void attack(UnitExample u) {
		System.out.println("class type");
	};

	// 인터페이스를 메서드의 리턴타입으로 지정할 수도 있다.
	// 활용은 아래에서..
	static Fightable1 method() {
		// 반환 타입은 Fightable1이지만 Fighter1를 return해도 에러안난다.
		// 왜냐하면 Fighter1는 Fightable1로 형변환 가능하기때문에.
		return new Fighter1();
	}

	public static void main(String[] args) {
		// 인터페이스일 경우에도 조상클래스로 자손객체 가리킬수있다.
		// 이럴 경우 인터페이스가 구현한 메서드만 쓸 수있다.
		Fightable1 f = new Fighter1();

		// 따라서 메서드를 이렇게 쓸 수 없다.
//		f.attack(new UnitExample());

		// 이건 된다.
		// 왜냐하면 Fightable1에 있는 attack메서드는
		// Fightable1인터페이스를 구현한 클래스의 인스턴스만을
		// 매개변수로 받는데,
		// Fighter1는 Fightable을 구현했기 때문임!
		f.attack(new Fighter1());

		// 위에 UnitExample을 받는건 왜 안되냐면..
		// interface상에서 막아놨기때문이다.
		// Unitexample에 attack메서드가 있고
		// 이것도 override해왔다면 가능하지 않을까?
		f.attack(new UnitExample());

		// 안되는 이유는 아마도 f가 Fightable1 형태로 만들어져서일 것이다.

		// 역시 아래의것은 성립한다.
		UnitExample u = new UnitExample();

		u.attack(new UnitExample());

		Fightable1 f2 = method();
		// 당연히 아래는 안된다.
		UnitExample u2 = method();
	}
	// 일부만 구현하는 경우 클래스 앞에 abstract 붙여야함.

	@Override
	public void attack(Fightable1 f) {
		System.out.println("interface type");

	}

}

interface Fightable1 {
	void move(int x, int y);

//	void attack(UnitExample u);

	void attack(Fightable1 f);
	// 인터페이스 타입 매개변수는 인터페이스를 구현한 클래스의 객체만 가능
}
