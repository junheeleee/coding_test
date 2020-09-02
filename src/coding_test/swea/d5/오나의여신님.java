package coding_test.swea.d5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 오나의여신님 {

	static class Suyeon {
		int r;
		int c;
		int time;

		public Suyeon(int r, int c, int time) {
			this.r = r;
			this.c = c;
			this.time = time;
		}
	}

	static class Devil {
		int r;
		int c;

		public Devil(int r, int c) {
			this.r = r;
			this.c = c;
		}
	}

	static int N;
	static int M;

	static Queue<Suyeon> queueSuyeon;
	static boolean[][] visitedSuyeon;
	static char[][] map;

	static Queue<Devil> queueDevil;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			M = sc.nextInt();

			queueSuyeon = new LinkedList<>();
			queueDevil = new LinkedList<>();

			map = new char[N][M];
			visitedSuyeon = new boolean[N][M];

			for (int r = 0; r < N; r++) {
				String s = sc.next();
				for (int c = 0; c < M; c++) {
					map[r][c] = s.charAt(c);
					if (map[r][c] == 'S') {
						queueSuyeon.add(new Suyeon(r, c, 0));
						visitedSuyeon[r][c] = true;
						map[r][c] = '.';
					} else if (map[r][c] == '*')
						queueDevil.add(new Devil(r, c));
				}
			}
			System.out.print("#" + tc + " ");
			bfs();
		}
	}

	static int[] dr = { -1, +1, 0, 0 };
	static int[] dc = { 0, 0, -1, +1 };

	private static void bfs() {
		while (!queueSuyeon.isEmpty()) {
			if (!queueDevil.isEmpty())
				updateDevil();
			int size = queueSuyeon.size();
			for (int i = 0; i < size; i++) {
				Suyeon s = queueSuyeon.poll();

				for (int dir = 0; dir < 4; dir++) {
					int nr = s.r + dr[dir];
					int nc = s.c + dc[dir];

					if (nr < 0 || nr >= N || nc < 0 || nc >= M)
						continue;
					if (map[nr][nc] == 'X' || map[nr][nc] == '*' || visitedSuyeon[nr][nc])
						continue;
					if (map[nr][nc] == 'D') {
						System.out.println(s.time + 1);
						return;
					}
					queueSuyeon.add(new Suyeon(nr, nc, s.time + 1));
					visitedSuyeon[nr][nc] = true;
				}
			}
		}
		System.out.println("GAME OVER");
	}

	private static void updateDevil() {
		int size = queueDevil.size();

		for (int i = 0; i < size; i++) {
			Devil d = queueDevil.poll();

			for (int dir = 0; dir < 4; dir++) {
				int nr = d.r + dr[dir];
				int nc = d.c + dc[dir];

				if (nr < 0 || nr >= N || nc < 0 || nc >= M)
					continue;
				if (map[nr][nc] == 'X' || map[nr][nc] == '*' || map[nr][nc] == 'D')
					continue;

				queueDevil.add(new Devil(nr, nc));
				map[nr][nc] = '*';
			}
		}

	}
}
