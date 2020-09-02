package coding_test.baekjoon.silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 미로탐색 {

	static class Maze {
		int r;
		int c;
		int distance;

		public Maze(int r, int c, int distance) {
			this.r = r;
			this.c = c;
			this.distance = distance;
		}
	}

	static int N;
	static int M;
	static char[][] map;
	static boolean[][] visited;
	static int answer = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();

		map = new char[N][M];
		visited = new boolean[N][M];

		for (int r = 0; r < N; r++) {
			String s = sc.next();
			for (int c = 0; c < M; c++) {
				map[r][c] = s.charAt(c);
			}
		}
		bfs(0, 0, 1);

		System.out.println(answer);
	}

	static int[] dr = { -1, +1, 0, 0 };
	static int[] dc = { 0, 0, -1, +1 };

	private static void bfs(int r, int c, int distance) {
		Queue<Maze> q = new LinkedList<>();
		q.add(new Maze(r, c, distance));
		visited[r][c] = true;

		while (!q.isEmpty()) {
			Maze m = q.poll();

			if (m.r == N - 1 && m.c == M - 1) {
				answer = m.distance;
				break;
			}

			for (int i = 0; i < 4; i++) {
				int nr = m.r + dr[i];
				int nc = m.c + dc[i];

				if (nr < 0 || nr >= N || nc < 0 || nc >= M)
					continue;
				if (visited[nr][nc] || map[nr][nc] == '0')
					continue;

				q.add(new Maze(nr, nc, m.distance + 1));
				visited[nr][nc] = true;
			}
		}
	}
}
