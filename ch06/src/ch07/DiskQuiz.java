package ch07;

import java.util.PriorityQueue;

public class DiskQuiz {

}

class Solution {
	public int solution(int[][] jobs) {
		int answer = 0;
		int time = 0;

		PriorityQueue<int[]> inQ = new PriorityQueue<>((o1, o2) -> o1[0] - o2[0]);
		PriorityQueue<int[]> workQ = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);

		for (int[] j : jobs) {
			inQ.offer(j);
		}

		return answer;
	}
}
