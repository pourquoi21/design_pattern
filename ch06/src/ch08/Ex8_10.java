package ch08;

import java.io.File;

public class Ex8_10 {

	public static void main(String[] args) {
		try {
			File f = createFile(args[0]);
			System.out.println(f.getName() + "파일 성공적으로 생성됨");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " 다시 입력해 주시기 바랍니다.");
		}
	}

	static File createFile(String fileName) throws Exception {
		if (fileName == null || fileName.equals("")) {
			throw new Exception("유효하지 않은 파일명입니다.");
		}
		File f = new File(fileName);
		f.createNewFile();
		return f;
	}

}
