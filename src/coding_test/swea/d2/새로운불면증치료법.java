package coding_test.swea.d2;

import java.util.Scanner;

public class 새로운불면증치료법 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {

			int N = sc.nextInt();

			boolean[] arr = new boolean[10];
			int cnt = 0;
			boolean flag = false;
			int tmp = 0;

			while (!flag) {

				cnt++;
				tmp = N * cnt;

				while (tmp != 0) {
					arr[tmp % 10] = true;
					tmp /= 10;
				}

				flag = true;
				for (int i = 0; i < 10; i++) {
					if (!arr[i])
						flag = false;
				}
			}
			System.out.println("#" + tc + " " + N * cnt);
		}
	}
}
