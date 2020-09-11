package coding_test.baekjoon.silver;

import java.util.Arrays;
import java.util.Scanner;

public class N과M8 {

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
			if (s_idx == 0) {
				sel[s_idx] = arr[i];
			} else {
				if (sel[s_idx - 1] <= arr[i]) {
					sel[s_idx] = arr[i];
				} else
					continue;
			}
			func(s_idx + 1);
		}
	}
}
