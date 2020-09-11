package coding_test.baekjoon.silver;

import java.util.Scanner;

public class N과M4 {

	static int N;
	static int M;

	static int[] sel;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();

		sel = new int[M];

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

		for (int i = 1; i <= N; i++) {
			if (s_idx != 0) {
				if (sel[s_idx - 1] <= i) {
					sel[s_idx] = i;
				} else
					continue;

			} else
				sel[s_idx] = i;

			func(s_idx + 1);
		}

	}
}
