package ch07;

public class Shopping {

	public static void main(String[] args) {
		Buyer b = new Buyer();

		Television tv = new Television();
		Computer com = new Computer();

		// buy메서드 선언시 인자를 Product타입으로 했기에
		// 그 자손인 tv와 com을 받는 데에 문제가 없다.
		b.buy(tv);
		b.buy(com);
	}

}

class Product {
	int price; // 제품가격
	int bonusPoint; // 보너스점수
}

class Television extends Product {
}

class Computer extends Product {
}

class Audio extends Product {
}

class Buyer { // 물건사는 사람
	int money = 1000; // 소유금액
	int bonusPoint = 0; // 보너스점수

//	void buy (Television t) { // 만약 이렇게 tv타입만 받게 하면
//		money -= t.price; // 다른 가전제품을 사기 위해서
//		bonusPoint += t.bonusPoint; // overloading을 계속 해야 한다.
//	}

	// 참조형 매개변수는 메서드 호출시 자신과 같은 타입 또는 자손타입의 인스턴스를 넘겨줄 수 있다.
	void buy(Product p) {
		money -= p.price;
		bonusPoint += p.bonusPoint;
	}
}
