package coding_test.swea.d1;

import java.util.Scanner;

public class 평균값구하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			double sum = 0;

			for (int i = 0; i < 10; i++) {
				sum += sc.nextDouble();
			}

			System.out.println("#" + tc + " " + Math.round(sum / 10));

		}
	}
}
