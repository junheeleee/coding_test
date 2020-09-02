package coding_test.baekjoon.silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 토마토 {

	static class Tomato {
		int r;
		int c;

		public Tomato(int r, int c) {
			this.r = r;
			this.c = c;
		}
	}

	static int N;
	static int M;
	static int[][] map;
	static int[][] date;
	static Queue<Tomato> q;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		M = sc.nextInt();
		N = sc.nextInt();

		map = new int[N][M];
		date = new int[N][M];
		q = new LinkedList<>();

		for (int r = 0; r < N; r++) {
			for (int c = 0; c < M; c++) {
				map[r][c] = sc.nextInt();
				if (map[r][c] == 1) {
					q.add(new Tomato(r, c));
				}
			}
		}
		bfs();
		for (int r = 0; r < N; r++) {
			for (int c = 0; c < M; c++) {
				if (map[r][c] == 0) {
					System.out.println(-1);
					return;
				}
			}
		}
		System.out.println(max);
	}

	static int[] dr = { -1, +1, 0, 0 };
	static int[] dc = { 0, 0, -1, +1 };
	static int max = 0;

	private static void bfs() {
		while (!q.isEmpty()) {
			Tomato t = q.poll();

			for (int i = 0; i < 4; i++) {
				int nr = t.r + dr[i];
				int nc = t.c + dc[i];

				if (nr < 0 || nr >= N || nc < 0 || nc >= M)
					continue;
				if (map[nr][nc] == 1 || map[nr][nc] == -1)
					continue;

				map[nr][nc] = 1;
				q.add(new Tomato(nr, nc));
				date[nr][nc] = date[t.r][t.c] + 1;
				max = Math.max(max, date[nr][nc]);
			}
		}
	}
}
