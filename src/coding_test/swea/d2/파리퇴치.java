package coding_test.swea.d2;

import java.util.Scanner;

public class 파리퇴치 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();

			int[][] map = new int[N][N];

			for (int r = 0; r < N; r++) {
				for (int c = 0; c < N; c++) {
					map[r][c] = sc.nextInt();
				}
			}

			int cnt = 0;
			int max = Integer.MIN_VALUE;

			for (int r = 0; r < N - M + 1; r++) {
				for (int c = 0; c < N - M + 1; c++) {
					cnt = 0;
					for (int i = r; i < r + M; i++) {
						for (int j = c; j < c + M; j++) {
							cnt += map[i][j];
						}
					}
					max = Math.max(cnt, max);
				}
			}

			System.out.println("#" + tc + " " + max);

		}
	}
}
