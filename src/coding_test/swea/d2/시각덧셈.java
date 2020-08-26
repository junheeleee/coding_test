package coding_test.swea.d2;

import java.util.Scanner;

public class 시각덧셈 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int[] time1 = new int[2];
			int[] time2 = new int[2];

			int[] answer = new int[2];

			for (int i = 0; i < 2; i++)
				time1[i] = sc.nextInt();

			for (int i = 0; i < 2; i++)
				time2[i] = sc.nextInt();

			answer[1] = time1[1] + time2[1];
			answer[0] = time1[0] + time2[0];

			if (answer[1] / 60 > 0) {
				answer[0] += answer[1] / 60;
				answer[1] %= 60;
			}

			if (answer[0] > 12) {
				answer[0] -= 12;
			}

			System.out.println("#" + tc + " " + answer[0] + " " + answer[1]);
		}
	}
}
