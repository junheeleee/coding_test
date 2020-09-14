package coding_test.test.kakao200912;

public class kakao6 {

	static int[][] board = { { 1, 0, 0, 3 }, { 2, 0, 0, 0 }, { 0, 0, 0, 2 }, { 3, 0, 1, 0 } };
	static int r = 1;
	static int c = 0;
	static int answer = Integer.MAX_VALUE;
	static int cardCnt = 0;

	public static void main(String[] args) {
		System.out.println(solution(board, r, c));
	}

	private static int solution(int[][] board, int r, int c) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (board[i][j] != 0)
					cardCnt++;
			}
		}
		dfs(r, c, 0);
		return answer;
	}

	private static void dfs(int r, int c, int cnt) {
		if(cardCnt == 0) {
			answer = Math.min(answer, cnt);
		}
		
		
	}
}
