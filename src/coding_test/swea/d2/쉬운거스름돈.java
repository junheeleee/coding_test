package coding_test.swea.d2;

import java.util.Scanner;

public class 쉬운거스름돈 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();

			System.out.println("#" + tc);

			if (N >= 50000) {
				System.out.print(N / 50000 + " ");
				N %= 50000;
			} else
				System.out.print(0 + " ");
			if (N >= 10000) {
				System.out.print(N / 10000 + " ");
				N %= 10000;
			} else
				System.out.print(0 + " ");
			if (N >= 5000) {
				System.out.print(N / 5000 + " ");
				N %= 5000;
			} else
				System.out.print(0 + " ");
			if (N >= 1000) {
				System.out.print(N / 1000 + " ");
				N %= 1000;
			} else
				System.out.print(0 + " ");
			if (N >= 500) {
				System.out.print(N / 500 + " ");
				N %= 500;
			} else
				System.out.print(0 + " ");
			if (N >= 100) {
				System.out.print(N / 100 + " ");
				N %= 100;
			} else
				System.out.print(0 + " ");
			if (N >= 50) {
				System.out.print(N / 50 + " ");
				N %= 50;
			} else
				System.out.print(0 + " ");
			if (N >= 10) {
				System.out.print(N / 10 + " ");
				N %= 10;
			} else
				System.out.print(0 + " ");
			System.out.println();
		}

	}
}
