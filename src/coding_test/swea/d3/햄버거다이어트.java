package coding_test.swea.d3;

import java.util.Scanner;

public class 햄버거다이어트 {

	static int N;
	static int L;
	static int[] scores;
	static int[] calories;
	static int max;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			L = sc.nextInt();

			scores = new int[N];
			calories = new int[N];

			for (int i = 0; i < N; i++) {
				scores[i] = sc.nextInt();
				calories[i] = sc.nextInt();
			}

			max = Integer.MIN_VALUE;

			func(0, 0, 0);

			System.out.println("#" + tc + " " + max);
		}
	}

	private static void func(int idx, int score, int calory) {
		if (calory > L)
			return;

		if (idx == N) {
			max = Math.max(score, max);
			return;
		}

		func(idx + 1, score + scores[idx], calory + calories[idx]);
		func(idx + 1, score, calory);

	}
}
