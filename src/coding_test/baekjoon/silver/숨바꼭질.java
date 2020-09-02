package coding_test.baekjoon.silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 숨바꼭질 {

	static boolean[] visited = new boolean[100001];
	static int N;
	static int K;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		K = sc.nextInt();

		bfs();
	}

	static class Subin {
		int position;
		int time;

		public Subin(int position, int time) {
			this.position = position;
			this.time = time;
		}
	}

	private static void bfs() {
		Queue<Subin> q = new LinkedList<>();
		q.add(new Subin(N, 0));
		visited[N] = true;

		while (!q.isEmpty()) {
			Subin subin = q.poll();

			if (subin.position == K) {
				System.out.println(subin.time);
				break;
			}

			int movedSubin = 0;
			movedSubin = subin.position - 1;
			if (movedSubin >= 0 && movedSubin <= 100000 && !visited[movedSubin]) {
				q.add(new Subin(movedSubin, subin.time + 1));
				visited[movedSubin] = true;
			}

			movedSubin = subin.position + 1;
			if (movedSubin >= 0 && movedSubin <= 100000 && !visited[movedSubin]) {
				q.add(new Subin(movedSubin, subin.time + 1));
				visited[movedSubin] = true;
			}

			movedSubin = subin.position * 2;
			if (movedSubin >= 0 && movedSubin <= 100000 && !visited[movedSubin]) {
				q.add(new Subin(movedSubin, subin.time + 1));
				visited[movedSubin] = true;
			}

		}
	}
}
