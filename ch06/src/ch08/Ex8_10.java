package ch08;

import java.io.*;

public class Ex8_10 {

	public static void main(String[] args) {
		try {
			File f = createFile(args[0]);
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
