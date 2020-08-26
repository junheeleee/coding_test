package coding_test.swea.d2;

import java.util.Scanner;

public class 두개의숫자열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {

			int N = sc.nextInt();
			int M = sc.nextInt();

			int sum = 0;
			int max = Integer.MIN_VALUE;

			int[] A = new int[N];
			int[] B = new int[M];

			for (int i = 0; i < N; i++)
				A[i] = sc.nextInt();
			for (int i = 0; i < M; i++)
				B[i] = sc.nextInt();

			if (N >= M) {
				for (int i = 0; i <= N - M; i++) {
					sum = 0;
					for (int j = 0; j < M; j++) {
						sum += A[j + i] * B[j];
					}
					max = Math.max(sum, max);
				}

			} else {
				for (int i = 0; i <= M - N; i++) {
					sum = 0;
					for (int j = 0; j < N; j++) {
						sum += B[j + i] * A[j];
					}
					max = Math.max(sum, max);
				}
			}

			System.out.println("#" + tc + " " + max);

		}
	}
}
