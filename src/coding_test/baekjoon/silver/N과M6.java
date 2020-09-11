package coding_test.baekjoon.silver;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class N과M6 {

	static int N;
	static int M;
	static int[] arr;
	static int[] sel;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();

		arr = new int[N];
		sel = new int[M];

		for(int i = 0; i < N; i++)
			arr[i] = sc.nextInt();
		
		Arrays.sort(arr);

		func(0, 0);
	}

	private static void func(int idx, int s_idx) {
		if (s_idx == M) {
			for (int i = 0; i < M; i++)
				System.out.print(sel[i] + " ");
			System.out.println();
			return;
		}
		if (idx == N)
			return;

		sel[s_idx] = arr[idx];

		func(idx + 1, s_idx + 1);
		func(idx + 1, s_idx);

	}
}
