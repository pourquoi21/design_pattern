package ch07;

public class TvDVD extends Television {

	// JAVA는 단일상속만을 허용하므로,
	// 비중이 높은 클래스(여기에서는 TV)하나만을 상속으로,
	// 나머지는 포함관계로 한다.
	DVD dvd = new DVD();

	void play() {
		dvd.play();
	}

	void stop() {
		dvd.stop();
	}

	void rew() {
		dvd.rew();
	}

	void ff() {
		dvd.ff();
	}
}

class Television {
	boolean power;
	int channel;

	void power() {
		power = !power;
	}

	void channelUp() {
		++channel;
	}

	void channelDown() {
		--channel;
	}

}

class DVD {
	boolean power;

	void power() {
		power = !power;
	}

	void play() {
	}

	void stop() {
	}

	void rew() {
	}

	void ff() {
	}
}