package coding_test.swea.d3;

import java.util.Scanner;

public class 규영이와인영이의카드게임 {

	static boolean[] cards;
	static int[] gyuYeong;
	static int[] arr;
	static boolean[] visited;
	static int[] inYeong;
	static int gyuWinCnt;
	static int gyuLoseCnt;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {

			cards = new boolean[19];

			gyuYeong = new int[9];
			arr = new int[9]; // 규영이 고르지 않은 카드들

			visited = new boolean[9];
			inYeong = new int[9];

			for (int i = 0; i < 9; i++) {
				gyuYeong[i] = sc.nextInt();
				cards[gyuYeong[i]] = true;
			}

			int idx = -1;
			for (int i = 1; i <= 18; i++) {
				if (!cards[i])
					arr[++idx] = i;
			}

			gyuWinCnt = 0;
			gyuLoseCnt = 0;

			func(0);

			System.out.println("#" + tc + " " + gyuWinCnt + " " + gyuLoseCnt);
		}
	}

	private static void func(int inYeongIdx) {
		if (inYeongIdx == 9) {// 누가 이겼는지 처리
			int gyuScore = 0;
			int inScore = 0;

			for (int i = 0; i < 9; i++) {
				if (gyuYeong[i] > inYeong[i])
					gyuScore += gyuYeong[i] + inYeong[i];
				else // 카드가 중복되지 않기 때문에 같을 수는 없음
					inScore += gyuYeong[i] + inYeong[i];
			}

			if (gyuScore > inScore)
				gyuWinCnt++;
			else if (gyuScore < inScore)
				gyuLoseCnt++;

			return;
		}

		for (int i = 0; i < 9; i++) {
			if (!visited[i]) {
				inYeong[inYeongIdx] = arr[i];
				visited[i] = true;
				func(inYeongIdx + 1);
				visited[i] = false;
			}
		}
	}
}
