package coding_test.swea.d2;

import java.util.Arrays;
import java.util.Scanner;

public class 숫자배열회전 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();

			char[][] map = new char[N][N];

			char[][] rotate90 = new char[N][N];
			char[][] rotate180 = new char[N][N];
			char[][] rotate270 = new char[N][N];

			for (int r = 0; r < N; r++) {
				for (int c = 0; c < N; c++) {
					map[r][c] = sc.next().charAt(0);
				}
			}

			for (int r = 0; r < N; r++) {
				for (int c = 0; c < N; c++) {
					rotate90[r][c] = map[N - 1 - c][r];
				}
			}

			for (int r = 0; r < N; r++) {
				for (int c = 0; c < N; c++) {
					rotate180[r][c] = rotate90[N - 1 - c][r];
				}
			}

			for (int r = 0; r < N; r++) {
				for (int c = 0; c < N; c++) {
					rotate270[r][c] = rotate180[N - 1 - c][r];
				}
			}

			System.out.println("#" + tc);

			for (int r = 0; r < N; r++) {
				for (int c = 0; c < N; c++) {
					System.out.print(rotate90[r][c]);
				}
				System.out.print(" ");
				for (int c = 0; c < N; c++) {
					System.out.print(rotate180[r][c]);
				}
				System.out.print(" ");
				for (int c = 0; c < N; c++) {
					System.out.print(rotate270[r][c]);
				}
				System.out.println();
			}

		}
	}
}
