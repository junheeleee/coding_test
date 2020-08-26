package coding_test.swea.d2;

import java.util.Scanner;

public class 날짜계산기 {

	static int[] arr = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int monthA = sc.nextInt();
			int dateA = sc.nextInt();

			int monthB = sc.nextInt();
			int dateB = sc.nextInt();

			int answer = 0;

			if (monthA == monthB) {
				answer = dateB - dateA;
			} else {
				answer = arr[monthA] - dateA;

				for (int i = monthA + 1; i < monthB; i++) {
					answer += arr[i];
				}
				answer += dateB;
			}
			answer += 1;
			System.out.println("#" + tc + " " + answer);
		}
	}
}
