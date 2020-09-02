package coding_test.baekjoon.silver;

import java.util.Scanner;

public class Z {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int r = sc.nextInt();
		int c = sc.nextInt();

		System.out.println(func(N, r, c));
	}

	private static int func(int n, int r, int c) {
		if (n == 0)
			return 0;

		int half = 1 << (n - 1);

		if (r < half && c < half) // (r, c)가 1번 사각형일 때
			return func(n - 1, r, c);

		if (r < half && c >= half) // (r, c)가 2번 사각형일 때
			return half * half + func(n - 1, r, c - half);

		if (r >= half && c < half) // (r, c)가 3번 사각형일 때
			return 2 * half * half + func(n - 1, r - half, c);

		return 3 * half * half + func(n - 1, r - half, c - half); // (r, c)가 4번 사각형일 때
	}
}
