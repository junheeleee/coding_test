package coding_test.swea.d2;

import java.util.Scanner;

public class 어디에단어가들어갈수있을까 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();

			int[][] map = new int[N][N];

			for (int r = 0; r < N; r++) {
				for (int c = 0; c < N; c++) {
					map[r][c] = sc.nextInt();
				}
			}

			int length = 1;
			int answer = 0;

			for (int r = 0; r < N; r++) {
				length = 1;
				boolean flag = false;
				for (int c = 0; c < N; c++) {
					if (map[r][c] == 1) {
						if (flag) {
							length++;
						}
						flag = true;
					} else {
						flag = false;
						if (length == K)
							answer++;
						length = 1;
					}

				}
				if (length == K)
					answer++;
			}
			
			for (int c = 0; c < N; c++) {
				length = 1;
				boolean flag = false;
				for (int r = 0; r < N; r++) {
					if (map[r][c] == 1) {
						if (flag) {
							length++;
						}
						flag = true;
					} else {
						flag = false;
						if (length == K)
							answer++;
						length = 1;
					}

				}
				if (length == K)
					answer++;
			}

			
			System.out.println("#" + tc + " " + answer);
		}
	}
}
