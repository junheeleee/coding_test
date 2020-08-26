package coding_test.swea.d2;

import java.util.Scanner;

public class 달팽이숫자 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		int[] dr = { 0, +1, 0, -1 }; // 우, 하, 좌, 상
		int[] dc = { +1, 0, -1, 0 }; // 우, 하, 좌, 상

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();

			System.out.println("#" + tc);

			int[][] map = new int[N][N];

			int r = 0;
			int c = 0;
			int dir = 0;

			map[0][0] = 1;

			for (int i = 2; i <= N * N; i++) {
				int nr = r + dr[dir];
				int nc = c + dc[dir];

				if (nr < 0 || nr >= N || nc < 0 || nc >= N || map[nr][nc] != 0) {
					dir++;
					dir %= 4;
					nr = r + dr[dir];
					nc = c + dc[dir];
				}
				map[nr][nc] = i;
				r = nr;
				c = nc;
			}

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					System.out.print(map[i][j] + " ");
				}
				System.out.println();
			}

		}
	}
}
