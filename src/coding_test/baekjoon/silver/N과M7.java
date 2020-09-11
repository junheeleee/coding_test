package coding_test.baekjoon.silver;

import java.util.Arrays;
import java.util.Scanner;

public class N과M7 {

	static int N;
	static int M;
	static int[] arr;
	static int[] sel;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();

		arr = new int[N];
		sel = new int[M];

		for (int idx = 0; idx < N; idx++)
			arr[idx] = sc.nextInt();

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

		for (int idx = 0; idx < N; idx++) {
			sel[s_idx] = arr[idx];
			func(s_idx + 1);
		}

	}
}
