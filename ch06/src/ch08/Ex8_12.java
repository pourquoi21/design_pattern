package ch08;

public class Ex8_12 {

	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			System.out.println("main메서드에서 예외가 처리되었습니다.");
		}
	}

	static void method1() throws Exception {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("method1메서드에서 예외가 처리되었습니다.");
			System.out.println("예외를 되던집니다.");
			throw e; // 다시 예외를 발생시킴
		}

		// chained exception
		// throwable initcause(throwable cause) - 지정한 예외를 원인 예외로 등록
		// throwable getCause() - 원인 예외를 반환
		// 여기에서 throwable은 exception과 error의 조상
		// catch에서 원인예외로 등록할 예외를 잡아준다음
		// initcause에 예외를 지정해주면 됨
		// oh
	}

}
