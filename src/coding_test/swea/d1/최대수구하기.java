package coding_test.swea.d1;

import java.util.Scanner;

public class 최대수구하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {

			int max = Integer.MIN_VALUE;

			for (int i = 0; i < 10; i++) {
				max = Math.max(max, sc.nextInt());
			}
			System.out.println("#" + tc + " " + max);
		}
	}
}