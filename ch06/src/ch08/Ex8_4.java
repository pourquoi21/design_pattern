package ch08;

public class Ex8_4 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
//			System.out.println(0 / 0); // 예외 발생
			System.out.println(args[0]); // ArrayIndexOutOfBoundsException이 발생할것
			System.out.println(4); // 실행되지 않는다.
		} catch (ArithmeticException ae) {
			if (ae instanceof ArithmeticException) {
				System.out.println("ArithmeticException");
			}
		} catch (NullPointerException | ArrayIndexOutOfBoundsException e) { // multi catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (Exception e) { // arithmetic외에 다른 에러가 발생했는데 이 부분을 주석처리하면 예외처리가 안되고 프로그램이 비정상 종료된다.
			System.out.println("Exception");
			// try-catch의 끝
		}
		System.out.println(6);
		// main 메서드의 끝
	}

}
