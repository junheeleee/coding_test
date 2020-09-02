package coding_test.test.ebay;

import java.util.*;

class ebay5 {

	public static void main(String[] args) {
		int[] T = { 5, 8, 3, 7, 10, 5, 4 };
		int[][] R = { { 1, 2 }, { 2, 4 }, { 1, 4 }, { 6, 5 }, { 3, 5 }, { 4, 6 } };
		int k = 5;
		System.out.println(solution(T, R, k));
	}

	static ArrayList<Node> list;

	static class Node {
		int index;
		int count;
		int beforeCount;
		ArrayList<Node> next;

		Node(int index, int count) {
			this.index = index;
			this.count = count;
			next = new ArrayList<Node>();
		}
	}

	public static int solution(int[] T, int[][] R, int k) {
		int answer = 0;

		int N = T.length;
		list = new ArrayList<Node>();
		list.add(new Node(0, 0));
		int[] beforeCount = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			list.add(new Node(i, T[i - 1]));
		}

		int relationCount = R.length;

		for (int i = 0; i < relationCount; i++) {
			list.get(R[i][0]).next.add(list.get(R[i][1]));
			beforeCount[R[i][1]]++;
		}

		Queue<Node> q = new LinkedList<Node>();
		for (int i = 1; i <= N; i++) {
			if (beforeCount[i] == 0) {
				q.add(list.get(i));
			}
		}

		while (!q.isEmpty()) {
			Node tempN = q.poll();
			for (int i = 0; i < tempN.next.size(); i++) {
				Node nextN = tempN.next.get(i);

				beforeCount[nextN.index]--;
				nextN.beforeCount = Math.max(nextN.beforeCount, (tempN.count + tempN.beforeCount));

				if (beforeCount[nextN.index] == 0) {
					q.add(nextN);
				}
			}
		}

		answer = list.get(k).count + list.get(k).beforeCount;

		return answer;
	}
}
