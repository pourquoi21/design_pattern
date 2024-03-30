package ch07;

public class Solution {

	public static int fib(int number) {
		if (number == 1) {
			return 0;
		} else if (number == 2) {
			return 1;
		}

		int[] fibArr = { 0, 1 };
		int tmp = 0;

		for (int i = 2; i <= number; i++) {
			tmp = fibArr[0] + fibArr[1];

			fibArr[0] = fibArr[1];
			fibArr[1] = tmp;
//			System.out.println("i :: " + i + " fibArr :: [" + fibArr[0] + ", " + fibArr[1] + "] tmp:: " + tmp);
		}

		System.out.println("answer :: " + tmp);
		return tmp;
	}

	public static int fillRectangle(int n) {
		if (n == 1) {
			return 1;
		} else if (n == 2) {
			return 2;
		}

		int[] recArr = { 1, 2 };
		int tmp = 0;

		for (int i = 3; i <= n; i++) {
			tmp = recArr[0] + recArr[1];

			recArr[0] = recArr[0] + recArr[1];
			recArr[1] = tmp;
		}
		System.out.println("result :: " + tmp);

		return tmp;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		s.fib(1000);

		s.fillRectangle(5);

	}

}
