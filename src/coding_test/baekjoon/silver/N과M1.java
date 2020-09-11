package coding_test.baekjoon.silver;

import java.util.Scanner;

public class N과M1 {

	static boolean[] visited;
	static int[] sel;
	static int N;
	static int M;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();

		visited = new boolean[N + 1];
		sel = new int[M];

		func(0);
	}

	private static void func(int s_idx) {
		if (s_idx == M) {
			for (int i = 0; i < M; i++) {
				System.out.print(sel[i] + " ");
			}
			System.out.println();
			return;
		}

		for (int i = 1; i <= N; i++) {
			if (!visited[i]) {
				sel[s_idx] = i;
				visited[i] = true;
				func(s_idx + 1);
				visited[i] = false;
			}
		}
	}
}
