package coding_test.baekjoon.silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 그림 {

	static class Picture {
		int r;
		int c;

		public Picture(int r, int c) {
			this.r = r;
			this.c = c;
		}
	}

	static int N;
	static int M;
	static int[][] map;
	static boolean[][] visited;
	static int area = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();

		map = new int[N][M];
		visited = new boolean[N][M];
		int cnt = 0;

		for (int r = 0; r < N; r++) {
			for (int c = 0; c < M; c++) {
				map[r][c] = sc.nextInt();
			}
		}

		for (int r = 0; r < N; r++) {
			for (int c = 0; c < M; c++) {
				if (map[r][c] == 1 && !visited[r][c]) {
					cnt++;
					area = 1;
					bfs(r, c);
					max = Math.max(max, area);
				}
			}
		}

		System.out.println(cnt);
		System.out.println(max);

	}

	static int[] dr = { -1, +1, 0, 0 }; // 상, 하, 좌, 우
	static int[] dc = { 0, 0, -1, +1 };

	static int max = 0;

	private static void bfs(int r, int c) {
		Queue<Picture> q = new LinkedList<>();
		visited[r][c] = true;
		q.add(new Picture(r, c));

		while (!q.isEmpty()) {
			Picture p = q.poll();

			for (int i = 0; i < 4; i++) {
				int nr = p.r + dr[i];
				int nc = p.c + dc[i];

				if (nr < 0 || nr >= N || nc < 0 || nc >= M)
					continue;
				if (visited[nr][nc] || map[nr][nc] == 0)
					continue;

				q.add(new Picture(nr, nc));
				visited[nr][nc] = true;
				area++;
			}
		}
	}
}
