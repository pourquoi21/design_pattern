package ch08;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		system.out.println("HELLO"); // 컴파일 에러
//		System.out.println(args[0]); // 런타임 에러

		try {
			Exception e = new Exception("고의발생");
			throw e;
			// throw new Exception("고의발생");
		} catch (Exception e) {
			System.out.println("에러메시지 : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램이 정상 종료되었음.");
	}

}
