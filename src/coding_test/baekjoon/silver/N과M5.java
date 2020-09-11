package coding_test.baekjoon.silver;

import java.util.Arrays;
import java.util.Scanner;

public class N과M5 {

	static int N;
	static int M;
	static int[] arr;
	static int[] sel;
	static boolean[] visited;

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
	}

	private static void func(int s_idx) {
		if (s_idx == M) {
			for (int i = 0; i < M; i++)
				System.out.print(sel[i] + " ");
			System.out.println();
			return;
		}

		for (int i = 0; i < N; i++) {
			if (!visited[i]) {
				visited[i] = true;
				sel[s_idx] = arr[i];
				func(s_idx + 1);
				visited[i] = false;
			}
		}
	}
}
