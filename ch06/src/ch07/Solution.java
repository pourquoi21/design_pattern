package ch07;

import java.util.HashMap;
import java.util.Map;

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

	public static int rob(int[] nums) {

		System.out.println("robF :: " + robF(nums, 0));
		return robF(nums, 0);

	}

	public static int robF(int[] nums, int start) {
		if (start >= nums.length) {
			return 0;
		}

		return Math.max(nums[start] + robF(nums, start + 2), robF(nums, start + 1));
	}

	public static int robMemo(int[] nums) {
		Map<Integer, Integer> memo = new HashMap<>();

		return robMemoF(nums, 0, memo);

	}

	public static int robMemoF(int[] nums, int start, Map<Integer, Integer> memo) {

		if (memo.containsKey(start)) {
			return memo.get(start);
		}

		if (start >= nums.length) {
			memo.put(start, 0);
		} else {
			int result = Math.max(nums[start] + robMemoF(nums, start + 2, memo), robMemoF(nums, start + 1, memo));
			memo.put(start, result);
		}

		return memo.get(start);
	}

	public static int robBU(int[] nums) {
		System.out.println(robBUF(nums, 0));

		return robBUF(nums, 0);
	}

	public static int robBUF(int[] nums, int start) {
		int[] dp = new int[nums.length + 1];

		dp[0] = 0;
		dp[1] = nums[0];

		for (int i = 2; i < dp.length; i++) {
			dp[i] = Math.max(nums[i - 1] + dp[i - 2], dp[i - 1]);
		}

		return dp[dp.length - 1];
	}

	public static int robEdit(int[] nums) {
		int[] dp = { 0, 0 };

		for (int i = 1; i < nums.length; i++) {
			int tmp = dp[0];

			dp[1] = Math.max(nums[i - 1] + dp[0], dp[1]);
			dp[0] = tmp;

		}
		return dp[1];
	}

	public static boolean wordDict(String s, String[] wordDict) {

		String[] memo = {};

		return true;
	}

	public static void main(String[] args) {
		Solution s = new Solution();

		int[] robArr = { 1, 2, 3, 1 };

		s.fib(1000);

		s.fillRectangle(5);

		s.rob(robArr);

		s.robMemo(robArr);

		s.robBU(robArr);

		s.robEdit(robArr);

	}

}
