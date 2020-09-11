package coding_test.swea.모의;

import java.util.Scanner;

public class 줄기세포배양 {

	static int N;
	static int M;
	static int K;

	static int[][] map;
	static int[][] cell;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			M = sc.nextInt();
			K = sc.nextInt();

			map = new int[N][M];
			cell = new int[N][M];

			for (int r = 0; r < N; r++) {
				for (int c = 0; c < M; c++) {
					cell[r][c] = sc.nextInt();
				}
			}
			
			for(int i = 0; i < K; i++) {
				for (int r = 0; r < N; r++) {
					for (int c = 0; c < M; c++) {
						
					}
				}
			}

		}
	}
}
