package coding_test.programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

public class 프린터 {

	static class Document {
		int idx;
		int priority;

		public Document(int idx, int priority) {
			this.idx = idx;
			this.priority = priority;
		}
	}

	static int[] priorities1 = { 2, 1, 3, 2 };
	static int[] priorities2 = { 1, 1, 9, 1, 1, 1 };

	static int location1 = 2;
	static int location2 = 0;

	public static void main(String[] args) {

//		int[] priorities = priorities1;
		int[] priorities = priorities2;

//		int location = location1;
		int location = location2;

		System.out.println(solution(priorities, location));
	}

	private static int solution(int[] priorities, int location) {
		int answer = 1;

		Queue<Document> q = new LinkedList<>();

		for (int i = 0; i < priorities.length; i++)
			q.add(new Document(i, priorities[i]));

		label: while (!q.isEmpty()) {
			Document d = q.poll();
			boolean check = true;
			for (int i = 0; i < priorities.length; i++) {
				if (d.priority < priorities[i]) {
					q.add(d);
					check = false;
					break;
				}
			}
			if (check) {
				if (d.idx == location) {
					break label;
				}
				priorities[d.idx] = -1;
				++answer;
			}
		}
		return answer;
	}
}