
public class MyChar {
	char ch;

	public MyChar(char ch) {
		this.ch = ch;
	}

	public boolean isVowel() {
		boolean result = ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E'
				|| ch == 'I' || ch == 'O' || ch == 'U';
		return result;
	}

	public boolean isConsonant() {
		if (isAlphabet() && !isVowel())
			return true;
		return false;
	}

	public boolean isDigit() {
		boolean result = (48 <= (int) ch && (int) ch <= 57);
		return result;
	}

	public boolean isAlphabet() {

		if (65 <= (int) ch && (int) ch <= 90)
			return true;
		if (97 <= (int) ch && (int) ch <= 122)
			return true;

		return false;
	}

	public static void printLowerCaseAlpabets() {
		// 'a' to 'z'
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);
		}
	}

	public static void printUpperCaseAlpabets() {
		for (char ch = 'A'; ch <= 90; ch++) {
			System.out.println(ch);
		}
	}

}
