package coding_test.swea.d1;

import java.util.Scanner;

public class 홀수만더하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int sum = 0;
			for (int i = 0; i < 10; i++) {
				int num = sc.nextInt();
				if (num % 2 == 1)
					sum += num;
			}
			System.out.println("#" + tc + " " + sum);
		}
	}
}
