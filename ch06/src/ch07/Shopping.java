package ch07;

public class Shopping {

	public static void main(String[] args) {
		Buyer b = new Buyer();

		Tv1 tv = new Tv1();
		Computer com = new Computer();

		// buy메서드 선언시 인자를 Product타입으로 했기에
		// 그 자손인 tv와 com을 받는 데에 문제가 없다.
//		b.buy(tv);
//		b.buy(com);

		// 이렇게 해도 된다!
		b.buy(new Tv1());
		b.buy(new Computer());

		// 위의 구문은 이것을 한줄로 줄인 것이다.
//		Product p = new Tv1();
//		b.buy(p);

		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		System.out.println("현재 마일리지는 " + b.bonusPoint + "입니다.");

		Product p1 = new Tv1();
		Product p2 = new Computer();
		Product p3 = new Audio();

		Product p[] = new Product[3];
		p[0] = new Tv1();
		p[1] = new Computer();
		p[2] = new Audio();
	}

}

class Product {
	int price; // 제품가격
	int bonusPoint; // 보너스점수

	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0); // 보너스점수는 제품가격의 10%
	}
}

class Tv1 extends Product {
	Tv1() {
		// 조상클래스의 생성자 Product(int price)를 호출한다.
		super(100); // Tv의 가격을 100만원으로 한다.
	}

	// Object클래스의 toString()을 오버라이딩한다.
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio() {
		super(150);
	}

	public String toString() {
		return "Audio";
	}
}

class Buyer { // 물건사는 사람
	int money = 1000; // 소유금액
	int bonusPoint = 0; // 보너스점수

//	void buy (Television t) { // 만약 이렇게 tv타입만 받게 하면
//		money -= t.price; // 다른 가전제품을 사기 위해서
//		bonusPoint += t.bonusPoint; // overloading을 계속 해야 한다.
//	}
	// 다형성 덕분에 하나의 배열에 여러가지 객체 담을수 있다.
	Product[] cart = new Product[10];

	int i = 0;

	// 참조형 매개변수는 메서드 호출시 자신과 같은 타입 또는 자손타입의 인스턴스를 넘겨줄 수 있다.
	void buy(Product p) {

		if (money < p.price) {
			System.out.println("잔액이 부족하여 구입할 수 없습니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p; // 카트의 다음 칸에 다음 상품을 저장하기 위해 i++을 하다니..

		// 참조변수와 문자열 결합할 때는 변수.toString()써야 하는데 우리는 이미 선언해주었음
		System.out.println(p + "을/를 구입하셨습니다.");

	}
}
