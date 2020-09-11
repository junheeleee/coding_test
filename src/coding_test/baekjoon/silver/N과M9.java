package coding_test.baekjoon.silver;

import java.util.Arrays;
import java.util.Scanner;

public class N과M9 {

	static int N;
	static int M;
	static int[] arr;
	static int[] sel;
	static boolean[] visited;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();

		arr = new int[N];
		sel = new int[M];
		visited = new boolean[N];

		for (int i = 0; i < N; i++)
			arr[i] = sc.nextInt();

		Arrays.sort(arr);

		func(0);

		System.out.println(sb.toString());

	}

	private static void func(int s_idx) {
		if (s_idx == M) {
			for (int i = 0; i < M; i++)
				sb.append(sel[i] + " ");
			sb.append("\n");
			return;
		}

		for (int i = 0; i < N; i++) {
			if (!visited[i]) {
				sel[s_idx] = arr[i];
				visited[i] = true;
				func(s_idx + 1);
				visited[i] = false;
			}
		}

	}
}
