package coding_test.swea.d2;

import java.util.Scanner;

public class 파스칼의삼각형 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();

			int[][] map = new int[N][N];

			for (int i = 0; i < N; i++) {
				map[i][0] = 1;
				map[i][i] = 1;
			}

			for (int r = 0; r < N; r++) {
				for (int c = 0; c <= r; c++) {
					if (map[r][c] == 0)
						map[r][c] = map[r - 1][c] + map[r - 1][c - 1];
				}
			}

			System.out.println("#" + tc);

			for (int r = 0; r < N; r++) {
				for (int c = 0; c <= r; c++) {
					System.out.print(map[r][c] + " ");
				}
				System.out.println();
			}

		}
	}
}
