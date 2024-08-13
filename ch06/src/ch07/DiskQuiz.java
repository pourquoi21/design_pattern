package ch07;

import java.util.PriorityQueue;

public class DiskQuiz {

	public static void main(String[] args) {
		Solution1 solution1 = new Solution1();
		int[][] jobs = { { 0, 3 }, { 1, 9 }, { 2, 6 } };
		solution1.solution(jobs);
	}
}

class Solution1 {
	public int solution(int[][] jobs) {
		int answer = 0;
		int time = 0;

		PriorityQueue<int[]> inQ = new PriorityQueue<>((o1, o2) -> o1[0] - o2[0]);
		PriorityQueue<int[]> workQ = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);

		for (int[] j : jobs) {
			inQ.offer(j);
		}

		while (!inQ.isEmpty() || !workQ.isEmpty()) {
			while (!inQ.isEmpty() && inQ.peek()[0] <= time) {
				workQ.offer(inQ.poll());
			}

			if (workQ.isEmpty()) {
				time = inQ.peek()[0];
			} else {
				int[] j = workQ.poll();
				answer += time + j[1] - j[0];
				time += j[1];
			}
		}

		answer /= jobs.length;

		System.out.println(answer);

		return answer;
	}
}
