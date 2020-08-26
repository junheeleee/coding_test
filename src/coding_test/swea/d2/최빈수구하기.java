package coding_test.swea.d2;

import java.util.Scanner;

public class 최빈수구하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			sc.nextInt();
			int[] score = new int[101];
			int max = Integer.MIN_VALUE;

			int answer = 0;

			for (int i = 0; i < 1000; i++)
				score[sc.nextInt()]++;
			for (int i = 100; i >= 0; i--) {
				if (max < score[i]) {
					max = score[i];
					answer = i;
				}
			}

			System.out.println("#" + tc + " " + answer);
		}
	}
}
