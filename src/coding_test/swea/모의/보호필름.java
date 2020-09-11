package coding_test.swea.모의;

import java.util.Scanner;

public class 보호필름 {

	static int D;
	static int W;
	static int K;

	static int[][] map;

	static int answer;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			D = sc.nextInt();
			W = sc.nextInt();
			K = sc.nextInt();

			map = new int[D][K];

			answer = 0;

			for (int r = 0; r < D; r++) {
				for (int c = 0; c < W; c++) {
					map[r][c] = sc.nextInt();
				}
			}

			while (true) {
				boolean flag = true;
				for (int c = 0; c < W; c++) {
					
					int tmp = 0;
					for (int r = 1; r < D; r++) {
						if (map[r - 1][c] == 0) {
							if (map[r][c] == 0) {
								tmp++;
							} else {
							}
						}
					}
					flag = false;
				}
				System.out.println("#" + tc + " " + answer);
			}
		}
	}
}
