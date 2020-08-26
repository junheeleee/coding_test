package coding_test.swea.d2;

import java.util.Scanner;

public class 백만장자프로젝트 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int[] price = new int[N];

			long answer = 0;

			for (int i = 0; i < N; i++)
				price[i] = sc.nextInt();

			int max = price[N - 1];

			for (int i = N - 2; i >= 0; i--) {
				if (max < price[i])
					max = price[i];
				else
					answer += max - price[i];
			}

			System.out.println("#" + tc + " " + answer);
		}
	}
}
