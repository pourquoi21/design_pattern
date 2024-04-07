package ch07;

import java.util.Arrays;
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

		System.out.println("robMemo :: " + robMemoF(nums, 0, memo));

		return robMemoF(nums, 0, memo);
	}

	public static int robMemoF(int[] nums, int start, Map<Integer, Integer> memo) {

		int maxAmount = 0;

		if (memo.containsKey(start)) {
			return memo.get(start);
		}

		if (start >= nums.length) {
			return 0;
		} else {

			int robCurrent = nums[start] + robMemoF(nums, start + 2, memo);
			int skipCurrent = robMemoF(nums, start + 1, memo);
			maxAmount = Math.max(robCurrent, skipCurrent);
			memo.put(start, maxAmount);
		}

		return maxAmount;
	}

	public static int robBU(int[] nums) {

		if (nums == null || nums.length == 0) {
			return 0;
		}

		int n = nums.length;
		int[] dp = new int[n + 1];
		dp[0] = 0;
		dp[1] = nums[0];

		for (int i = 2; i <= n; i++) {
			dp[i] = Math.max(dp[i - 2] + nums[i - 1], dp[i - 1]);
		}

		return dp[n];
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

	public static int stairs(int n) {
		int[] oneTwo = { 1, 2 };

		for (int i = 3; i <= n; i++) {
			int tmp = oneTwo[1];

			oneTwo[1] = oneTwo[0] + oneTwo[1];
			oneTwo[0] = tmp;
		}

		System.out.println(oneTwo[0] + " " + oneTwo[1]);

		return oneTwo[1];

	}

	public static int gridSum(int[] arr) {
		int[][] costArr = new int[4][4];
		int[][] dpArr = new int[2][4];
		int result = 0;

		int index = 0;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				costArr[i][j] = arr[index++];
			}
		}

		for (int i = 0; i < 4; i++) {

			for (int m = 1; m < 3; m++) {
				if (m == 1) {
					dpArr[m - 1][0] = dpArr[m - 1][0] + costArr[m - 1][0];

					for (int k = 1; k < 4; k++) {
						dpArr[m - 1][k] = dpArr[m - 1][k - 1] + costArr[m - 1][k];

					}
				} else {
					dpArr[m - 1][0] = dpArr[m - 2][0] + costArr[m - 1][0];

					for (int n = 1; n < 4; n++) {
						dpArr[m - 1][n] = Math.min(dpArr[m - 2][n] + costArr[m - 1][n],
								dpArr[m - 1][n - 1] + costArr[m - 1][n]);
					}
				}
				dpArr[0] = dpArr[1];
				System.out.println(Arrays.toString(dpArr[0]));
				System.out.println(Arrays.toString(dpArr[1]));
			}
		}

		return dpArr[1][3];
	}

	public static int maxSubArr(int[] arr) {
		int[] dp = new int[arr.length];
		int max = arr[0];

		// 첫 번째 방법: arr배열의 index0부터 끝까지 합을 구하는 형식
		for (int i = 1; i < dp.length; i++) {
			if (dp[i - 1] + arr[i] < 0) {
				dp[i] = 0;
			} else {
				dp[i] = dp[i - 1] + arr[i];
				max = Math.max(max, dp[i]);
			}
		}

		// 두 번째 방법: arr배열 index0, index1 ... 값을 제외하여 합을 구하는 방식
		for (int j = 1; j < arr.length; j++) {

			// 이거는 잘라진 배열의 합을 계속 구해야 하는 방법이라 효율적으로 떨어질듯..
		}

		System.out.println("maxSum :: " + Arrays.toString(dp) + " maxValue :: " + max);

		return max;
	}

	public static int banana(String[] strs, String t) {

		// 아진짜짜증난다....
		int[] answer = new int[t.length() + 1];
		Arrays.fill(answer, -1);
		answer[0] = 0;

		for (int i = 1; i < t.length(); i++) {
			for (String str : strs) {
				int len = str.length();

				System.out.println("i   :: " + i);
				System.out.println("str :: " + str);
				System.out.println("len :: " + len);

				if (i - len >= 0 && t.substring(i - len, i).equals(str)) {
					if (answer[i - len] != -1) {
						if (answer[i] == -1 || answer[i] > answer[i - len] + 1) {
							answer[i] = answer[i - len] + 1; // 왜 1을 더해주는지 이해필요..
						}
					}
				}

				System.out.println("\n\n\n");
			}
		}

		return answer[t.length()];

//		int n = t.length();
//		int[] dp = new int[n + 1]; // 각 위치마다의 최소 단어 조각 수를 저장할 배열
//		Arrays.fill(dp, -1); // 초기값을 -1로 설정
//
//		dp[0] = 0; // 시작 지점의 최소 단어 조각 수는 0
//
//		for (int i = 1; i <= n; i++) {
//			for (String str : strs) {
//				int len = str.length();
//				// 현재 위치부터 이전 위치까지의 부분 문자열이 str과 같은지 확인
//				if (i - len >= 0 && t.substring(i - len, i).equals(str)) {
//					if (dp[i - len] != -1) {
//						// 이전 위치까지의 최소 단어 조각 수에 1을 더한 값 중 최소값을 업데이트
//						if (dp[i] == -1 || dp[i] > dp[i - len] + 1) {
//							dp[i] = dp[i - len] + 1;
//						}
//					}
//				}
//			}
//		}
//

//		return dp[n]; // 마지막 위치의 최소 단어 조각 수 반환
//		int[] dp = new int[banana.length() + 1]; // dp 배열 초기화
//		Arrays.fill(dp, -1); // 모든 요소를 -1로 초기화
//		dp[0] = 0; // 시작 지점
//
//		for (int i = 1; i <= banana.length(); i++) {
//			for (String str : words) {
//				if (i >= str.length() && banana.substring(i - str.length(), i).equals(str)) {
//					// 현재 위치에서 str의 길이만큼을 뺀 인덱스부터 i까지의 문자열이 str과 같은 경우
//					if (dp[i - str.length()] != -1) {
//						// 이전 위치에서 단어를 만들 수 있었다면
//						if (dp[i] == -1 || dp[i] > dp[i - str.length()] + 1) {
//							// 이전에 구한 단어 수보다 적은 경우 또는 아직 단어 수가 초기화되지 않은 경우
//							dp[i] = dp[i - str.length()] + 1; // 최소 단어 수 업데이트
//						}
//					}
//				}
//			}
//		}
//
//		return dp[banana.length()]; // 최종 결과 반환

//		int[] dp = new int[words.length + 1]; // 해당 인덱스까지 몇개의 단어조각을 이용해 단어를 만들 수 있는지 저장할 배열
//		String[] tmpArr = new String[words.length]; // 해당 회차에 사용할 단어조각을 담을 배열
//		dp[0] = -1; // 첫 번째는 -1로 두어 무조건 검사하게 한다.
//
//		for (int i = 1; i < words.length; i++) { // words배열의 요소수만큼 순회할 때
//			String copiedString = new String(banana); // 완성해야 할 String을 복사해둔다.
//			int cpLen = copiedString.length(); // 해당 String의 길이도 저장해둔다.
//			String usedWord = ""; // 사용된 단어조각을 담을 String
//			tmpArr[i - 1] = words[i - 1]; // 해당 회차에 사용할 단어조각을 추가해준다. index1부터 시작했으므로 i-1인덱스에 넣어줌
//			
//			int startIdx = i - 1; 
//			System.out.println("tmpArr when we start : " + Arrays.toString(tmpArr));
//			System.out.println("when we start, startIdx is :: " + startIdx);
//
//			if (dp[startIdx] == -1) { // 전 회차의 tmpArr요소로 단어를 만들 수 없었다면
//				while (startIdx >= 1) {
//					startIdx--; // start지점을 앞으로 당긴다.
//				}
//
////				System.out.println("startIdx ::: " + startIdx);
////				System.out.println("tmpArr[startIdx] :: " + tmpArr[startIdx]);
////				System.out.println("tmpArr when we start : " + Arrays.toString(tmpArr));
//
//				for (int j = startIdx; tmpArr[j] != null;) {
////					System.out.println("startIdx :: " + startIdx);
////					System.out.println(copiedString.substring(j, j + tmpArr[j].length()));
//					if ((copiedString.substring(j, j + tmpArr[j].length()).equals(tmpArr[j]))) {
////						System.out.println("tmpArr[j].length() :: " + tmpArr[j].length());
//						System.out.println("tmpArr[j] :: " + tmpArr[j]);
//						usedWord += tmpArr[j] + " ";
//						cpLen -= tmpArr[j].length();
//						j += tmpArr[j].length();
//						System.out.println("j:: " + j + ", dp[i - 1] :: " + dp[j]);
//
//						System.out.println("usedWord :: " + usedWord);
//
////						dp[j]++;
//					}
//				}
//
//				System.out.println("cpLen ::: " + cpLen);
//
//				if (cpLen != 0) {
//					System.out.println("invalid");
//
//					dp[i] = -1;
//				} else {
//					String[] valid = usedWord.trim().split("\\s+");
//
//					System.out.println("가넝한? " + usedWord + " " + Arrays.toString(valid));
//					dp[i] = valid.length;
////					int notNull = 0;
////					for (String tmp : tmpArr) {
////						if (tmp != null) {
////							notNull++;
////						}
////					}
////
////					dp[i] = notNull;
//					System.out.println("dpArr? " + Arrays.toString(dp));
//				}
//
//			} else {
//				System.out.println("이전에 가능했음!");
//				System.out.println("tmpArr now? " + tmpArr[startIdx]);
//				System.out.println("startIndex now ? " + startIdx);
//				System.out.println("copiedStr now? " + copiedString);
//				if (!copiedString.equals(tmpArr[startIdx])) {
//					
//				}
//			}
//			System.out.println("\n\n\n");
//
//		}
//
//		return 0;
	}

//주어진 문자열이 strs 배열에 포함되는지 확인하는 메서드
	public static boolean contains(String[] strs, String s) {
		for (String str : strs) {
			if (str.equals(s)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Solution s = new Solution();

		int[] robArr = { 1, 2, 3, 1 };
		int[] gridArr = { 1, 3, 1, 2, 2, 4, 5, 2, 2, 4, 5, 6, 1, 5, 6, 2 };
		int[] intArr = { -2, 1, -3, 4, -1, 2 };
		String[] bananaArr = { "app", "ap", "p", "l", "e", "ple", "pp" };
		String banana = "apple";

//		s.fib(1000);
//		s.fillRectangle(5);
//		s.rob(robArr);
//		s.robMemo(robArr);
//		s.robBU(robArr);
//		s.robEdit(robArr);
//		s.stairs(5);
//		s.gridSum(gridArr);
//		s.maxSubArr(intArr);
		s.banana(bananaArr, banana);
		System.out.println(s.banana(bananaArr, banana));

	}

}
