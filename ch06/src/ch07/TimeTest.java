package ch07;

class Time {
	// 변수가 private가 아니면 외부에서 마음대로 변경할 수 있게 되어버린다.
//	int hour;
//	int minute;
//	int second;

	// private 변수
	private int hour;
	private int minute;
	private int second;

	// private변수가 있는 대신 public 메서드를 둔다.
	public void setHour(int hour) {
//		if (hour < 0 || hour > 23)
//			return;
		// 따로 뽑아낸 메서드 사용
		if (isNotValidHour(hour)) {
			return;
		}

		this.hour = hour;
	}

	public int getHour() {
		return hour;
	}

	// Time클래스 안에서만 쓰는 메서드이므로 private으로 선언해도 상관없음
	private boolean isNotValidHour(int hour) {
		return hour < 0 || hour > 23;
	}
}

public class TimeTest {
	public static void main(String[] args) {
		Time t = new Time();
		// 변수를 private으로 하면 자유롭게 아무 값이나 넣을수가 없다.
//		t.hour = 25;

		// 메서드를 통해 멤버변수의 값을 변화시킴
		t.setHour(21);

		// 메서드의 조건에 안맞는 값을 넣으면 return
		t.setHour(100);

		System.out.println(t.getHour());
	}

//	// 메서드는 public으로 한다(간접접근 허용)
//	public int getHour() {
//		return hour;
//	}
//
//	public void setHour(int hour) {
//		if (hour < 0 || hour > 23)
//			return;
//		this.hour = hour;
//	}
}
