package coding_test.swea.d4;

import java.util.Scanner;

public class 수지의수지맞는여행 {

	static char[][] map;
	static boolean[] visited;
	static int R;
	static int C;
	static int max;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			R = sc.nextInt();
			C = sc.nextInt();

			map = new char[R][C];
			visited = new boolean[26];

			max = Integer.MIN_VALUE;

			for (int r = 0; r < R; r++) {
				String s = sc.next();
				for (int c = 0; c < C; c++) {
					map[r][c] = s.charAt(c);
				}
			}
			visited[map[0][0] - 'A'] = true;
			dfs(0, 0, 1);
			System.out.println("#" + tc + " " + max);
		}
	}

	static int[] dr = { -1, +1, 0, 0 };
	static int[] dc = { 0, 0, -1, +1 };

	private static void dfs(int r, int c, int cnt) {
		max = Math.max(cnt, max);
		for (int i = 0; i < 4; i++) {
			int nr = r + dr[i];
			int nc = c + dc[i];

			if (nr >= R || nr < 0 || nc >= C || nc < 0 || visited[map[nr][nc] - 'A'])
				continue;
			
			visited[map[nr][nc] - 'A'] = true;
			dfs(nr, nc, cnt + 1);
			visited[map[nr][nc] - 'A'] = false;
		}
	}
}
