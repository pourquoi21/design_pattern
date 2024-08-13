package ch08;

import java.io.File;
import java.io.IOException;

public class Ex8_10 {

	public static void main(String[] args) {
		File f = createFile("");
		System.out.println(f.getName() + "파일 성공적으로 생성됨");
	}
	// args를 설정해주려면 run configuration에서 argument 적어준다.

	static File createFile(String fileName) {
		try {
			if (fileName == null || fileName.equals("")) {
				throw new Exception("유효하지 않은 파일명입니다.");
			}
		} catch (Exception e) {
			fileName = "noname.txt";
		}

		File f = new File(fileName);
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("finally block은 예외의 발생여부에 관계없이 항상 수행된다.");
		}
		return f;
	}

}
