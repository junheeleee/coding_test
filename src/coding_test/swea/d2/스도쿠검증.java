package coding_test.swea.d2;

import java.util.Scanner;

public class 스도쿠검증 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		label: for (int tc = 1; tc <= T; tc++) {
			int[][] map = new int[9][9];

			for (int r = 0; r < 9; r++) {
				for (int c = 0; c < 9; c++) {
					map[r][c] = sc.nextInt();
				}
			}

			boolean[] num;

			System.out.print("#" + tc + " ");

			// 가로 검증
			for (int r = 0; r < 9; r++) {
				num = new boolean[10];
				for (int c = 0; c < 9; c++) {
					if (num[map[r][c]]) {
						System.out.println(0);
						continue label;
					}
					num[map[r][c]] = true;
				}
			}
			// 세로 검증
			for (int c = 0; c < 9; c++) {
				num = new boolean[10];
				for (int r = 0; r < 9; r++) {
					if (num[map[r][c]]) {
						System.out.println(0);
						continue label;
					}
					num[map[r][c]] = true;
				}
			}
			// 격자 검증
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					num = new boolean[10];
					for (int r = 0; r < 3; r++) {
						for (int c = 0; c < 3; c++) {
							if (num[map[r + i * 3][c + j * 3]]) {
								System.out.println(0);
								continue label;
							}
							num[map[r + i * 3][c + j * 3]] = true;
						}
					}
				}
			}
			System.out.println(1);
		}
	}
}
